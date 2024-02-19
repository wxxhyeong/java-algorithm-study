package 우형.ch23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P91 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println("fib1(n) = " + fib1(n));
        System.out.println("fib2(n) = " + fib2(n));
        System.out.println("fib3(n) = " + fib3(n));
        System.out.println("fib4(n) = " + fib4(n));


    }


    // 1. 재귀 풀이
    public static int fib1(int n) {
        //System.out.println("fibonacci n = "+n);
        if (n == 1) {
            return 1;
        }
        else if (n==0) {
            return 0;
        }

        return fib1(n - 1) + fib1(n - 2);
    }

    // 2. while을 이용한 반복문 풀이
    public static int fib2(int n) {
        int num1 = 0;
        int num2 = 1;
        int sum = num1 + num2;

        //System.out.print(num1 + " " + num2 +" ");
        for (int i = 0; i < n - 1; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            //System.out.print(sum + " ");
        }

        return sum;
    }

    // 3. 상향식 접근 bottom up 풀이
    public static int fib3(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n];
    }

    // 4. 하향식 접근 Top down 풀이
    public static int fib4(int n) {
        int[] arr = new int[n + 1];

        if (n <= 1)
            return n;

        if (arr[n] != 0) {
            return arr[n];
        }

        arr[n] = fib4(n - 1) + fib4(n - 2);

        return arr[n];
    }
}
