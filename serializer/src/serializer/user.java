package serializer;

import java.io.Serializable;

public class user implements Serializable{
	
	String name;
	String password;

	public void sayHello() {
		System.out.println("Hello "+name);

		// TODO Auto-generated method stub

	}

}
