package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.Mana;
import Java.Mana.RedMana;

public class TapToAddRed extends TapToAddMana {

    public TapToAddRed(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new RedMana());
        this.setManaToAdd(mana);
    }
}
