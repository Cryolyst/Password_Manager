package Password_Manager.Password_Manager;

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		SaveAccount.save(input);
		
		ReadFile.check("123473");

		input.close();
	}

}
