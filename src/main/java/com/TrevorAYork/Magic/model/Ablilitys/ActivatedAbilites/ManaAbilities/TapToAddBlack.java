package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.BlackMana;
import com.TrevorAYork.Magic.model.Mana.Mana;

import java.util.ArrayList;

public class TapToAddBlack extends TapToAddMana {

    public TapToAddBlack(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new BlackMana());
        this.setManaToAdd(mana);
    }
}
