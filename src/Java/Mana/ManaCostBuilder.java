package Java.Mana;

import java.util.ArrayList;

public class ManaCostBuilder {

    public static ManaCost build(final String manaCostString) {

        ArrayList<Mana> mana = new ArrayList<>();

        for (int j = 0; j < extractNumber(manaCostString); j++) {
            mana.add(new GenericMana());
        }

        for (char c : manaCostString.toCharArray()){
            String cString = "" + c;
            if (cString.equals(ManaConstatns.BLACK_MANA)) {
                mana.add(new BlackMana());
            } else if (cString.equals(ManaConstatns.BLUE_MANA)) {
                mana.add(new BlueMana());
            } else if (cString.equals(ManaConstatns.GREEN_MANA)) {
                mana.add(new GreenMana());
            } else if (cString.equals(ManaConstatns.RED_MANA)) {
                mana.add(new RedMana());
            } else if (cString.equals(ManaConstatns.WHITE_MANA)) {
                mana.add(new WhiteMana());
            }
        }

        return new ManaCost(mana);
    }

    private static int extractNumber(final String str) {

        if (str == null || str.isEmpty()) return 0;

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                found = true;
            } else if (found) {
                // If we already found a digit before and this char is not a digit, stop looping
                break;
            }
        }

        return Integer.valueOf(sb.toString());
    }
}
