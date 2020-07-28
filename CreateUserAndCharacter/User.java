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
		System.out.println("유저정보가 저장되었습니다.");
		//System.out.printf("%s %s %s %s\n\n", this.userName, this.userID, this.userPW, this.userSex);
	}

	// 로그인 성공 및 실패 여부
	boolean check(String id, String pw) {
		if (id.equals(this.userID) && pw.equals(this.userPW)) {
			System.out.println("로그인되었습니다.");
			return false;
		} else {
			System.out.println("ID, Password가 존재하지 않습니다.");
			System.out.println();
			return true;
		}
	}
}
