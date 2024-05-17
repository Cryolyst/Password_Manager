package Password_Manager.Password_Manager;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your account num: ");
		String accNum = input.next();
		SaveAccount.save(accNum);

		System.out.println("How many words do you want for your password: ");
		int pass_length = input.nextInt();

		System.out.println(generatePassword.generate(pass_length));
		
		ReadFile.check();

		input.close();
	}

}
