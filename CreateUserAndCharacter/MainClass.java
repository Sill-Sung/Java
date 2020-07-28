package CreateUserAndCharacter;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		// User 입력
		Scanner scan = new Scanner(System.in);
		String select;

		// User Field
		User user = new User();
		String name;
		String id;
		String pw;
		String sex;
		boolean check = true;

		// CharacterData Field
		String characterName;
		String characterSex;
		String characterTribe;
		Character character = new Character();

		// Status Field
		Status status = new Status();
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("//              JAVA Project - Create User And Charater              //");
		System.out.println("//                      1. User Registration                         //");
		System.out.println("//                      2. User Login                                //");
		System.out.println("//                      3. Create Character                          //");
		System.out.println("///////////////////////////////////////////////////////////////////////");

		// user 정보 입력
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("                   ***[ User Registration ]***");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		Registration: for (;;) {
			System.out.print("- 이름 : ");
			name = scan.nextLine().trim();

			System.out.print("- ID : ");
			id = scan.nextLine().trim();

			System.out.print("- Password : ");
			pw = scan.nextLine().trim();

			for (;;) {
				System.out.print("- Sex [1.Male] [2.Female] : ");
				sex = scan.nextLine().trim();
				if (sex.equals("1")) {
					sex = "Male";
					break;
				} else if (sex.equals("2")) {
					sex = "Female";
					break;
				} else {
					System.out.println("다시 입력하세요");
				}
			}
			System.out.printf("\n             **  %s님의 정보 확인   **\n", name);
			System.out.printf("( *ID : %s  *Password : %s  *성별 : %s )\n", id, pw, sex);
			for (;;) {
				System.out.print("등록하시겠습니까? [1.Yes] [2.No] => ");
				select = scan.nextLine().trim();
				if (select.equals("1")) {
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("      .");
					}
					user.setUserData(name, id, pw, sex);
					break Registration;
				} else if (select.equals("2")) {
					System.out.println();
					break;
				} else {
					System.out.println();
					System.out.println("[error] 올바른 입력이 아닙니다.");
				}
			}
		}
		// user 로그인
		System.out.println();
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("                      ***[  L O G I N  ]***");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		while (check) {
			System.out.print("[ID] : ");
			id = scan.nextLine().trim();
			System.out.print("[PassWord] : ");
			pw = scan.nextLine().trim();
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.println("      .");
			}
			check = user.check(id, pw);
		}
		System.out.println();

		// Character Data
		// 종족 선택
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("                      ***[  캐 릭 터  생 성  ]***");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println();

		Character: for (;;) {
			System.out.println("---------------------------  1. 직업 선택  --------------------------------");
			System.out.println();
			Tribe: for (;;) {
				System.out.println("  [1. Hunter]             [2. Warlock]              [3.Titan]");
				System.out.println("헌터는 전반적으로 기동성이           워록은 마법사와 비슷한 스타일로            타이탄은 가장 방어적인 성격으로");
				System.out.println("우수해 근접전을 유도하여              지능이 우수해 강력한 범위 공격이          힘이 우수해 전투에서의 생존력이");
				System.out.println("전투를 벌일 수 있습니다.      일품입니다.                  뛰어납니다.");
				System.out.println();
				for (;;) {
					System.out.print("직업 선택 : ");
					characterTribe = scan.nextLine().trim();

					if (characterTribe.equals("1")) {
						characterTribe = "Hunter";
						break Tribe;
					} else if (characterTribe.equals("2")) {
						characterTribe = "Warlock";
						break Tribe;
					} else if (characterTribe.equals("3")) {
						characterTribe = "Titan";
						break Tribe;
					} else {
						System.out.println("[error] 올바른 입력이 아닙니다.");
						System.out.println();
					}
				}
			}
			System.out.println();

			// 캐릭터 성별
			System.out.println("---------------------------  2. 성별 선택  --------------------------------");
			for (;;) {
				System.out.print("[1. 남성 ] [2. 여성 ] : ");
				characterSex = scan.nextLine().trim();
				if (characterSex.equals("1")) {
					characterSex = "Male";
					break;
				} else if (characterSex.equals("2")) {
					characterSex = "Female";
					break;
				} else {
					System.out.println("[error] 올바른 입력이 아닙니다.");
				}
				// System.out.println(characterSex);
			}
			System.out.println();

			// 캐릭터 이름
			System.out.println("----------------------------  3. 닉네임    --------------------------------");
			System.out.print("캐릭터 이름 : ");
			characterName = scan.nextLine().trim();
			System.out.println(characterName);

			System.out.println("                          ***  캐릭터 확인   ***");
			System.out.printf("1. 직업 : [%s]\n", characterTribe);
			System.out.printf("2. 성별 : [%s]\n", characterSex);
			System.out.printf("3. 닉네임 : [%s]\n", characterName);
			System.out.println();
			for (;;) {
				System.out.print("캐릭터를 등록하시겠습니까? [1. Yes] [2. No] => ");
				select = scan.nextLine().trim();
				if (select.equals("1")) {
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("      .");
					}
					character.setCharacter(characterTribe, characterName, characterSex);
					break Character;
				} else if (select.equals("2")) {
					break;
				} else {
					System.out.println();
					System.out.println("[error] 올바른 입력이 아닙니다.");
				}
			}
		}

		// Status 설정
		System.out.println("---------------------------  4. 스탯 설정  --------------------------------");
		Status: for (;;) {
			System.out.print("스탯을 설정합니다!");
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.print(">>>>>>>");
			}
			System.out.println();
			status.setRandomStatus();
			for (;;) {
				System.out.printf("         [기동성 : %d]      [지능 : %d]      [힘 : %d]\n", status.getMobility(),
						status.getIntelligence(), status.getStrength());
				System.out.print("확정하시겠습니까? [1. Yes] [2. No] => ");
				select = scan.nextLine().trim();
				if (select.equals("1")) {
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("      .");
					}
					character.setStatus();
					break Status;
				} else if (select.equals("2")) {
					System.out.println();
					break;
				} else {
					System.out.println();
					System.out.println("[error] 올바른 입력이 아닙니다.");
				}
			}
		}

		// Item 선택
		System.out.println("                          < Special Gift! >");
		System.out.println("      새로운 캐릭터 생성을 축하드리며 특정 스탯을 올려주는 아이템을 지급해 드리겠습니다.");
		System.out.println();
		System.out.println("  ---[1.K0kir-EE5]---    ---[2.달빛의 장화]---    -[3.세인트-14의 투구]-");
		System.out.println("  |     기동성  +3     |   |      지능  +3     |   |      힘  +3      | ");
		System.out.println("  -------------------    -----------------    -----------------");
		System.out.println();

		for (;;) {
			System.out.print("어떤 장비를 선택하시겠습니까? => ");
			select = scan.nextLine().trim();

			if (select.equals("1")) {
				status.boot();
				System.out.println();
				System.out.println("** 축하드립니다! \"K0kir-EE5\"를 획득하셨습니다. **");
				System.out.printf("  ---[1.K0kir-EE5]---\t* 기동성 : %d -> %d\n", (status.getMobility() - 3),
						status.getMobility());
				System.out.printf("  |     기동성  +3     |\t* 지   능 : %d\n", status.getIntelligence());
				System.out.printf("  -------------------\t*  힘     : %d\n", status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else if (select.equals("2")) {
				status.wand();
				System.out.println();
				System.out.println("** 축하드립니다! \"달빛의 장화\"를 획득하셨습니다. **");
				System.out.printf("  ---[2.달빛의 장화]---\t* 기동성 : %d\n", status.getMobility());
				System.out.printf("  |     지능  +3     |\t* 지   능 : %d -> %d\n", (status.getIntelligence() - 3),
						status.getIntelligence());
				System.out.printf("  -----------------\t*  힘     : %d\n", status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else if (select.equals("3")) {
				status.hammer();
				System.out.println();
				System.out.println("** 축하드립니다! \"세인트-14의 투구\"를 획득하셨습니다. **");
				System.out.printf("  -[3.세인트-14의 투구]-\t* 기동성 : %d\n", status.getMobility());
				System.out.printf("  |      힘  +3      |\t* 지   능 : %d\n", status.getIntelligence());
				System.out.printf("  ------------------\t*  힘     : %d -> %d\n", (status.getStrength() - 3),
						status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else {
				System.out.println("[error] 올바른 입력이 아닙니다.");
			}
		}
	}
}