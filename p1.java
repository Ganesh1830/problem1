package problems;

public class p1 {



    public static void main(String[] args) {

        int a[] = {45, 254, 1, 131, 13, 25, 6};

        int sumAll = 0;
        int sumEven = 0;
        int sumDiv5 = 0;
        int primeCount = 0;
        boolean palindromeFound = false;

        for (int i = 0; i < a.length; i++) {

            // a) sum of all elements
            sumAll = sumAll + a[i];

            // b) sum of even elements
            if (a[i] % 2 == 0) {
                sumEven = sumEven + a[i];
            }

            // c) sum divisible by 5
            if (a[i] % 5 == 0) {
                sumDiv5 = sumDiv5 + a[i];
            }

            // d) palindrome check
            int num = a[i];
            int rev = 0;
            int temp = num;

            while (temp > 0) {
                int r = temp % 10;
                rev = rev * 10 + r;
                temp = temp / 10;
            }

            if (num == rev) {
                palindromeFound = true;
            }

            // e) prime count
            int count = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primeCount++;
            }
        }

        System.out.println("Sum of all elements = " + sumAll);
        System.out.println("Sum of even elements = " + sumEven);
        System.out.println("Sum divisible by 5 = " + sumDiv5);

        if (palindromeFound)
            System.out.println("Palindrome present in array");
        else
            System.out.println("Palindrome not present");

        System.out.println("Prime numbers count = " + primeCount);
    }
}