package flyweight;

import bridge.*;

public class FlyweightMain {
    public static void doGof(){
        System.out.println("==== FlyweightMain.doGof start ====");
        Number number = new Number(434331);
        number.print(20, 8);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("==== FlyweightMain.doGof end ====");
    }
}
