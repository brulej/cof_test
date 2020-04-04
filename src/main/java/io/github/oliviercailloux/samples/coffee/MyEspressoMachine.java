package io.github.oliviercailloux.samples.coffee;

/**
 * A specific espresso machine, that produces coffee of strength up to 20, whose
 * power is 2000 watts, and that produces a coffee of strength <em>s</em> in
 * <em>140 + 2 * s</em> seconds.
 *
 */
public class MyEspressoMachine implements EspressoMachine {
	double strength;
	double power = 2000;
	double max_strength=20;
	int nb_coffee_produced;
	
	
	@Override
	public double getPower() {
		return power;
	}
	
	@Override
	public double getEnergySpent() {
		double EnergySpent=power*(getTimeForCoffee(strength)/60)+15;
		return EnergySpent;
	}
	
	
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
			timereturn= 140+ 2*(int)strength;
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
	

	
	
}
