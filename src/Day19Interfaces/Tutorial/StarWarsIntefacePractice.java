package Day19Interfaces.Tutorial;

import java.util.Random;

public interface StarWarsIntefacePractice {

    public static Character summonCharacter() {
        Random rand = new Random();
        if ((Math.abs(rand.nextInt()) % 2) == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }


    public static void main(String[] args) {
        Enemy darkVader = new Enemy();
        Hero ObiWanKenobi = new Hero();

        darkVader.attack();
        ObiWanKenobi.attack();
        darkVader.heal();
        ObiWanKenobi.heal();

        System.out.println("Enemy weapon " + darkVader.getWeapon());
        System.out.println("Hero weapon " + ObiWanKenobi.getWeapon());

        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }
}
