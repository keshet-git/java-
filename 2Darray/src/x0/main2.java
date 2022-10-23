package x0;

public class main2 {

	public static void main(String[] args) {
String[][] cars = {
		{"Camaro","Corverette","silvetrado"},
		{"mustang","Ranger","F-150"},
		{"Farrari","Lambo","tesla"}
};
for(int i=0; i<cars.length; i++) {
	System.out.println();
	for(int j=0; j<cars[i].length; j++) {
		System.out.print(cars[i][j]+" ");

	}

}
	}
}
