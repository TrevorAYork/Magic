package magic.Ablilitys.ActivatedAbilites.ManaAbilities;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.GreenMana;
import magic.Mana.Mana;

import java.util.ArrayList;

public class TapToAddGreen extends TapToAddMana {

    public TapToAddGreen(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new GreenMana());
        this.setManaToAdd(mana);
    }
}
