package Day19Interfaces.Tutorial;

public class Enemy implements Character {

    public String weapon = "lightseaber";

    public Enemy() {

    }

    public String getWeapon() {
        return weapon;
    }

    public void attack() {
        System.out.println("The enemy attacks you");
    }

    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw() {
        System.out.println("draw weapon");
    }
}