package Questions;

public class Mest {
    private int sum;
    public int compute(){
        int x = 0;
        while (x<3) {
            sum += x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Mest m = new Mest();
        int sum = m.compute();
        sum = m.compute();
        m.compute();
        System.out.println(sum);
    }
}
