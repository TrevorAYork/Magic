package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.CardTypes.Creatures.Creature;
import Java.Mana.Mana;

public class TapToAddMana implements ActivatedAbility {

    private AbstractPermanent permanent;
    private ArrayList<Mana> manaToAdd;

    public TapToAddMana(AbstractPermanent permanent) {
        this.permanent = permanent;
        manaToAdd = new ArrayList<>();
    }

    public void activate() {
        if (permanent instanceof Creature) {
            if (((Creature)permanent).isSick())
                return;
        }
        if (!permanent.isTapped()) {
            permanent.setTapped(true);
            for (Mana mana : manaToAdd) {
                permanent.getController().getManaPool().addMana(mana);
            }
        }
    }

    public void setManaToAdd(ArrayList<Mana> manaToAdd) {
        this.manaToAdd = manaToAdd;
    }
}
