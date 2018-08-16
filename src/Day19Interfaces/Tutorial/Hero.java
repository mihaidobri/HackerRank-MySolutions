package Day19Interfaces.Tutorial;

public class Hero implements Character {

    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    public void heal() {
        System.out.println("The hero heals you");
    }

    public String weapon = "lightsaber";

    public String getWeapon() {
        return weapon;
    }
}
