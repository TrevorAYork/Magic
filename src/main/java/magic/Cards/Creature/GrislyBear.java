package magic.Cards.Creature;

import magic.CardTypes.Creatures.AbstractCreature;
import magic.Mana.ManaCostBuilder;
import magic.Player.Player;

public class GrislyBear extends AbstractCreature {

    public GrislyBear(Player owner) {
        super("Grisly Bear", ManaCostBuilder.build("1G"), 2, 2, owner, owner);
    }
}
