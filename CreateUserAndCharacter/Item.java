package CreateUserAndCharacter;

public class Item {
	protected int itemBoot(int mobility) {
		mobility = mobility +3;
		return mobility;
	}
	protected int itemWand(int intelligence) {
		intelligence = intelligence +3;
		return intelligence;
	}
	protected int itemHammer(int strength) {
		strength = strength +3;
		return strength;
	}
}