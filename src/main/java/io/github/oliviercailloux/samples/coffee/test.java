package io.github.oliviercailloux.samples.coffee;

public class test {
	
	public static void main(String[] args) {
		//cafee1
		CoffeeMachine cafee = new DripCoffeeMaker();
		System.out.println("Test dripp coffee");
		System.out.println("la froce max est : " + cafee.getMaxStrength());
		System.out.println("le temps pour produir un café est : " + cafee.getTimeForCoffee(6)     );
		cafee.produceCoffee(2);
		System.out.println("nombre de café produits: " + cafee.getNumberOfCoffeesProduced()       );
		System.out.println("Energie dépensée pour le dernier café: " + cafee.getEnergySpent()    );
		
		
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		
		//cafee1
		MyEspressoMachine espresso = new MyEspressoMachine();
		System.out.println("Test espresso");
		System.out.println("le power de la machine est " + espresso.getPower());
		System.out.println("la froce max est : " + espresso.getMaxStrength());
		System.out.println("le temps pour produir un café est : " + espresso.getTimeForCoffee(5)     );
		espresso.produceCoffee(19);
		espresso.produceCoffee(3);
		System.out.println("nombre de café produits: " + espresso.getNumberOfCoffeesProduced()       );
		System.out.println("Energie dépensée pour le dernier café: " + espresso.getEnergySpent()    );
				
		
		
	
		
	}

	
	
	
	

}
