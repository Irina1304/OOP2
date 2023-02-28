package Unit;

public class Mag extends Monk {

    public Mag(String name){
        super(100, 100, 18, 6, 2, 22);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Маг! ";
    }

    @Override
    public void step() {}
    
}
