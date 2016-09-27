package Java.Ablilitys.ActivatedAbilites.ManaAbilities;

import Java.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddMana;
import Java.CardTypes.AbstractPermanent;
import Java.Mana.Mana;
import Java.Mana.WhiteMana;

import java.util.ArrayList;

public class TapToAddWhite extends TapToAddMana {

    public TapToAddWhite(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new WhiteMana());
        this.setManaToAdd(mana);
    }
}
