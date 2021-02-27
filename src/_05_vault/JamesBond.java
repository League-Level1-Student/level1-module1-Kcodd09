package _05_vault;

public class JamesBond {
	public int findCode(vault v) {
		for (int i = 0; i < 1000000; i++) {
			if(i == v.secretCode) {
				return i;
			}
		}
		return -1;
	}
}
