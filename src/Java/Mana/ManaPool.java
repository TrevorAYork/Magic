package Java.Mana;

import java.util.ArrayList;
import java.util.Collection;

public class ManaPool {

    //Not in WUBRG order
    private Collection<BlackMana> blackManaPool;
    private Collection<BlueMana> blueManaPool;
    private Collection<GenericMana> genericManaPool;
    private Collection<GreenMana> greenManaPool;
    private Collection<RedMana> redManaPool;
    private Collection<WhiteMana> whiteManaPool;

    public ManaPool() {
        this.blackManaPool = new ArrayList<>();
        this.blueManaPool = new ArrayList<>();
        this.genericManaPool = new ArrayList<>();
        this.greenManaPool = new ArrayList<>();
        this.redManaPool = new ArrayList<>();
        this.whiteManaPool = new ArrayList<>();
    }

    public void addMana(Mana mana) {
        if (mana instanceof BlackMana)
            blackManaPool.add((BlackMana)mana);
        else if (mana instanceof BlueMana)
            blueManaPool.add((BlueMana)mana);
        else if (mana instanceof GreenMana)
            greenManaPool.add((GreenMana)mana);
        else if (mana instanceof RedMana)
            redManaPool.add((RedMana)mana);
        else if (mana instanceof WhiteMana)
            whiteManaPool.add((WhiteMana)mana);
        else genericManaPool.add((GenericMana)mana);
    }

    public int getNumGreenMana(){
        return greenManaPool.size();
    }
}
