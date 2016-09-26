package Java.Player;

import Java.Mana.ManaPool;

public class Player implements IPlayer{

    ManaPool manaPool;

    public Player() {
        manaPool = new ManaPool();
    }

    public ManaPool getManaPool() {
        return manaPool;
    }
}
