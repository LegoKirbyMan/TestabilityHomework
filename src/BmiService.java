public class BmiService {
    public int calculate(Double Height, Double Weight) {
        int BmiIndex = (int) (Weight / (Height * Height));
        return BmiIndex;
    }
}
