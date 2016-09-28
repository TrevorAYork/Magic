package com.TrevorAYork.Magic.model.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TrevorAYork.Magic.model.Mana.ManaPool;

@Component
public class Player implements IPlayer{

    @Autowired
    ManaPool manaPool;

    public ManaPool getManaPool() {
        return manaPool;
    }
}
