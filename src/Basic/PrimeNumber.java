package Basic;
public class PrimeNumber {
	public static void main(String[] args) {
        String  primeNumbers = "";
        for(int i = 1; i <= 150; i++){
            int counter=0;
            for(int j = i; j >= 1; j--) {
                if(i % j == 0){
                	counter += 1;
                }
            }
            if (counter == 2) {
    			primeNumbers = primeNumbers + i + " ";
            }
        }
		
        System.out.println("The Prime Numbers are:" + primeNumbers);
	}
}
