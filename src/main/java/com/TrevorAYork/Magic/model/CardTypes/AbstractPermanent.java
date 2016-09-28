package com.TrevorAYork.Magic.model.CardTypes;

import java.util.ArrayList;
import java.util.Collection;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ActivatedAbility;
import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.HasActivatedAbility;
import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

public abstract class AbstractPermanent extends AbstractCard implements Permanent, HasActivatedAbility {

    private ManaCost manaCost;
    private boolean tapped;
    private ArrayList<ActivatedAbility> activatedAbilities;

    public AbstractPermanent(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, owner, controller);
        this.manaCost = manaCost;
        activatedAbilities = new ArrayList<>();
    }

    public void setManaCost(ManaCost manaCost) {
        this.manaCost = manaCost;
    }

    public ManaCost getManaCost() {
        return manaCost;
    }

    public void setTapped(boolean tapped) {
        this.tapped = tapped;
    }

    public boolean isTapped() {
        return tapped;
    }

    public void useAbility(int activatedAbility) {
        if (activatedAbility < activatedAbilities.size()) {
            activatedAbilities.get(activatedAbility).activate();
        }
    }

    public void addAbility(ActivatedAbility activatedAbility) {
        this.activatedAbilities.add(activatedAbility);
    }

    public void removeAbility(ActivatedAbility activatedAbility) {
        this.activatedAbilities.remove(activatedAbility);
    }

    public Collection<ActivatedAbility> getActivatedAbilities() {
        return activatedAbilities;
    }
}
