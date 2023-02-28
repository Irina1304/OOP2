package Unit;
public class XBowMan extends Archer {



    public XBowMan(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, att, def, shots, maxShots, dist);
        super.name = name;
    }

    public XBowMan(String name){
        super(150, 150, 12, 5, 3, 22, 22, 3);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Арбалетчик! ";
    }

    @Override
    public void step() {}


    
}
