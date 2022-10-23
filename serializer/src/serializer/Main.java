package serializer;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
user user = new user();
		
		user.name = "Keshet";
		user.password = "I<3pizza";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("object info seved! :) "); 
		// TODO Auto-generated method stub

	}

}
