package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if(printToInclusive >= 1)
            System.out.println("1\n1");
        else if (printToInclusive == 0)
            System.out.println("1");
        else return;

        int factorial = 1;
        for (int i = 2; i <= printToInclusive; i++)
        {
            factorial *= i;
            System.out.println(factorial);
        }

    }
}
