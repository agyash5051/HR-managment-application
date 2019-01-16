package newpackage;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class PasswordUtils {

	private static StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
	
	/**
	 * Encrypts (digests) a password. 
	 * 
	 * @param data - the password to be encrypted. 
	 * @return
	 */
	public static String encryptPassword(String data) {
		
		String result = passwordEncryptor.encryptPassword(data);

		return result;
	}
	
	
	public static boolean checkPassword(String plainText, String encryptedPassword) {
		
		return passwordEncryptor.checkPassword(plainText, encryptedPassword);
	}
	
}
