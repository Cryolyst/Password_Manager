package Password_Manager.Password_Manager;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {

		boolean program = true;
		Scanner input = new Scanner(System.in);

		while (program) {

			System.out.println("What do you want to do?");
			System.out.println("1 for saving a password..");
			System.out.println("2 for recalling a password..");

			int operation = input.nextInt();

			if (operation == 1) {

				SaveAccount.save(input);

			} else if (operation == 2) {

				System.out.println("Type in your account name: ");
				String accNum = input.next();
				ReadFile.check(accNum);

			} else {
				System.out.println("Bye!");
				program = false;
			}

		}

	}

}
