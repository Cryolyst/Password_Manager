package Password_Manager.Password_Manager;

import java.io.File;
import java.util.*;
import java.io.*;

public class ReadFile {

	public static void check(String accNum) {

		String data = "";
		HashMap<String, String> map = new HashMap<>();

//		Should use your own filePath
		String filePath = "C:/Users/Thant Zarni Nay/eclipse-workspace/MyJavaProjects/src/Password_Manager/Password_Manager/Accounts.txt";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("=", 2); // Split the line into two parts
				if (parts.length >= 2) {
					String key = parts[0];
					String value = parts[1];
					map.put(key, value);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (map.get(accNum) != null) {
			System.out.println("Value for key: " + map.get(accNum));
		} else {
			System.out.println("The account does not exist..");
		}

	}

}
