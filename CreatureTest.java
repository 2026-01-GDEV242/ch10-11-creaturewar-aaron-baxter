import java.util.ArrayList;

/**
 * Simulates a battle between two armies of creatures.
 * 
 * Uses ArrayLists and polymorphism to create and manage armies,
 * execute combat between creatures, and determine the winning army.
 * 
 * Demonstrates object-oriented principles including inheritance,
 * method overriding, and dynamic binding.
 * 
 * @author Aaron Baxter
 * @version 2026.04.27
 */
public class CreatureTest
{
    /**
     * Entry point for the battle simulation.
     * 
     * Creates two armies, runs the battle loop, and outputs
     * the results of the simulation.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ArrayList<Creature> goodArmy = new ArrayList<>();
        ArrayList<Creature> evilArmy = new ArrayList<>();

        // CREATE GOOD ARMY
        for (int i = 0; i < 100; i++) {
            int roll = Randomizer.nextInt(10);

            if (roll <= 6) {
                goodArmy.add(new Human());
            } else if (roll <= 8) {
                goodArmy.add(new Elf());
            } else {
                goodArmy.add(new Elf());
            }
        }

        // CREATE EVIL ARMY
        for (int i = 0; i < 40; i++) {
            int roll = Randomizer.nextInt(25);

            if (roll <= 18) {
                evilArmy.add(new Human());
            } else if (roll <= 24) {
                evilArmy.add(new CyberDemon());
            } else {
                evilArmy.add(new Balrog());
            }
        }

        System.out.println("Battle Begins!");
        System.out.println("----------------------------------");

        while (!goodArmy.isEmpty() && !evilArmy.isEmpty()) {

            Creature good = goodArmy.get(0);
            Creature evil = evilArmy.get(0);

            while (good.isAlive() && evil.isAlive()) {

                int goodDamage = good.attack();
                int evilDamage = evil.attack();

                evil.takeDamage(goodDamage);
                good.takeDamage(evilDamage);

                System.out.println("Good deals " + goodDamage + " | Evil deals " + evilDamage);
            }

            if (!good.isAlive()) {
                goodArmy.remove(0);
                System.out.println("Good creature defeated!");
            }

            if (!evil.isAlive()) {
                evilArmy.remove(0);
                System.out.println("Evil creature defeated!");
            }

            System.out.println("----------------------------------");
        }

        if (goodArmy.isEmpty() && evilArmy.isEmpty()) {
            System.out.println("Both armies have fallen!");
        } else if (goodArmy.isEmpty()) {
            System.out.println("Evil Army Wins!");
        } else {
            System.out.println("Good Army Wins!");
        }
    }

}