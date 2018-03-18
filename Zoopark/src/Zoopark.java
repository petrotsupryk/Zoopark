
public class Zoopark {

	public static void main(String[] args) {

		// create of objects
		Dynozavr d = new Dynozavr();
		System.out.printf("Dynozavr say: %s!\n" , d.Pryvit());

		Korova k = new Korova();
		System.out.printf("Korova say: %s!\n" , k.Pryvit());
		
		Metelyk m = new Metelyk();
		System.out.printf("Метелик каже: %s ", m.GoodDay());
	
	}

}
