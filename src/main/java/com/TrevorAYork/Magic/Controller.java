package com.TrevorAYork.Magic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TrevorAYork.Magic.model.Cards.Land.DryadArbor;
import com.TrevorAYork.Magic.model.Cards.Land.Forest;
import com.TrevorAYork.Magic.model.Player.Player;

@RestController
@Component
public class Controller {

    @Autowired
    Player player;

    @RequestMapping("/")
    String home() {
        Forest forest = new Forest(player);
        forest.useAbility(0);
        DryadArbor dryad = new DryadArbor(player);
        dryad.setSick(false);
        //dryad.setTapped(true);
        dryad.useAbility(0);
//        PhaseManager phaseManager = new PhaseManager();
//        for (int i = 0; i < 35; i++) {
//            System.out.println(phaseManager.getCurrentPhase());
//            phaseManager.passPhase();
//        }

        return player.getManaPool().getNumGreenMana() + " ";
    }
}
