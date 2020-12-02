/**
 * 
 */
package DI2021.Discoteca.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author darioaxel
 *
 */
public class UsuarioUtilsTest {
	
	//Test que valida contraseña correcta
	@Test
	public void ValidarCalidadPasswordCorrecta() {
		String password = "carlos123";
		
		boolean resultadoEsperado = true;
		boolean resultadoReal = UsuarioUtils.ValidarCalidadPassword(password);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//Test que valida contraseña incorrecta
	@Test
	public void ValidarCalidadPasswordIncorrecta() {
		String password = "carlos";
		String password2 = "carlooooos";
		
		boolean resultadoEsperado = false;
		
		//test de comprobacion de contraseña con string sin 8 caracteres
		boolean resultadoReal = UsuarioUtils.ValidarCalidadPassword(password);
		//test de comprobacion de contraseña con string sin número
		boolean resultadoReal2 = UsuarioUtils.ValidarCalidadPassword(password2);
		
		assertEquals(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal2);
	}
}

