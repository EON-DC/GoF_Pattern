package flyweight;

import bridge.*;

public class FlyweightMain {
    public static void doGof(){
        System.out.println("==== BridgeMain.doGof start ====");
        Number number = new Number(434331);
        number.print(5, 5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("==== BridgeMain.doGof end ====");
    }
}
