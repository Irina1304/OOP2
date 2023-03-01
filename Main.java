import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Unit.XBowMan;
import Unit.Bandit;
import Unit.Fermer;
import Unit.Mag;
import Unit.Man;
import Unit.Monk;
import Unit.Names;
import Unit.Sniper;
import Unit.Spearman;



public class Main {

    public static void main(String[] args) {

        Sniper man = new Sniper(getName());
        XBowMan man1 = new XBowMan(getName());
        Fermer man2 = new Fermer(getName());
        Bandit man3 = new Bandit(getName());
        Spearman man4 = new Spearman(getName());
        Monk man5 = new Monk(getName());
        Mag man6 = new Mag(getName());

        System.out.println(man.getInfo());
        System.out.println(man1.getInfo());
        System.out.println(man2.getInfo());
        System.out.println(man3.getInfo());
        System.out.println(man4.getInfo());
        System.out.println(man5.getInfo());
        System.out.println(man6.getInfo());


        ArrayList<Man> arrayList = new ArrayList<>();
        arrayList.sort(new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        ArrayList<Man> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей первой команды
            Man.createArreyUnit1(list1, Man.setClass());
        }

        System.out.println("1 команда:");

        for (int i = 0; i < list1.size(); i++) {

            System.out.print(list1.get(i).getInfo());
        }

        ArrayList<Man> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей второй команды 
            Man.createArreyUnit2(list2, Man.setClass());
        }

        System.out.println();

        System.out.println("2 команда:");

        for (int i = 0; i < list2.size(); i++) {

            System.out.print(list2.get(i).getInfo());
        }



        
    }

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }







}
