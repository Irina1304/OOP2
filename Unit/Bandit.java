package Unit;

public class Bandit extends Infantry {

    public Bandit(float hp, int maxHp, int damage, int att, int def, int range) {
        super(hp, maxHp, damage, att, def, range);
        super.name = name;
    }

    public Bandit(String name){
        super(150, 150, 12, 5, 3, 22);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Разбойник! ";
    }

    @Override
    public void step() {}



    
    
}
