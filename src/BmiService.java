public class BmiService {
    public float calculate(int weight, float height) {
        float result;
        result = weight / ((height / 100) * (height / 100));
        return result;
        }
}

