package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		spongebob.laugh();
		System.out.println(spongebob.getName());
		
		SeaCreature patrick = new SeaCreature("patrick");
		patrick.eat();
		patrick.laugh();
		System.out.println(patrick.getName());
		
		SeaCreature squidward = new SeaCreature("squidward");
		squidward.eat();
		squidward.laugh();
		System.out.println(squidward.getName());

	}

}
