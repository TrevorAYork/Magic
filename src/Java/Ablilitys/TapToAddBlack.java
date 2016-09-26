package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.BlackMana;
import Java.Mana.Mana;

public class TapToAddBlack extends TapToAddMana {

    public TapToAddBlack(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlackMana());
        this.setManaToAdd(mana);
    }
}
