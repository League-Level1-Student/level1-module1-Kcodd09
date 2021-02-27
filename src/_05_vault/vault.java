package _05_vault;

public class vault {
	int secretCode;
	public vault(int secretCode) {
		this.secretCode = secretCode;
	}
	
	public boolean tryCode(int num) {
		if(num == secretCode) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		vault v = new vault(1234);
		System.out.println(v.tryCode(1234));
		System.out.println(v.tryCode(2));
	}
}
