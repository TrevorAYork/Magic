package Java.Ablilitys.ActivatedAbilites.ManaAbilities;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.BlueMana;
import Java.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlue extends TapToAddMana {

    public TapToAddBlue(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlueMana());
        this.setManaToAdd(mana);
    }
}
