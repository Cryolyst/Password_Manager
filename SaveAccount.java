package Password_Manager.Password_Manager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SaveAccount {

	public static void save(Scanner input) {

//		Should use your own filePath
		String filePath = "C:/Users/Thant Zarni Nay/eclipse-workspace/MyJavaProjects/src/Password_Manager/Password_Manager/Accounts.txt";
		HashMap<String, String> accounts = new HashMap<>();

		System.out.println("Enter account number: ");
		String accNum = input.next();
		System.out.println("Enter password: ");
		String password = input.next();
		accounts.put(accNum, password);


		try {
			FileWriter writer = new FileWriter(filePath, true);
			for (HashMap.Entry<String, String> entry : accounts.entrySet()) {
				writer.write(entry.getKey() + "=" + entry.getValue() + "\n");
			}
			writer.close();
			System.out.println("Successfully wrote file");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
