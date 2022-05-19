package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		handy.eat();
		System.out.println(handy.getName() + "\n");
		
		Smurf papaSmurf = new Smurf("Papa");
		System.out.println(papaSmurf.getName());
		System.out.println("My hat is " + papaSmurf.getHatColor() + ".");
		System.out.println("I am a " + papaSmurf.isGirlOrBoy() + ".\n");
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println("My hat is " + smurfette.getHatColor() + ".");
		System.out.println("I am a " + smurfette.isGirlOrBoy() + ".");
	}

}
