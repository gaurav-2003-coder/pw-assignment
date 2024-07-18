package Combined_Array_and_Objects;

public class Q1 {
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adding two doubles
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Q1 q = new Q1();
        System.out.println(q.add(2, 3));
        System.out.println(q.add(2.3, 4.7));
        System.out.println(q.add(2, 3, 4));
    }
}
