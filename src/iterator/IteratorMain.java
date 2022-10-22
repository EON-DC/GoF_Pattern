package iterator;

public class IteratorMain {

    public static void doGof(){
        System.out.println("==== IteratorMain.doIterator start ====");
        Item[] items = {
                new Item("CPU", 1000),
                new Item("Keyboard", 2000),
                new Item("Mouse", 3000),
                new Item("HDD", 50)
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while(it.next())

        {
            Item item = (Item) it.current();
            System.out.println(item);
        }
        System.out.println("==== IteratorMain.doIterator end ====");
    }

}
