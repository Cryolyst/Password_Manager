package Password_Manager.Password_Manager;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class ReadFile {

	public static void check() {

		String data = "";

//		Should use your own filePath
		String filePath = "C:/Users/Thant Zarni Nay/eclipse-workspace/MyJavaProjects/src/Password_Manager/Password_Manager/Accounts.txt";

		try {
			File accounts = new File(filePath);
			Scanner Reader = new Scanner(accounts);
			while (Reader.hasNextLine()) {
				data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
