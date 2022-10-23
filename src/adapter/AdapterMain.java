package adapter;

import iterator.Array;
import iterator.Item;
import iterator.Iterator;

import java.util.ArrayList;

public class AdapterMain {
    public static void doGof(){
        System.out.println("==== AdapterMain.doGof start ====");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("우주"));
        animals.add(new Dog("댕이"));
        animals.add(new Cat("냥이"));
//        animals.add(new Tiger("호랑이"));
        animals.add(new TigerAdapter("랭이"));

        animals.stream().iterator()
                .forEachRemaining(animal -> animal.sound());

        System.out.println("==== AdapterMain.doGof end ====");
    }
}
