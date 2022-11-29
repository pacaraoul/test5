import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int nr;
        int upperBound=100;
        Random number=new Random();
        nr= number.nextInt(upperBound);
        System.out.println("the initial number is "+nr);
        primeNumber(nr);

    }

    public static void primeNumber(int nr){
        int divisorCounter=0;
        int i;
        while(true){
            nr++;

            divisorCounter=0;
            for( i=2;i<=nr/2;i++){

                if(nr%i==0){
                    divisorCounter++;
                    break;

                }

            }
            if(divisorCounter==0){
                System.out.println("the first primeNumber after the initial number is "+nr);
                return;
            }

        }


    }
}
