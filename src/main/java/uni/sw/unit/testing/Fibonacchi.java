package uni.sw.unit.testing;

public class Fibonacchi {
    // public static void main(String[] args)
    // {
    //     createFibonacchi();
    //     System.out.println(getFibonacchiElement(8));
    // }

    public static int[] createFibonacchi() {
        int[] fibonacchi = new int[30];
        fibonacchi[0] = 0;
        fibonacchi[1] = 1;
        for(int i = 2; i <= 29; i++)
        {
            fibonacchi[i] = fibonacchi[i-1]+fibonacchi[i-2];
            System.out.println(i+1+". "+fibonacchi[i]);
        }
        return fibonacchi;
    }

    public int getFibonacchiElement(int number) {
        int[] fibonacchi = createFibonacchi();
        return fibonacchi[number-1];
    }
}
