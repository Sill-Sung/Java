package CreateUserAndCharacter;

import java.util.Random;

public class Status extends Item {
	Random random = new Random();
	protected int mobility;
	protected int intelligence;
	protected int strength;
	protected int statusMax = 10;
	
	void setRandomStatus() {
		for(;;) {
			this.mobility = random.nextInt(statusMax);
			this.intelligence = random.nextInt(statusMax);
			this.strength = random.nextInt(statusMax);
			int sum = mobility + intelligence + strength;
			if(sum == statusMax) {
				//System.out.printf("%d %d %d", mobility, intelligence, strength);
				break;
			}
		}		
	}
	
	int getMobility() {
		return this.mobility;
	}
	
	int getIntelligence() {
		return this.intelligence;
	}
	
	int getStrength() {
		return this.strength;
	}
	
	void boot() {
		this.mobility = itemBoot(this.mobility);
	}
	void wand() {
		this.intelligence = itemWand(this.intelligence);
	}
	void hammer() {
		this.strength = itemHammer(this.strength);
	}
}
