public class FactorialRunner {


    public static long factorial(int number){
        long result = 1;
        for (int i=1; i<=number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 20;

        long millisActualTime = System.currentTimeMillis();
        for(int i=1; i<=x; i++){
            System.out.println(i+"! : "+factorial(i));
        }
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime+" ms");

        Thread[] array = new Thread[x];
        long millisActualTime2 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = new Thread(new Factorial(i+1));
            array[i].start();
        }
        long executionTime2 = System.currentTimeMillis() - millisActualTime2;
        System.out.println(executionTime2+" ms");

        System.out.println("Różnica między jednym wątkiem a wieloma wątkami :"+(executionTime-executionTime2)+" ms");
    }
}
