package Unit;

public class Witch extends Man {

    int magic;
    String name;

    public Witch(float hp, int maxHp, int damage, int att, int def, int magic, int speed, int x, int y) {
        super(hp, maxHp, damage, att, def, speed, x, y);
        this.magic = magic;
    }




    
}
