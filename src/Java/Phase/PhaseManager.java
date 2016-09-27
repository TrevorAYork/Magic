package Java.Phase;

import Java.Phase.Phases.*;

import java.util.ArrayList;

public class PhaseManager {

    ArrayList<Phase> phases;

    public PhaseManager() {
        phases = new ArrayList<>();
        addAll();
    }

    public void passPhase() {
        phases.remove(0);
        if (phases.size() == 0) {
            addAll();
        }
    }

    public Phase getCurrentPhase() {
        return phases.get(0);
    }

    private void addAll() {
        phases.add(new Untap());
        phases.add(new Upkeep());
        phases.add(new Draw());
        phases.add(new Main());
        phases.add(new Combat());
        phases.add(new DeclareAttackers());
        phases.add(new DeclareBlockers());
        phases.add(new Damage());
        phases.add(new Main());
        phases.add(new End());
        phases.add(new Cleanup());
    }
}
