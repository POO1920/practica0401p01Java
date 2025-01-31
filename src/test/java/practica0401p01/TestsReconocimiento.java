package practica0401p01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsReconocimiento {

	@Test
	public void testConstructor() {
		
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		assertEquals("El nombre de la asignatura a1 debe ser POO", "POO", a1.getNombre());
		assertEquals("El numero de creditos de la asignatura a1 debe ser 6", 6, a1.getCreditos());
		assertEquals("La descripcion debe ser ingles", "ingles",a1.getDescripcion());
		
	}
	
	@Test
	public void testSetNombre() {	
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		a1.setNombre("TP");
		assertEquals("El nombre de la asignatura a1 debe ser TP", "TP", a1.getNombre());
		assertEquals("El numero de creditos de la asignatura a1 debe ser 6", 6, a1.getCreditos());
		assertEquals("La descripcion debe ser ingles", "ingles",a1.getDescripcion());
	}

	
	@Test
	public void testSetCreditos() {	
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		a1.setCreditos(9);
		assertEquals("El nombre de la asignatura a1 debe ser POO", "POO", a1.getNombre());
		assertEquals("El numero de creditos de la asignatura a1 debe ser 9", 9, a1.getCreditos());
		assertEquals("La descripcion debe ser ingles", "ingles",a1.getDescripcion());
		
	}
	
	@Test
	public void testSetDescripcion() {	
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		a1.setDescripcion("frances");
		assertEquals("El nombre de la asignatura a1 debe ser POO", "POO", a1.getNombre());
		assertEquals("El numero de creditos de la asignatura a1 debe ser 6", 6, a1.getCreditos());
		assertEquals("La descripcion debe ser frances", "frances",a1.getDescripcion());
	}
	
	@Test
	public void testGetSetCoeficientePrecio() {	
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		assertEquals("El coeficiente precio de un reconocimiento es 0.75", 0.75, a1.getCoeficientePrecio(),0.0001);
		a1.setCoeficientePrecio(1.0);
		assertEquals("El coeficiente precio de un reconocimiento ha pasado a ser 0.75", 1.0, a1.getCoeficientePrecio(),0.0001);
		
	}
	
	@Test
	public void testToString() {
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		String a1ToString = a1.toString();
		assertTrue("Contiene el texto actividad", a1ToString.toLowerCase().contains("actividad"));
		assertTrue("Contiene el nombre de la actividad", a1ToString.contains(a1.getNombre()));
		assertTrue("Contiene el texto creditos", a1ToString.toLowerCase().contains("créditos"));
		assertTrue("Contiene los creditos de la actividad", a1ToString.contains(""+a1.getCreditos()));
		assertTrue("Contiene el coeficiente precio", a1ToString.toLowerCase().contains("coeficiente"));
		assertTrue("Contiene los creditos de la actividad", a1ToString.contains(""+a1.getCoeficientePrecio()));
		assertTrue("Contiene la descripcion", a1ToString.contains(a1.getDescripcion()));
		
		
	}
	
	@Test
	public void testEqual() {
		Reconocimiento a1 = new Reconocimiento("POO",6,"ingles");
		Reconocimiento a2 = new Reconocimiento("TP",6,"ingles");
		Reconocimiento a3 = new Reconocimiento("POO",9,"ingles");
		Reconocimiento a4 = new Reconocimiento("POO",6,"ingles");
		
		assertNotEquals(a1,a2);
		assertNotEquals(a1, a3);
		assertNotEquals(a2, a3);
		assertEquals(a1,a4);
			
			
		
	}
	
}
