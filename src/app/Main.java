package app;

public class Main {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 6) {
            for (int j = 1; j <= 21; j += i) {
                System.out.println("Num is " + i + " , sum is " + j);
                i++;
            }
            System.out.println("----------------------");

            int[] num = new int[]{1, 2, 3, 4, 5, 6};
            int sum=0;
            for (int k:num) {
               sum +=k;
            }
            System.out.println("Sum of numbers is "+sum);

        }

    }

}



















