import java.util.stream.IntStream;

public class PrimeGenerator {

    public static void main(String[] args) {
        System.out.println("Prime Generaor");

        int count=100;
        IntStream.rangeClosed(2,500).forEach(num -> {
            int mid = num/2;
            int flag=0;
            for(int i=2;i<=mid;i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println("Prime Number: " + num);
            }

        });
    }
}
