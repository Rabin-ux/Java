public class ReverseNameArray {
    public static void main(String[] args) {

        char[] name = {'R','a','b','i','n',' ','R','a','j',' ','C','h','a','u','d','h','a','r','y'};
        int i = 0;
        int j = name.length - 1;
        char temp;
        while (i < j) {
            temp = name[i];
            name[i] = name[j];
            name[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed string: ");
        for (int k = 0; k < name.length; k++) {
            System.out.print(name[k]);
        }
    }
}
