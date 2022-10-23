package dLizer;

import java.io.*;


public class user implements Serializable{

		String name;
		String password;
		
		public void sayHello() {
			System.out.println("Hello "+name);
		}
}