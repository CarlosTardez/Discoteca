package DI2021.Discoteca.utils;

public class UsuarioUtils extends Exception {

	// Funcion validar calidad password

	public static boolean ValidarCalidadPassword(String password) {
		char[] valor = password.toCharArray();
		boolean numero = false;

		for (char a : valor) {
			if (Character.isDigit(a))
				numero = true;
		}

		if (numero == false)
			throw new IllegalArgumentException("Contraseña incorrecta. Debe introducir al menos un número");

		if (password.length() < 9)
			throw new IllegalArgumentException(
					"Contraseña incorrecta. La contraseña debe contener al menos 8 carácteres entre ellos un número ");

		return true;
	}
}
