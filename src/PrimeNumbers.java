import java.util.Scanner;

/**
 * Created by Maciej Procyk on 29.03.2018.
 */
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner inputKeyboard = new Scanner(System.in);
        int minNumber = inputKeyboard.nextInt();
        int maxNumber = inputKeyboard.nextInt();

        Erastotenes.showPrimes(minNumber, maxNumber);
        System.out.println();

        int numberToCheck = inputKeyboard.nextInt();
        System.out.println(PrimeChecker.ifPrime(numberToCheck));

        int sizeOfArray = 20;
        int[] table = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            table[i] = (int) (Math.random()*sizeOfArray);
        }
        System.out.println();

        int[] primeNumbers = PrimeChecker.ifTableHasPrimes(table);

        for(int i = 0; i < table.length; i++){
            System.out.printf("%4d", table[i]);
        }

        System.out.println();

        for (int i = 0; i < primeNumbers.length; i++){
            System.out.printf("%4d", primeNumbers[i]);
        }
    }
}
