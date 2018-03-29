import java.util.Scanner;

/**
 * Created by Maciej Procyk on 29.03.2018.
 */
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner inputKeyboard = new Scanner(System.in);
        int number = inputKeyboard.nextInt();

        Erastotenes mySieve = new Erastotenes(number);
        mySieve.createSieve();
        if(mySieve.ifPrime(number) == true)
            System.out.println("Liczba pierwsza");
        else
            System.out.println("Nie liczba pierwsza");
    }
}
