
/**
 * Abstract class representing a Demon creature.
 * 
 * Demons have a chance to deal bonus damage in addition to their
 * normal attack. This class is not meant to be instantiated directly,
 * but extended by specific demon types.
 *
 * @author Aaron Baxter 
 * @version 2026.04.27
 */
public abstract class Demon extends Creature
{
    /**
     * Constructs a Demon with the given strength and hit points.
     * 
     * @param str the strength of the demon
     * @param hp the hit points of the demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Calculates attack damage with a 5% chance to add 50 bonus damage.
     * @return the total damage dealt
     */
    @Override
    public int attack()
    {
        int damage = super.attack();

        // 5% chance to add 50 damage
        if (Randomizer.nextInt(20) == 1) {
            damage = damage + 50;
        }

        return damage;
    }
}