import java.util.Scanner;

/**
 * Created by Maciej Procyk on 29.03.2018.
 */
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner inputKeyboard = new Scanner(System.in);
        //int number = inputKeyboard.nextInt();

        Erastotenes.showPrimes(3, 12);
        System.out.println();
        System.out.println(PrimeChecker.ifPrime(12));

        int[] table = new int[100];
        for (int i = 0; i < 100; i++){
            table[i] = (int) (Math.random()*100);
        }

        Integer[] primeNumbers = PrimeChecker.ifTableHasPrimes(table);

        for (int i = 0; i < primeNumbers.length; i++){
            System.out.printf("%4d", primeNumbers[i]);
        }
    }
}
