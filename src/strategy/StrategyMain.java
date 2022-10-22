package strategy;

import iterator.Array;
import iterator.Item;
import iterator.Iterator;

public class StrategyMain {

    public static void doGof(){
        System.out.println("==== StrategyMain.doIterator start ====");
        SumPrinter cal = new SumPrinter();

        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 10);
        System.out.println("==== StrategyMain.doIterator end ====");
    }

}
