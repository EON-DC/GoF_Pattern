package factory;

public class Sword implements Item {
    @Override
    public void use() {
        System.out.println("칼을 휘둘렀다.");
    }
}
