package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Man implements GameInterface {

    private static int manCnt;

    public static int getManCnt() {
        return manCnt;
    }

    private float hp;
    int damage, att, def, maxHp;
    public String name;
    
    public Man(float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        manCnt++;
    }

    public void setHp(float hp) {
        if (hp >= 0) this.hp = hp;
        this.hp = hp;
    }

    public float getHp() {
        return hp;
    }

    @Override
    public String getInfo() {return "Я человек";}

    @Override
    public void step() {}

    public static String setName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }

    public static void createArreyUnit(ArrayList<Man> arrayList, ClassesUnits classesUnits){
        switch (classesUnits){
            case Sniper -> arrayList.add(new Sniper(setName()));
            case Mag -> arrayList.add(new Mag(setName()));
            case Monk -> arrayList.add(new Mag(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Bandit -> arrayList.add(new Bandit(setName()));
            case Spearman -> arrayList.add(new Sniper(setName()));
            case XBowMan -> arrayList.add(new XBowMan(setName()));
        }
    }







    
}
