import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeChecker {

    public static boolean ifPrime(int numberToCheck){
        Erastotenes mySieve = new Erastotenes(numberToCheck);
        mySieve.createSieve();
        if(mySieve.ifCreated() == true)
            return mySieve.returnPrimeNumberChecker(numberToCheck);
        else
            return false;
    }

    public static int[] ifTableHasPrimes(int[] tableOfNumbers){
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

        int[] tableToReturn = results.stream().mapToInt(Integer::intValue).toArray();

        return tableToReturn;
    }
}
