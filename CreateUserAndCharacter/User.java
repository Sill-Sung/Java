package CreateUserAndCharacter;

public class User {
	private String userName;
	private String userID;
	private String userPW;
	private String userSex;

	void setUserData(String name, String id, String pw, String sex) {
		this.userName = name;
		this.userID = id;
		this.userPW = pw;
		this.userSex = sex;
		System.out.println("���������� ����Ǿ����ϴ�.");
		//System.out.printf("%s %s %s %s\n\n", this.userName, this.userID, this.userPW, this.userSex);
	}

	// �α��� ���� �� ���� ����
	boolean check(String id, String pw) {
		if (id.equals(this.userID) && pw.equals(this.userPW)) {
			System.out.println("�α��εǾ����ϴ�.");
			return false;
		} else {
			System.out.println("ID, Password�� �������� �ʽ��ϴ�.");
			System.out.println();
			return true;
		}
	}
}
