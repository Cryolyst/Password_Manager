package Password_Manager.Password_Manager;

import java.io.FileWriter;
import java.io.IOException;

public class SaveAccount {

	public static void save(String accNum) {

//		Should use your own filePath
		String filePath = "C:/Users/Thant Zarni Nay/eclipse-workspace/MyJavaProjects/src/Password_Manager/Password_Manager/Accounts.txt";

		try {
			FileWriter writer = new FileWriter(filePath, true);
			writer.write(accNum + "\n");
			writer.close();
			System.out.println("Successfully wrote file");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
