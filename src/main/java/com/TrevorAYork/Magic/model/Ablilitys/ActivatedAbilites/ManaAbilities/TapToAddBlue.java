package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.BlueMana;
import com.TrevorAYork.Magic.model.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlue extends TapToAddMana {

    public TapToAddBlue(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlueMana());
        this.setManaToAdd(mana);
    }
}
