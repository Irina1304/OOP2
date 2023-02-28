package Unit;
public class Sniper extends Archer {

        public Sniper(String name){
        super(100, 100, 18, 6, 2, 22, 22, 3);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Снайпер! ";
    }

    @Override
    public void step() {}
}
