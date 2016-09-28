package com.TrevorAYork.Magic.model.Phase;

import java.util.ArrayList;

import com.TrevorAYork.Magic.model.Phase.Phases.Cleanup;
import com.TrevorAYork.Magic.model.Phase.Phases.Combat;
import com.TrevorAYork.Magic.model.Phase.Phases.Damage;
import com.TrevorAYork.Magic.model.Phase.Phases.DeclareAttackers;
import com.TrevorAYork.Magic.model.Phase.Phases.DeclareBlockers;
import com.TrevorAYork.Magic.model.Phase.Phases.Draw;
import com.TrevorAYork.Magic.model.Phase.Phases.End;
import com.TrevorAYork.Magic.model.Phase.Phases.Main;
import com.TrevorAYork.Magic.model.Phase.Phases.Phase;
import com.TrevorAYork.Magic.model.Phase.Phases.Untap;
import com.TrevorAYork.Magic.model.Phase.Phases.Upkeep;

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
