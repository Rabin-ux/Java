public class ReverseUsingPredefined {
    public static void main(String[] args) {
        String str = "Rabin Raj Chaudhary";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
