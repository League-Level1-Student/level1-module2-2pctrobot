package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf smuf = new Smurf("Papa Smurf");
		System.out.println(smuf.getName());
		smuf.eat();
		System.out.println(smuf.getHatColor());
		System.out.println(smuf.isGirlOrBoy());
	}
}
