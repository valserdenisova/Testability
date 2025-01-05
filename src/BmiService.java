public class BmiService {
    public double calculate (double meters, int kilograms) {
        double index;
        double meters2 = meters * meters;
        index = kilograms/ meters2;
        return (int) index;
    }
}
