package practica0401p01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsEstudiante {

	@Test
	public void testConstructor() {
		Estudiante e = new Estudiante();
		assertEquals("La cuasi de un estudiante construido con constructor vacío debe estar vacío", "", e.getCuasi());
		assertEquals("Un estudiante construido con el constructor vacío no tiene familia numerosa", false, e.getFamiliaNumerosa());
		
		
		Estudiante e1 = new Estudiante("peperez",true);
		assertEquals("La cuasi del estudiante debe ser peperez", "peperez", e1.getCuasi());
		assertEquals("El estudiante pertenece a una familia numerosa", true, e1.getFamiliaNumerosa());
		
		
	}
	
	@Test
	public void testSetCuasi() {	
		Estudiante e1 = new Estudiante("peperez",true);
		e1.setCuasi("pepeperez");
		assertEquals("La cuasi del estudiante debe ser pepeperez", "pepeperez", e1.getCuasi());
		assertEquals("El estudiante pertenece a una familia numerosa", true, e1.getFamiliaNumerosa());
		
	}

	
	@Test
	public void testSetFamiliaNumerosa() {	
		Estudiante e1 = new Estudiante("peperez",true);
		e1.setFamiliaNumerosa(false);
		assertEquals("La cuasi del estudiante debe ser peperez", "peperez", e1.getCuasi());
		assertEquals("El estudiante no pertenece a una familia numerosa", false, e1.getFamiliaNumerosa());
		
	}
	
	
	@Test
	public void testToString() {
		Estudiante a1 = new Estudiante("peperez",true);
		String a1ToString = a1.toString();
		assertTrue("Contiene CUASI", a1ToString.toLowerCase().contains("cuasi"));
		assertTrue("Contiene la cuasi", a1ToString.contains(a1.getCuasi()));
		assertTrue("Contiene Pertenece a familia numerosa", a1ToString.toLowerCase().contains("pertenece a familia numerosa"));
		assertTrue("Contiene familia numerosa", a1ToString.contains(""+a1.getFamiliaNumerosa()));
		
		
	}
	
	
	@Test
	public void testEqual() {
		Estudiante e1 = new Estudiante("peperez",true);
		Estudiante e2 = new Estudiante("jolopez",true);
		Estudiante e3 = new Estudiante("peperez",false);
		Estudiante e4 = new Estudiante("peperez",true);
		
		
		assertNotEquals(e1, e2);
		assertNotEquals(e1, e3);
		assertNotEquals(e2, e3);
		assertEquals(e1,e4);
			
			
		
	}
	
}
