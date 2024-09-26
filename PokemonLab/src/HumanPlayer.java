import java.util.Scanner;

public class HumanPlayer extends Player {
	

	public HumanPlayer(Pokemon p, Item item) {
		super(p, item);
	}

	public void run(Player otherTrainer) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an attack: ");
		for(int i = 0; i < super.getPoke().attackList.size(); i++) {
			System.out.println(i+1 + ": " + super.getPoke().attackList.get(i).getAttackName());
		}
		
		System.out.println("5: Use an item");
		
		choice = sc.nextInt();
		
		//Player chooses to use an item
		if(choice == 5){
			super.getItem().use(getPoke());
		}else {
			//Player chose an attack
			super.getPoke().attack(otherTrainer.getPoke(), choice - 1);
		}
				
	}
		
}