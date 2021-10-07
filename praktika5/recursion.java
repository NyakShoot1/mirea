//Main снизу PeppoClown

package com.company;

public class recursion {

    void task2(int n, int N)
    {
        System.out.println(N);
        if(N < n)
        {
            task2(n, N+1);
        }
    }

    int task5(int N)
    {
        if (N/10!=0)
            return ((N % 10) + task5(N/10));
        else
            return N % 10;
    }

    public String task3(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            if (firstNum == secondNum)
                return Integer.toString(firstNum);
            return firstNum + " " + task3(firstNum - 1, secondNum);
        } else {
            if (firstNum == secondNum)
                return Integer.toString(firstNum);
            return firstNum + " " + task3(firstNum + 1, secondNum);
        }
    }

    public static void main(String[] args) {
        recursion rec = new recursion();
        rec.task2(100, 1);
        System.out.println('\n');
        System.out.println(rec.task5(3241));
        System.out.println('\n');
        System.out.println(rec.task3(30, 20));
    }
}
