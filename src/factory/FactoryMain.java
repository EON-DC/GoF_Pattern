package factory;


public class FactoryMain {
    public static void doGof(){
        System.out.println("==== FactoryMain.doGof start ====");
        Factory itemFactory = new ItemFactory();
        Item item1 = itemFactory.create("sword");
        if(item1 != null) item1.use();

        Item item2 = itemFactory.create("sword");
        if(item2 != null) item2.use();

        Item item3 = itemFactory.create("sword");
        if(item3 != null) item3.use();

        itemFactory.create("shield");
        itemFactory.create("shield");
        itemFactory.create("shield");
        itemFactory.create("shield");
        itemFactory.create("shield");

        itemFactory.create("bow");
        itemFactory.create("bow");
        itemFactory.create("bow");
        System.out.println("==== FactoryMain.doGof end ====");
    }
}
