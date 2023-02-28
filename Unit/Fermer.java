package Unit;

public class Fermer extends Man {

    
    int cartridge;
    String name;

    public Fermer(float hp, int maxHp, int damage, int att, int def, int cartridge) {
        super(hp, maxHp, damage, att, def);
        this.cartridge = cartridge;
    }




    public Fermer(String name){
        super(50, 50, 2, 1, 1);
        this.cartridge = 6;
        super.name = name;
    }


    @Override
    public String getInfo() {
        return "Я - Крестьянин! ";
    }

    @Override
    public void step() {}

    
    
}
