class Factorial implements Runnable {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    private long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        th.setName("Thread " + number);
        System.out.println(th.getName() + "\n" + number + "! : " + factorial(number));
    }
}
