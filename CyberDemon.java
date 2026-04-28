
/**
 * Represents a CyberDemon, a powerful type of Demon.
 * 
 * CyberDemons inherit demon attack behavior and have high
 * strength and hit points.
 * 
 * Strength range: 20–40
 * Hit point range: 25–100
 *
 * @author Aaron Baxter
 * @version 2026.04.27
 */
public class CyberDemon extends Demon 
{
    private static final int MAX_HP = 100;
    private static final int MIN_HP = 25;
    private static final int MAX_STR = 40;
    private static final int MIN_STR = 20;

    /**
     * Constructs a CyberDemon with randomized strength and hit points
     * within the defined range.
     */
    public CyberDemon() {
        super(
            Randomizer.nextInt(MAX_STR - MIN_STR) + MIN_STR,
            Randomizer.nextInt(MAX_HP - MIN_HP) + MIN_HP
        );
    }

    /**
     * Performs an attack using Demon attack behavior.
     * 
     * @return the total damage dealt
     */
    @Override
    public int attack() {
        return super.attack();
    }
}