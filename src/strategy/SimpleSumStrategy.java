package strategy;

public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
        System.out.println("SimpleSumStrategy.get");
        int sum = N;
        for (int i = 1; i < N; i++) {
            sum += i;
        }
        return sum;
    }
}
