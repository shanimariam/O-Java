package sample;

public class Proarray {

    public static void main(String[] args) {
        int sum = 0;
        int a[] = new int[5];
        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        
        System.out.println("Sum of array elements: " + sum);
    }

}
