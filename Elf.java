
/**
 * Represents an Elf creature with magical abilities.
 * 
 * Elves have a chance to deal double damage on attack due to
 * their magical nature.
 * 
 * Strength range: 5–18
 * Hit point range: 8–25
 *
 * @author Aaron Baxter
 * @version 2026.04.27
 */
public class Elf extends Creature
{
    private static final int MAX_HP = 25;
    private static final int MIN_HP = 8;
    private static final int MAX_STR = 18;
    private static final int MIN_STR = 5;

    /**
     * Constructs an Elf with randomized strength and hit points 
     * within the defined elf range.
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_STR - MIN_STR) + MIN_STR,
            Randomizer.nextInt(MAX_HP - MIN_HP) + MIN_HP
        );
    }

    /**
     * Calculates attack with a 10% chance to double damage.
     * @return total damage dealt
     */
    @Override
    public int attack() {
        int damage = super.attack();

        // 10% chance for double damage
        if (Randomizer.nextInt(10) == 1) {
            damage = damage * 2;
        }

        return damage;
    }
}