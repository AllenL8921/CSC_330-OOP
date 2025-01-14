import java.util.ArrayList;

public class Charizard extends Pokemon {

	public Charizard(String type, String name, ArrayList<Attack> attackList, int hitPoints, int powerPoints, int speed) {
		super(type, name, attackList, hitPoints, powerPoints, speed);
	}

	@Override
	public void attack(Pokemon other, int attackIndex) {
		double damage = 0;
		
		// if the attack the pokemon is trying to use has PP, then it will use the move
		if(attackList.get(attackIndex).getPowerPoints() > 0) {
			
			if((attackList.get(attackIndex).getType().toLowerCase().equals("fire") || attackList.get(attackIndex).getType().toLowerCase().equals("flying"))
				&& other.type.toLowerCase().equals("grass")) {
				damage = 2 * (attackList.get(attackIndex).getBaseDamage());
				attackList.get(attackIndex).setPowerPoints(attackList.get(attackIndex).getPowerPoints() - 1);; // after using a move, the move's PP should decrease
			}else if(attackList.get(attackIndex).getType().toLowerCase().equals("fire") && other.type.toLowerCase().equals("water")){
				damage = 0.5 * (attackList.get(attackIndex).getBaseDamage());
			}else {
				damage = (attackList.get(attackIndex).getBaseDamage());
			}
		}
		
		//damage done to the opposing pokemon is printed out
		
		if(other.hitPoints > 0) {
			System.out.println(this.name + " has dealt " + damage + " damage to " + other.name);
			other.hitPoints -= damage;
		}
		
	}

	@Override
	public void speak() {
		System.out.println("charglizzy");
	}

}
