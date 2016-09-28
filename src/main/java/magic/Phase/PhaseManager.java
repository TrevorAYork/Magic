package magic.Phase;

import java.util.ArrayList;

import magic.Phase.Phases.Cleanup;
import magic.Phase.Phases.Combat;
import magic.Phase.Phases.Damage;
import magic.Phase.Phases.DeclareAttackers;
import magic.Phase.Phases.DeclareBlockers;
import magic.Phase.Phases.Draw;
import magic.Phase.Phases.End;
import magic.Phase.Phases.Main;
import magic.Phase.Phases.Phase;
import magic.Phase.Phases.Untap;
import magic.Phase.Phases.Upkeep;

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
