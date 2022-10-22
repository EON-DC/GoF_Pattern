package strategy;

public class GaussSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
        System.out.println("GaussSumStrategy.get");
        return (N + 1) * N / 2;
    }
}
