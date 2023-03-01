package Unit;

public class Mag extends Monk {

    public Mag(String name){
        super(30, 30, -5, 17, 12, 1, 9, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Маг! ";
    }

    @Override
    public void step() {}
    
}
