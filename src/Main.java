public class Main {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;

        System.out.println("Prime numbers less equal than 100:");
        while (number <= 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(count + ": ");
                System.out.println(number);
            }
            number++;
        }
    }
}