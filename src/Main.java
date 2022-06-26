public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilo = 62;
        float centimeters = 166;
        float bmi = service.calculate(kilo, centimeters);
        System.out.println(bmi);
    }
}
