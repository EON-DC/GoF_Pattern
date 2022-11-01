package fasade;

public class FasadeMain {
    public static void doGof() {
        System.out.println("FasadeMain.doGof");

//        DBMS dbms = new DBMS();
//        Cache cache = new Cache();
        String name = "park";

        Fasade fasade = new Fasade();
        fasade.run(name);

    }
}
