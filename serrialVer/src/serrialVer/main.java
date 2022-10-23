package serrialVer;

import java.io.*;

public class main {

	public static void main(String[] args) throws IOException {


		user user = new user();
		
		user.name = "Keshet";
		user.password = "I<3pizza";
		
		FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved :)");
	}

}
