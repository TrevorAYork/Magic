package Java.CardTypes.Creatures;

import Java.CardTypes.AbstractPermanent;
import Java.CardTypes.CardTypes;
import Java.Mana.ManaCost;
import Java.Player.Player;

public abstract class AbstractCreature extends AbstractPermanent implements Creature {

    private int power;
    private int toughness;
    private boolean sick;

    public AbstractCreature(String name, ManaCost manaCost, int power, int toughness, Player owner, Player contoller) {
        super(name, manaCost, owner, contoller);
        this.getCardTypes().add(CardTypes.Creature);
        this.power = power;
        this.toughness = toughness;
        this.sick = true;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public boolean isSick() {
        return this.sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getManaCost() + "\n" + this.getCardTypes() + "\n" + power + "/" + toughness;
    }
}
