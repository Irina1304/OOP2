package Unit;
public class XBowMan extends Archer {



    public XBowMan(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist, String name, int speed, int x, int y) {
        super(hp, maxHp, damage, att, def, shots, maxShots, dist, speed, x, y);
        super.name = name;
    }

    public XBowMan(String name){
        super(10, 10, 3, 6, 3, 16, 16, 5, 4, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Арбалетчик! ";
    }

    @Override
    public void step() {}


    
}
