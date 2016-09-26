package Java.CardTypes;

import Java.Mana.ManaCost;

public interface Permanent {

    void setManaCost(ManaCost convertedManaCost);

    ManaCost getManaCost();

    void setTapped(boolean tapped);

    boolean isTapped();
}
