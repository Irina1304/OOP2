package Unit;

public class Spearman extends Bandit {

    public Spearman(String name){
        super(100, 100, 18, 6, 2, 22);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я - Копейшик! ";
    }

    @Override
    public void step() {}
    
}
