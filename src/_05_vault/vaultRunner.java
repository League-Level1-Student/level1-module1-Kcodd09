package _05_vault;

public class vaultRunner {
	public static void main(String[] args) {
		vault v = new vault(1234);
		JamesBond james = new JamesBond();
		System.out.println(james.findCode(v));
	}
}
