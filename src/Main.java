import Java.Phase.PhaseManager;

public class Main {

    public static void main (String Args[]) {

//        Player player = new Player();
//        Forest forest = new Forest(player);
//        forest.useAbility(0);
//        DryadArbor dryad = new DryadArbor(player);
//        dryad.setSick(false);
//        //dryad.setTapped(true);
//        dryad.useAbility(0);
//        System.out.println(player.getManaPool().getNumGreenMana());
        PhaseManager phaseManager = new PhaseManager();
        for (int i = 0; i < 35; i++) {
            System.out.println(phaseManager.getCurrentPhase());
            phaseManager.passPhase();
        }
    }
}
