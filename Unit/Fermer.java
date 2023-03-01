package Unit;

public class Fermer extends Man {

    
    int cartridge;
    String name;

    public Fermer(float hp, int maxHp, int damage, int att, int def, int cartridge, int speed, int x, int y) {
        super(hp, maxHp, damage, att, def, speed, x, y);
        this.cartridge = cartridge;
    }




    public Fermer(String name){
        super(1, 1, 1, 1, 1,3, 0, 0);
        this.cartridge = 1;
        super.name = name;
    }


    @Override
    public String getInfo() {
        return "Я - Крестьянин! ";
    }

    @Override
    public void step() {}

    
    
}
