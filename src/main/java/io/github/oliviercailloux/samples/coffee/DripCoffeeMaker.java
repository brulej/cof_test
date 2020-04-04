package io.github.oliviercailloux.samples.coffee;

/**
 * <p>
 * A <a href=
 * "https://www.startpage.com/sp/search?query=drip+coffee+maker&cat=pics">drip
 * coffee maker</a>. It uses a specific brand of coffee, which makes it able to
 * produce coffee of any strength from 0 to 10. It takes a constant time of 2
 * minutes to produce coffee (of strength higher than zero). Unrealistically, we
 * suppose here that it produces only one coffee at a time.
 * </p>
 * <p>
 * The energy required for producing a coffee (of strength higher than zero) is
 * an estimated 83 <a href="https://en.wikipedia.org/wiki/Watt_hour">watt
 * hours</a>.
 * </p>
 */
public class DripCoffeeMaker implements CoffeeMachine {
	String brand;
	double strength;
	double max_strength=10;
	int conso_energy = 83;
	int time_per_coffee =2;
	int nb_coffee_produced;
	
	
	@Override
	public double getMaxStrength() {
		return max_strength;
	}
	
	
	@Override
	public int getTimeForCoffee(double strength) {
		int timereturn;
		if ( strength == 0 ) {
			timereturn=0;
		}
		else {
			timereturn=time_per_coffee*60;
		}
		return timereturn;
	}
	
	
	@Override
	public void produceCoffee(double strength) {
		nb_coffee_produced++ ;
		this.strength = strength;
	}
	
	
	@Override
	public int getNumberOfCoffeesProduced() {
		 if ( nb_coffee_produced <1)
	            throw new IllegalStateException("impossible aucun café produit");
		return nb_coffee_produced;
	}
	
	@Override
	public double getEnergySpent() {
		System.out.println("conso " + (double)conso_energy  );
		System.out.println("time " + (double)time_per_coffee   );
		
		 if ( nb_coffee_produced <1)
	            throw new IllegalStateException("impossible aucun café produit");
		 
		 double last_energyspent= (double)conso_energy *((double)time_per_coffee/60);
		 return last_energyspent;
	}
}
