package CreateUserAndCharacter;

public class Character extends Status {
	private String characterName;
	private String characterSex;
	private String characterTribe;
	private int statusMobility;
	private int statusIntelligence;
	private int statusStrength;
	
	//ĳ���� ���� ����
	public void setCharacter(String tribe, String name, String sex) {
		this.characterTribe = tribe;
		this.characterName = name;
		this.characterSex = sex;
		System.out.println("ĳ������ �⺻ ������ ����Ǿ����ϴ�.");
	}
	
	//Status ����
	public void setStatus() {
		this.statusMobility = getMobility();
		this.statusIntelligence = getIntelligence();
		this.statusStrength = getStrength();
		System.out.println("Status�� ����Ǿ����ϴ�.");
		}
}
