package magic.Ablilitys.ActivatedAbilites.ManaAbilities;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.Mana;
import magic.Mana.WhiteMana;

import java.util.ArrayList;

public class TapToAddWhite extends TapToAddMana {

    public TapToAddWhite(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new WhiteMana());
        this.setManaToAdd(mana);
    }
}
