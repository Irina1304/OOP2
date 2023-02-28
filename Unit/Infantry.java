package Unit;

public class Infantry extends Man {

    int range;
    String name;


    public Infantry(float hp, int maxHp, int damage, int att, int def, int range) {
        super(hp, maxHp, damage, att, def);
        this.range = range;
    }

    
    
}
