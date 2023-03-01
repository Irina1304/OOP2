package Unit;

public class Bandit extends Infantry {

    public Bandit(float hp, int maxHp, int damage, int att, int def, int speed, int x, int y) {
        super(hp, maxHp, damage, att, def, speed, x, y);
        super.name = name;
    }

    public Bandit(String name){
        super(10, 10, 4, 8, 3, 6, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Разбойник! ";
    }

    @Override
    public void step() {}



    
    
}
