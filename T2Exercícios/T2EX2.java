import java.util.Scanner;  

public class T2EX2{ 
    
    public static void main(String[]args){  
            
            int n;
            int divisor;
            int divisores=0;
            
            System.out.printf("Um número perfeito é aquele que é igual a soma dos seus divisores.\n");
                
                System.out.print("Digite um número inteiro maior que zero: ");
                Scanner in= new Scanner(System.in);
                n= in.nextInt();
                
            for(divisor=1; divisor<n; divisor++){
                    
                if ((n%divisor)==0){
                    divisores+=divisor;
                    }
                    
            }
            
            if (divisores==n){
                        
                        System.out.println("O número "+n+" é um número perfeito :)");
                    
                        }
                    else{
                        
                        System.out.println("O número "+n+" não é um número perfeito :(");
                    
            }
    }
} 