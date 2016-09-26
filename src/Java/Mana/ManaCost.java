package Java.Mana;

import java.util.Collection;

public class ManaCost {

    Collection<Mana> cost;

    public ManaCost(Collection<Mana> manaCost){
        cost = manaCost;
    }

    public String toString(){
        String manaString = "";
        int genericMana = 0;
        for (Mana mana : cost) {
            if (mana instanceof GenericMana) {
                genericMana++;
            } else
                manaString += mana.getSymbol();
        }
        return genericMana + manaString;
    }
}
