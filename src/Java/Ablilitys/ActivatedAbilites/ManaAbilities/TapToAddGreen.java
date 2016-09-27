package Java.Ablilitys.ActivatedAbilites.ManaAbilities;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.GreenMana;
import Java.Mana.Mana;

import java.util.ArrayList;

public class TapToAddGreen extends TapToAddMana {

    public TapToAddGreen(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new GreenMana());
        this.setManaToAdd(mana);
    }
}
