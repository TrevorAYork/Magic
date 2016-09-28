package com.TrevorAYork.Magic.model.CardTypes;

import com.TrevorAYork.Magic.model.Mana.ManaCost;

public interface Permanent {

    void setManaCost(ManaCost convertedManaCost);

    ManaCost getManaCost();

    void setTapped(boolean tapped);

    boolean isTapped();
}
