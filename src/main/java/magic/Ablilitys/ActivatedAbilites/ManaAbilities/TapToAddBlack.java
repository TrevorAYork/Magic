package magic.Ablilitys.ActivatedAbilites.ManaAbilities;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.BlackMana;
import magic.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlack extends TapToAddMana {

    public TapToAddBlack(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlackMana());
        this.setManaToAdd(mana);
    }
}
