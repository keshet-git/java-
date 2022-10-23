package list;

public class main {

	public static void main(String[] args) {
		
		ArrayList<String> country = new ArrayList<String>();
		
		country.add("United States");
		country.add("Latin America");
		country.add("Canada");
		country.add("Italy");
		// TODO Auto-generated method stub
		for(int i=0; i<country.size(); i++) {
			System.out.print(country.get(i));
		}

	}

}
