package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.BlueMana;
import Java.Mana.Mana;

public class TapToAddBlue extends TapToAddMana {

    public TapToAddBlue(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlueMana());
        this.setManaToAdd(mana);
    }
}
