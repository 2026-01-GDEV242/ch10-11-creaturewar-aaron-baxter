
/**
 * Represents a basic human creature.
 * 
 * Humans have moderate strength and hit points and do not possess
 * any special attack abilities beyond the base Creature attack.
 * 
 * Strength range: 5–20
 * Hit point range: 5–25
 * 
 * @author Aaron Baxter
 * @version 2026.04.27
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 25;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_STR = 20;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_STR - MIN_HUMAN_STR)+ MIN_HUMAN_STR,
            Randomizer.nextInt(MAX_HUMAN_HP - MIN_HUMAN_HP) + MIN_HUMAN_HP        
        );

    }

    @Override
    public int attack(){
        return super.attack();
    }

    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
