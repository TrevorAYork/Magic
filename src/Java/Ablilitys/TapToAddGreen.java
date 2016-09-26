package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.GreenMana;
import Java.Mana.Mana;

public class TapToAddGreen extends TapToAddMana {

    public TapToAddGreen(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new GreenMana());
        this.setManaToAdd(mana);
    }
}
