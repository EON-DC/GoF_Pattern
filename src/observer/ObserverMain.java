package observer;


public class ObserverMain {
    public static void doGof(){
        System.out.println("==== ObserverMain.doGof start ====");
        DiceGame diceGame = new FairDiceGame();
        Player player1 = new EvenBettingPlayer("짝궁");
        Player player2 = new OddBettingPlayer("홀홀");
        Player player3 = new OddBettingPlayer("홀에 진심");

        diceGame.addPlayer(player1);
        diceGame.addPlayer(player2);
        diceGame.addPlayer(player3);

        for (int i = 0; i < 5; i++) {
            diceGame.play();
            System.out.println();
        }
        System.out.println("==== ObserverMain.doGof end ====");
    }
}
