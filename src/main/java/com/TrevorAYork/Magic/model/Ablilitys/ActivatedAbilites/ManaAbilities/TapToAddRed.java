package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.Mana;
import com.TrevorAYork.Magic.model.Mana.RedMana;

import java.util.ArrayList;

public class TapToAddRed extends TapToAddMana {

    public TapToAddRed(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new RedMana());
        this.setManaToAdd(mana);
    }
}
