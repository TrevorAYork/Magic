package Java.Ablilitys.ActivatedAbilites.ManaAbilities;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.BlackMana;
import Java.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlack extends TapToAddMana {

    public TapToAddBlack(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlackMana());
        this.setManaToAdd(mana);
    }
}
