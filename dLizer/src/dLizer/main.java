package dLizer;

import java.io.*;


public class main {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		user user = null;

		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\keshe\\Desktop\\sLizer\\userInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (user) in.readObject();
		in.close();
		fileIn.close();

		System.out.println(user.name);
		System.out.println(user.password);
		
		user.sayHello();
		}

	}

