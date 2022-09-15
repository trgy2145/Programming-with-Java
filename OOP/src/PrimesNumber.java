public class PrimesNumber {
    public static void main(String[] args) {
        int number = 100;
        
        for(int i = 3 ; i <= number ; i++){
            boolean isPrime = true;
            for(int j = 2; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
    
}
