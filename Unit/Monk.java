package Unit;

public class Monk extends Witch {

    public Monk(float hp, int maxHp, int damage, int att, int def, int magic, int speed,int x, int y) {
        super(hp, maxHp, damage, att, def, magic, speed, x, y);
        super.name = name;
    }


    public Monk(String name){
        super(30, 30, -4, 12, 7, 1, 5,0 ,0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Монах! ";
    } 

    @Override
    public void step() {}

}
