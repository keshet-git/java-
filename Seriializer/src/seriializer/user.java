package seriializer;

import java.io.Serializable;

public class user implements Serializable{

	String name;
	String password;
	
	public void sayHelllo() {
		System.out.println("Hello "+name);
		// TODO Auto-generated method stub

	}

}
