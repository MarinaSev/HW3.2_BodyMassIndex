public class BmiService {
    public int calculate (int weightKg, int heightSm) {
        int weightGm = weightKg * 1000;
        int bMI = 10 * weightGm / (heightSm * heightSm);
        return bMI;
    }
}
