package Unit;

public class Monk extends Witch {

    public Monk(float hp, int maxHp, int damage, int att, int def, int magic) {
        super(hp, maxHp, damage, att, def, magic);
        super.name = name;
    }


    public Monk(String name){
        super(150, 150, 12, 5, 3, 22);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Монах! ";
    } 

    @Override
    public void step() {}

}
