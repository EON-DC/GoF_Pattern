package memento;

import java.util.Random;

public class MementoMain {
    public static void doGof(){
        Walker walker = new Walker(0, 0, 10, 10);
        String[] actions = {"UP", "RIGHT", "DOWN", "LEFT"};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while (true) {
            String action = actions[random.nextInt(4)];
            double distance = walker.walk(action);
            System.out.println(action + "  " + distance);

            if (distance == 0.0) {
                break;
            }
            if (minDistance > distance) {
                minDistance = distance;
                memento = walker.createMemento();
            } else {
                walker.restoreMemento(memento);
            }
        }
        System.out.println("walker = " + walker.toString());
    }
}
