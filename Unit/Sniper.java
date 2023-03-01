package Unit;
public class Sniper extends Archer {

        public Sniper(String name){
        super(15, 15, 10, 12, 10, 32, 32, 5, 9, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Снайпер! ";
    }

    @Override
    public void step() {}
}
