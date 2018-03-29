/**
 * Created by Maciej Procyk on 29.03.2018.
 */
public class Erastotenes {
    private boolean[] sieve;
    private int size;
    private static final int shift = 2;
    private boolean sieveCreated = false;

    public Erastotenes(int size){
        this.size = size;
        this.sieve = new boolean[this.size - 1];

        for(int i = 0; i<this.size-1; i++){
            sieve[i] = true;
        }

    }
    /*
     * Odpowiednikiem dwójkki będzie wypełnienie tablicy sieve[0]
     * a dalej już zmieniać się będzie wskaźnik w sposób liniowy
     */

    public void createSieve(){
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

    public void showPrimes(){
        for(int i = 0; i < this.sieve.length; i++){
            if(this.sieve[i] == true)
                System.out.printf("%4d", i+shift);
        }
    }

    public boolean ifPrime(int number){
        if (this.sieveCreated == true){
            return this.sieve[number-shift];
        }
        else{
            System.out.printf("\n\nERROR: Sieve has NOT been created yet.\nCannot check this number\n\n");
            return false;
        }
    }

}
