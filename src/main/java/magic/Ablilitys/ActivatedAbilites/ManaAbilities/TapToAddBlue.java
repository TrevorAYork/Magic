package magic.Ablilitys.ActivatedAbilites.ManaAbilities;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.BlueMana;
import magic.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlue extends TapToAddMana {

    public TapToAddBlue(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlueMana());
        this.setManaToAdd(mana);
    }
}
