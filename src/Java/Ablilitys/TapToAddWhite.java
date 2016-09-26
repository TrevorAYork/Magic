package Java.Ablilitys;

import java.util.ArrayList;

import Java.CardTypes.AbstractPermanent;
import Java.Mana.Mana;
import Java.Mana.WhiteMana;

public class TapToAddWhite extends TapToAddMana {

    public TapToAddWhite(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new WhiteMana());
        this.setManaToAdd(mana);
    }
}
