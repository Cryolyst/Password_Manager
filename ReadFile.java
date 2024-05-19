package Password_Manager.Password_Manager;

import java.util.*;
import java.io.*;

public class ReadFile {

	public static void check(String accNum) {

//		To store account numbers and passwords
		HashMap<String, String> map = new HashMap<>();

//		Should use your own filePath
		String filePath = "C:/Users/Thant Zarni Nay/eclipse-workspace/MyJavaProjects/src/Password_Manager/Password_Manager/Accounts.txt";

		try {
//			The bufferedReader reads from the file
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;

//			while loop to read the file line by line
			while ((line = reader.readLine()) != null) {

//				Split each line into a key and a value based on "="
				String[] parts = line.split("=", 2);
				if (parts.length >= 2) {
					String key = parts[0];
					String value = parts[1];
					map.put(key, value);
				}
			}
			reader.close();
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
