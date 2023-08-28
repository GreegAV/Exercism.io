package dnd;

import java.util.Arrays;

class DnDCharacter {

    private final int dex;
    private final int hp;
    private final int con;
    private final int str;
    private final int intel;
    private final int wis;
    private final int cha;

    public DnDCharacter() {
        dex = ability();
        con = ability();
        hp = 10 + modifier(con);
        str = ability();
        intel = ability();
        wis = ability();
        cha = ability();
    }

    int ability() {
        int[] rnds = {(int) (10 * Math.random() % 6 + 1), (int) (10 * Math.random() % 6 + 1), (int) (10 * Math.random() % 6 + 1), (int) (10 * Math.random() % 6 + 1)};
        Arrays.sort(rnds);
        return rnds[1] + rnds[2] + rnds[3];
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return str;
    }

    int getDexterity() {
        return dex;
    }

    int getConstitution() {
        return con;
    }

    int getIntelligence() {
        return intel;
    }

    int getWisdom() {
        return wis;
    }

    int getCharisma() {
        return cha;
    }

    int getHitpoints() {
        return hp;
    }

}
