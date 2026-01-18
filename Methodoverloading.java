public class Methodoverloading {

    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        Methodoverloading obj = new Methodoverloading();

        obj.add(50, 80);
        obj.add(50, 80, 100);
        obj.add(9.5, 8.5);   
    }
}
