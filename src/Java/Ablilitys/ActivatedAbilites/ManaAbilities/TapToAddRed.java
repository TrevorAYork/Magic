package Java.Ablilitys.ActivatedAbilites.ManaAbilities;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.Mana;
import Java.Mana.RedMana;

import java.util.ArrayList;

public class TapToAddRed extends TapToAddMana {

    public TapToAddRed(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new RedMana());
        this.setManaToAdd(mana);
    }
}
