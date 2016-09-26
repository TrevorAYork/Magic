import java.util.ArrayList;
import java.util.Collection;

import Java.CardTypes.CardTypes;
import Java.Cards.DryadArbor;
import Java.Cards.Forest;
import Java.Cards.GrislyBear;
import Java.Player.Player;

public class Main {

    public static void main (String Args[]) {

        Player player = new Player();
        Forest forest = new Forest(player);
        forest.useAbility(0);
        DryadArbor dryad = new DryadArbor(player);
        dryad.setSick(false);
        //dryad.setTapped(true);
        dryad.useAbility(0);
        System.out.println(player.getManaPool().getNumGreenMana());
    }
}
