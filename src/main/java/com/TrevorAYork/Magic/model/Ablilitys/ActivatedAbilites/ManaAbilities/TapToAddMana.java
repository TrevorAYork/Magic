package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ActivatedAbility;
import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.CardTypes.Creatures.Creature;
import com.TrevorAYork.Magic.model.Mana.Mana;

import java.util.ArrayList;

public class TapToAddMana implements ActivatedAbility, ManaAbility {

    private AbstractPermanent permanent;
    private ArrayList<Mana> manaToAdd;

    public TapToAddMana(AbstractPermanent permanent) {
        this.permanent = permanent;
        manaToAdd = new ArrayList<>();
    }

    public void activate() {
        if (permanent instanceof Creature) {
            if (((Creature)permanent).isSick())
                return;
        }
        if (!permanent.isTapped()) {
            permanent.setTapped(true);
            for (Mana mana : manaToAdd) {
                permanent.getController().getManaPool().addMana(mana);
            }
        }
    }

    public void setManaToAdd(ArrayList<Mana> manaToAdd) {
        this.manaToAdd = manaToAdd;
    }
}
