package Deserialize;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		User user = null;
		
				
		FileInputStream fileIn = new FileInputStream("C:\\Users\\keshe\\Desktop\\serializer\\src\\module-info.java");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();


		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	}

}
