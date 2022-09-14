package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int res;
        int num = t;
        for(res = 0; num != 0; num = num/10)
        {
            res = res + num % 10;
        }
        if (t < 0){
            System.out.println(res * -1);
        }else {
            System.out.println(res);
        }



    }
}
