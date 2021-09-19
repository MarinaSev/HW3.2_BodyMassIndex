public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 60;
        int heightSm = 170;
        int bMI = service.calculate(weightKg, heightSm);
        System.out.println(bMI);
    }
}
