package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 1, temp, i;
        System.out.println(a);
        System.out.println(b);
        for(i=3; i <=lastFibonacci; i++)
        {
            temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
