class student {
    String name;
    int age;

    student(){
        name = "Rabin";
        age = 19;
    }
void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main{
    public static void main(String[] args) {
        student student1 = new student();
        student1.display();
    }
}