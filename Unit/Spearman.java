package Unit;

public class Spearman extends Bandit {

    public Spearman(String name){
        super(10, 10, 3, 4, 5, 4, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Копейшик! ";
    }

    @Override
    public void step() {}
    
}
