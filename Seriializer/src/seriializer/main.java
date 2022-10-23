package seriializer;

import java.io.*;

public class main {

	public static void main(String[] args) throws IOException {
		
		user user = new user();
		
		user.name ="Keshet";
		user.password = "I <3 pizza";
		
		FileOutputStream fileOut = new FileOutputStream("userInfo.str");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("object info sevd :) ");
		// TODO Auto-generated method stub

	}

}
