package projekat.test.simple;

public class TestPrviTest {
	
	public static void main(String[] args)
	{
		System.out.println("Hello world.");

		PrviTest prvitest= new PrviTest();
		
		prvitest.firstMethod();
		prvitest.prviClan = 50;
		PrviTest prvitest1= new PrviTest();
		prvitest1.prviClan = 10;
		
		PrviTest.secondMethod();
		
		//prvitest = prvitest1;
		
		//prvitest.prviClan=20;
		
		//PrviTest.drugiClan=25;
		prvitest.drugiClan = 150;
		prvitest1.drugiClan = 250;
		 
		 System.out.println("prvitest.prviClan = " + prvitest.prviClan);
		 System.out.println("prvitest1.prviClan = " + prvitest1.prviClan);
		 
		 System.out.println("prvitest.drugiClan = " + prvitest.drugiClan);
		 System.out.println("prvitest1.drugiClan = " + prvitest1.drugiClan);
	}
}
