package _06_duck;

public class duckRunner {
	public static void main(String[] args) {
		duck daffy = new duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		cat ella = new cat("fish", 10);
		ella.meow();
		ella.play();
	}
}
