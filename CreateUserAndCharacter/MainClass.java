package CreateUserAndCharacter;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		// User �Է�
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

		// user ���� �Է�
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("                   ***[ User Registration ]***");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		Registration: for (;;) {
			System.out.print("- �̸� : ");
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
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			System.out.printf("\n             **  %s���� ���� Ȯ��   **\n", name);
			System.out.printf("( *ID : %s  *Password : %s  *���� : %s )\n", id, pw, sex);
			for (;;) {
				System.out.print("����Ͻðڽ��ϱ�? [1.Yes] [2.No] => ");
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
					System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
				}
			}
		}
		// user �α���
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
		// ���� ����
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("                      ***[  ĳ �� ��  �� ��  ]***");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println();

		Character: for (;;) {
			System.out.println("---------------------------  1. ���� ����  --------------------------------");
			System.out.println();
			Tribe: for (;;) {
				System.out.println("  [1. Hunter]             [2. Warlock]              [3.Titan]");
				System.out.println("���ʹ� ���������� �⵿����           ������ ������� ����� ��Ÿ�Ϸ�            Ÿ��ź�� ���� ������� ��������");
				System.out.println("����� �������� �����Ͽ�              ������ ����� ������ ���� ������          ���� ����� ���������� ��������");
				System.out.println("������ ���� �� �ֽ��ϴ�.      ��ǰ�Դϴ�.                  �پ�ϴ�.");
				System.out.println();
				for (;;) {
					System.out.print("���� ���� : ");
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
						System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
						System.out.println();
					}
				}
			}
			System.out.println();

			// ĳ���� ����
			System.out.println("---------------------------  2. ���� ����  --------------------------------");
			for (;;) {
				System.out.print("[1. ���� ] [2. ���� ] : ");
				characterSex = scan.nextLine().trim();
				if (characterSex.equals("1")) {
					characterSex = "Male";
					break;
				} else if (characterSex.equals("2")) {
					characterSex = "Female";
					break;
				} else {
					System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
				}
				// System.out.println(characterSex);
			}
			System.out.println();

			// ĳ���� �̸�
			System.out.println("----------------------------  3. �г���    --------------------------------");
			System.out.print("ĳ���� �̸� : ");
			characterName = scan.nextLine().trim();
			System.out.println(characterName);

			System.out.println("                          ***  ĳ���� Ȯ��   ***");
			System.out.printf("1. ���� : [%s]\n", characterTribe);
			System.out.printf("2. ���� : [%s]\n", characterSex);
			System.out.printf("3. �г��� : [%s]\n", characterName);
			System.out.println();
			for (;;) {
				System.out.print("ĳ���͸� ����Ͻðڽ��ϱ�? [1. Yes] [2. No] => ");
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
					System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
				}
			}
		}

		// Status ����
		System.out.println("---------------------------  4. ���� ����  --------------------------------");
		Status: for (;;) {
			System.out.print("������ �����մϴ�!");
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.print(">>>>>>>");
			}
			System.out.println();
			status.setRandomStatus();
			for (;;) {
				System.out.printf("         [�⵿�� : %d]      [���� : %d]      [�� : %d]\n", status.getMobility(),
						status.getIntelligence(), status.getStrength());
				System.out.print("Ȯ���Ͻðڽ��ϱ�? [1. Yes] [2. No] => ");
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
					System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
				}
			}
		}

		// Item ����
		System.out.println("                          < Special Gift! >");
		System.out.println("      ���ο� ĳ���� ������ ���ϵ帮�� Ư�� ������ �÷��ִ� �������� ������ �帮�ڽ��ϴ�.");
		System.out.println();
		System.out.println("  ---[1.K0kir-EE5]---    ---[2.�޺��� ��ȭ]---    -[3.����Ʈ-14�� ����]-");
		System.out.println("  |     �⵿��  +3     |   |      ����  +3     |   |      ��  +3      | ");
		System.out.println("  -------------------    -----------------    -----------------");
		System.out.println();

		for (;;) {
			System.out.print("� ��� �����Ͻðڽ��ϱ�? => ");
			select = scan.nextLine().trim();

			if (select.equals("1")) {
				status.boot();
				System.out.println();
				System.out.println("** ���ϵ帳�ϴ�! \"K0kir-EE5\"�� ȹ���ϼ̽��ϴ�. **");
				System.out.printf("  ---[1.K0kir-EE5]---\t* �⵿�� : %d -> %d\n", (status.getMobility() - 3),
						status.getMobility());
				System.out.printf("  |     �⵿��  +3     |\t* ��   �� : %d\n", status.getIntelligence());
				System.out.printf("  -------------------\t*  ��     : %d\n", status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else if (select.equals("2")) {
				status.wand();
				System.out.println();
				System.out.println("** ���ϵ帳�ϴ�! \"�޺��� ��ȭ\"�� ȹ���ϼ̽��ϴ�. **");
				System.out.printf("  ---[2.�޺��� ��ȭ]---\t* �⵿�� : %d\n", status.getMobility());
				System.out.printf("  |     ����  +3     |\t* ��   �� : %d -> %d\n", (status.getIntelligence() - 3),
						status.getIntelligence());
				System.out.printf("  -----------------\t*  ��     : %d\n", status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else if (select.equals("3")) {
				status.hammer();
				System.out.println();
				System.out.println("** ���ϵ帳�ϴ�! \"����Ʈ-14�� ����\"�� ȹ���ϼ̽��ϴ�. **");
				System.out.printf("  -[3.����Ʈ-14�� ����]-\t* �⵿�� : %d\n", status.getMobility());
				System.out.printf("  |      ��  +3      |\t* ��   �� : %d\n", status.getIntelligence());
				System.out.printf("  ------------------\t*  ��     : %d -> %d\n", (status.getStrength() - 3),
						status.getStrength());
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("      .");
				}
				character.setStatus();
				break;
			} else {
				System.out.println("[error] �ùٸ� �Է��� �ƴմϴ�.");
			}
		}
	}
}