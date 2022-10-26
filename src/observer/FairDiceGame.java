package observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {
    private Random random = new Random();

    @Override
    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("던진 주사위의 결과값 :" + diceNumber);

        Iterator<Player> iter = playerList.iterator();
        while (iter.hasNext()) {
            iter.next().update(diceNumber);
        }
    }
}
