package Unit;
public abstract class Archer extends Man{

    int shots, maxShots;
    float dist;
    String name;

    
    public Archer(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist, int speed, int x, int y) {
        super(hp, maxHp, damage, att, def, speed, x, y);
        this.dist = dist;
        this.maxShots = maxShots;
        this.shots = shots;
    }


    

}