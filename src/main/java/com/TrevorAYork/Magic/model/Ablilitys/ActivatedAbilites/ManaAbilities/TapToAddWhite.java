package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.Mana;
import com.TrevorAYork.Magic.model.Mana.WhiteMana;

import java.util.ArrayList;

public class TapToAddWhite extends TapToAddMana {

    public TapToAddWhite(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new WhiteMana());
        this.setManaToAdd(mana);
    }
}
