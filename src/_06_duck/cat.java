package _06_duck;

public class cat {
	int numFriends;
	String favFood;
	void meow() {
		System.out.println("Meeeeoooowwww!");
	}
	void play() {
		System.out.println("**swats at shoe string and chases ball**");
	}
	public cat(String favFood, int numFriends) {
		this.favFood = favFood;
		this.numFriends = numFriends;
	}
}
