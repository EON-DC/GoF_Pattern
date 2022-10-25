package factory;

public class Bow implements Item {
    @Override
    public void use() {
        System.out.println("화살을 쐈다.");
    }
}
