package _06_duck;

public class duck {
	int numberOfFriends;
	String favoriteFood;
	void quack() {
		System.out.println("Quaaaccckkk!");
	}
	void waddle() {
		System.out.println("**the duck is waddling forward**");
	}
	public duck(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
	}
}

