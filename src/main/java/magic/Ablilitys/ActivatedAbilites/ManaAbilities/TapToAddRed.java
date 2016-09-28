package magic.Ablilitys.ActivatedAbilites.ManaAbilities;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.Mana;
import magic.Mana.RedMana;

import java.util.ArrayList;

public class TapToAddRed extends TapToAddMana {

    public TapToAddRed(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new RedMana());
        this.setManaToAdd(mana);
    }
}
