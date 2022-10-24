package singleton;

public class SingletonMain {
    public static void doGof(){
        System.out.println("==== SingletonMain.doGof start ====");
        // King king = new King(); // 생성 불가
        King king1 = King.getInstance();
        System.out.print("king1 : ");
        king1.say();

        King king2 = King.getInstance();
        System.out.print("king2 : ");
        king2.say();

        System.out.println("(king1 == king2) = " + (king1 == king2));

        System.out.println("==== SingletonMain.doGof end ====");
    }
}
