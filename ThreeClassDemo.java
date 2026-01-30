// Class 1: Instance method call
class A {
    void show() {
        System.out.println("Class A: Instance method call");
    }
}

// Class 2: Static method call
class B {
    static void display() {
        System.out.println("Class B: Static method call");
    }
}

// Class 3: Constructor call
class C {
    C() {
        System.out.println("Class C: Constructor call");
    }
}

// Main class
public class ThreeClassDemo {
    public static void main(String[] args) {

        // Object call for instance method
        A objA = new A();
        objA.show();

        // Class name call for static method
        B.display();

        // Constructor call
        C objC = new C();
    }
}
