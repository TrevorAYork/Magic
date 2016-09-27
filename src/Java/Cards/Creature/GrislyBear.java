package Java.Cards.Creature;

import Java.CardTypes.Creatures.AbstractCreature;
import Java.Mana.ManaCostBuilder;
import Java.Player.Player;

public class GrislyBear extends AbstractCreature {

    public GrislyBear(Player owner) {
        super("Grisly Bear", ManaCostBuilder.build("1G"), 2, 2, owner, owner);
    }
}
