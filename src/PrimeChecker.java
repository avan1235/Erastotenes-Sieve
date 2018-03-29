import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciej Procyk on 29.03.2018.
 */
public class PrimeChecker {

    public static boolean ifPrime(int numberToCheck){
        Erastotenes mySieve = new Erastotenes(numberToCheck);
        mySieve.createSieve();
        if(mySieve.ifCreated() == true)
            return mySieve.returnPrimeNumberChecker(numberToCheck);
        else
            return false;
    }

    public static Integer[] ifTableHasPrimes(int[] tableOfNumbers){
        int maxNumber = tableOfNumbers[0];
        for(int i = 1; i < tableOfNumbers.length; i++){
            if(tableOfNumbers[i] > maxNumber)
                maxNumber = tableOfNumbers[i];
        }

        Erastotenes mySieve = new Erastotenes(maxNumber);
        mySieve.createSieve();

        List< Integer > results = new ArrayList< Integer >() ;

        if(mySieve.ifCreated() == true){
            for(int i = 0; i < tableOfNumbers.length; i++){
                if(mySieve.returnPrimeNumberChecker(tableOfNumbers[i]) == true){
                    results.add(tableOfNumbers[i]);
                }
            }
        }
        else
            System.out.println("Problem during creating Erastotenes sieve.");

        Integer[] tableToReturn = new Integer[results.size()];
        results.toArray(tableToReturn);

        return tableToReturn;
    }
}
