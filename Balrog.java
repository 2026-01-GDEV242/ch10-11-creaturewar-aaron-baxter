
/**
 * Represents a Balrog, an exceptionally powerful demon.
 * 
 * Balrogs attack twice per turn and also inherit the demon's
 * bonus damage ability.
 * 
 * Strength range: 50–100
 * Hit point range: 80–200
 *
 * @author Aaron Baxter
 * @version 2026.04.27
 */
public class Balrog extends Demon
{
    private static final int MAX_HP = 200;
    private static final int MIN_HP = 80;
    private static final int MAX_STR = 100;
    private static final int MIN_STR = 50;

    /**
     * Constructs a Balrog with randomized strength and hit points
     * within the defined range.
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_STR - MIN_STR) + MIN_STR,
            Randomizer.nextInt(MAX_HP - MIN_HP) + MIN_HP
        );
    }
    
    /**
     * Balrog attacks twice per turn, applying demon bonuses each time.
     * @return total damage from two attacks
     */
    @Override
    public int attack() {
        int damage1 = super.attack(); // first attack
        int damage2 = super.attack(); // second attack
        
        return damage1 + damage2;
    }
}