package es.uma.informatica.sii.ejb.practica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import es.uma.informatica.sii.ejb.practica.ejb.GestionLotes;
import es.uma.informatica.sii.ejb.practica.ejb.GestionProductos;
import es.uma.informatica.sii.ejb.practica.ejb.exceptions.IngredientesIncorrectosException;
import es.uma.informatica.sii.ejb.practica.ejb.exceptions.LoteExistenteException;
import es.uma.informatica.sii.ejb.practica.ejb.exceptions.LoteNoEncontradoException;
import es.uma.informatica.sii.ejb.practica.ejb.exceptions.ProductoNoEncontradoException;
import es.uma.informatica.sii.ejb.practica.ejb.exceptions.TrazabilidadException;
import es.uma.informatica.sii.ejb.practica.entidades.Grupo;
import es.uma.informatica.sii.ejb.practica.entidades.Ingrediente;
import es.uma.informatica.sii.ejb.practica.entidades.Lote;
import es.uma.informatica.sii.ejb.practica.entidades.Producto;

public class SampleTest {
	
	private static final Logger LOG = Logger.getLogger(SampleTest.class.getCanonicalName());

	private static final String GRUPOS_EJB = "java:global/classes/GruposEJB";
	private static final String GLASSFISH_CONFIGI_FILE_PROPERTY = "org.glassfish.ejb.embedded.glassfish.configuration.file";
	private static final String CONFIG_FILE = "target/test-classes/META-INF/domain.xml";
	private static final String UNIDAD_PERSITENCIA_PRUEBAS = "TrazabilidadTest";
	
	private static EJBContainer ejbContainer;
	private static Context ctx;
	
	private Grupo grupo;
	
	@BeforeClass
	public static void setUpClass() {
		Properties properties = new Properties();
		properties.setProperty(GLASSFISH_CONFIGI_FILE_PROPERTY, CONFIG_FILE);
		ejbContainer = EJBContainer.createEJBContainer(properties);
		ctx = ejbContainer.getContext();
	}
	
	@Before
	public void setup() throws NamingException  {
		grupo = (Grupo) ctx.lookup(GRUPOS_EJB);
		BaseDatos.inicializaBaseDatos(UNIDAD_PERSITENCIA_PRUEBAS);
	}

	@Test
	public void testInsertarLote() {
		
		final String productoSalchicha = "Salchicha";
		
		try {
			
			
			Lote lote = new Lote ("ST1", null, BigDecimal.TEN, Date.valueOf("2021-04-11"));
			lote.setLoteIngredientes(new HashMap<Ingrediente, String>());
			
			Producto salchicha = gestionProductos.obtenerProductoEIngredientes(productoSalchicha);
			salchicha.getIngredientes().forEach(ingrediente->{
				lote.getLoteIngredientes().put(ingrediente, "");
			});
			
			try {
				gestionLotes.insertarLote(productoSalchicha, lote);
			} catch (ProductoNoEncontradoException|IngredientesIncorrectosException|LoteExistenteException e) {
				fail("Lanzó excepción al insertar");
			}
		} catch (TrazabilidadException e) {
			throw new RuntimeException(e);
		}
				
		try {
			List<Lote> lotes = gestionLotes.obtenerLotesDeProducto(productoSalchicha);
			assertEquals(1, lotes.size());
			assertEquals(4,lotes.get(0).getLoteIngredientes().size());
			assertEquals("ST1", lotes.get(0).getCodigo());
			assertTrue(BigDecimal.valueOf(10L).compareTo(lotes.get(0).getCantidad())==0);
			assertEquals(Date.valueOf("2021-04-11"), lotes.get(0).getFechaFabricacion());
		} catch (TrazabilidadException e) {
			fail("No debería lanzar excepción");
		}
	}
	
	
	@AfterClass
	public static void tearDownClass() {
		if (ejbContainer != null) {
			ejbContainer.close();
		}
	}

}
