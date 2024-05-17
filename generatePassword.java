package Password_Manager.Password_Manager;

import java.util.*;

public class generatePassword {

	public static String generate(int length) {
		StringBuilder chars = new StringBuilder();
		StringBuilder Password = new StringBuilder();
		Random random = new Random();

//		adding characters to the string chars for the password to be pulled by
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialchars = "!@#$%^&*()_-+={}[]|.,<>;:";

		chars.append(lowercase);
		chars.append(uppercase);
		chars.append(numbers);
		chars.append(specialchars);

		for (int i = 0; i < length; i++) {
			Password.append(chars.charAt(random.nextInt(chars.length())));
		}

		return Password.toString();

	}

}
