public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        int kilograms = 98;
        int bmi = (int) service.calculate(meters, kilograms);
        System.out.println(bmi);
    }
}