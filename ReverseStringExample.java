public class ReverseStringExample {
    public static void main(String[] args) {
        String name = "Rabin Raj Chaudhary";
        String reversed = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversed);
    }
}
