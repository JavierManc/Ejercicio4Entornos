import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	Libro l1;
	Libro l2;
	@Before
	public void setUp() throws Exception {
		l1=new Libro();
		l2=new Libro("La caida de los gigantes",5);
	}

	@Test
	public void testLibro() {
		Libro l0=new Libro();
		assertNull(l0.getTitulo());
	}

	@Test
	public void testLibroStringInt() {
		Libro lx=new Libro ("Ken Follet...",7);
		assertEquals(7,lx.getCantidad());
	}

	@Test
	public void testGetTitulo() {
		assertEquals("La caida de los gigantes",l2.getTitulo());
	}

	@Test
	public void testSetTitulo() {
		l1.setTitulo("Ken Follet");
		assertEquals("Ken Follet",l1.getTitulo());
	}

	@Test
	public void testGetCantidad() {
		assertEquals(5,l2.getCantidad());
	}

	@Test
	public void testSetCantidad() {
		l1.setCantidad(2);
		assertEquals(2,l1.getCantidad());
	}

	@Test
	public void testToString() {
		l2.equals("Del libro La caida de los gigantes existen 5 unidades");
	}

	@Test
	public void testPrestamo() {
		l2.prestamo();
		assertEquals(4,l2.getCantidad());
	}

	@Test
	public void testDevoluccion() {
		l1.devoluccion();
		assertEquals(1,l1.getCantidad());
	}

}
