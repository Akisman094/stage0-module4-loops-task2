package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power >= 0)
            System.out.println(1);
        else
            System.out.println("too much power");

        int powered = 1;
        for (int i = 1; i <= power; i++)
        {
            powered *= 2;
            System.out.println(powered);
        }
    }
}
