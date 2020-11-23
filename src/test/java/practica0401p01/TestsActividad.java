package practica0401p01;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;



public class TestsActividad {
	
	
	@Test	
	public void testVisibility() throws SecurityException, NoSuchFieldException, NoSuchMethodException {
		
		Class actividadClass = Actividad.class;
		assertEquals("Actividad es abstract",actividadClass.getModifiers(),Modifier.ABSTRACT+Modifier.PUBLIC);
		
		
		Method getCoeficientePrecioMethod = Actividad.class.getDeclaredMethod("getCoeficientePrecio");
		assertEquals("getCoeficientePrecio es public y abstract",getCoeficientePrecioMethod.getModifiers(),Modifier.PUBLIC+Modifier.ABSTRACT);
		
		Class[] cArg1= new Class[1];
        cArg1[0] = double.class;
		Method setCoeficientePrecioMethod = Actividad.class.getDeclaredMethod("setCoeficientePrecio",cArg1);
		assertEquals("setCoeficientePrecioMethod es public y abstract",setCoeficientePrecioMethod.getModifiers(),Modifier.PUBLIC+Modifier.ABSTRACT);

	}	

}
