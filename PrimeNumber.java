import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count =0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if(count!=0){
            System.out.print(number+" is not a prime number");
        }else{
            System.out.print(number+" is  a prime number");
        }
    }
}
