package fileSerch;

import java.io.File;

public class maim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("RonWesly.txt");
		
		if(file.exists()) {
			System.out.println("THat file exists! :o!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
			}
		
		else {
			System.out.println("THat file doesn't exists! :(");
			
		}
	}

}
