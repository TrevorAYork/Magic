import Java.Cards.Land.DryadArbor;
import Java.Cards.Land.Forest;
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
