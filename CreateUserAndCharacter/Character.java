package CreateUserAndCharacter;

public class Character extends Status {
	private String characterName;
	private String characterSex;
	private String characterTribe;
	private int statusMobility;
	private int statusIntelligence;
	private int statusStrength;
	
	//캐릭터 정보 저장
	public void setCharacter(String tribe, String name, String sex) {
		this.characterTribe = tribe;
		this.characterName = name;
		this.characterSex = sex;
		System.out.println("캐릭터의 기본 정보가 저장되었습니다.");
	}
	
	//Status 저장
	public void setStatus() {
		this.statusMobility = getMobility();
		this.statusIntelligence = getIntelligence();
		this.statusStrength = getStrength();
		System.out.println("Status가 저장되었습니다.");
		}
}
