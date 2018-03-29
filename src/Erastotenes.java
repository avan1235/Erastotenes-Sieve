class Erastotenes {
    private boolean[] sieve;
    private int size;
    private static final int shift = 2;
    private boolean sieveCreated = false;

    private Erastotenes(int size){
        this.size = size;
        this.sieve = new boolean[this.size - 1];

        for(int i = 0; i<this.size-1; i++){
            sieve[i] = true;
        }
    }
    /*
     * Odpowiednikiem dwójki będzie wypełnienie tablicy sieve[0]
     * a dalej już zmieniać się będzie wskaźnik w sposób liniowy
     */

    private void createSieve(){
        for(int i = shift; i*i<=this.size; i++){
            if(this.sieve[i-shift] == true){
                int j = i*i;
                while (j <= this.size){
                    sieve[j-shift] = false;
                    j += i;
                }
            }
        }
        this.sieveCreated = true;
    }

    private boolean ifCreated(){
        return this.sieveCreated;
    }

    private static void showPrimes(int minNumber, int maxNumber){
        Erastotenes mySieve = new Erastotenes(maxNumber);
        mySieve.createSieve();
        if (mySieve.ifCreated() == true){
            for(int i = minNumber; i <= maxNumber; i++){
                if(mySieve.returnPrimeNumberChecker(i) == true)
                    System.out.printf("%4d", i);
            }
        }
    }

    private boolean returnPrimeNumberChecker(int number) {
        return number >= 2 && this.sieve[number - shift];
    }
}
