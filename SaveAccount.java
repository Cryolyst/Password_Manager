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
//			FileWriter to write the accounts detalis in the file			
			FileWriter writer = new FileWriter(filePath, true); //put the append mode to true
			
//			Iterate through the entries in the accounts HashMap			
			for (HashMap.Entry<String, String> entry : accounts.entrySet()) {
//				To write account number and password to the file
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
