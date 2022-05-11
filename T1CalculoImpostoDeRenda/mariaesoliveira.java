import java.util.Scanner;

// esse é meu primeiro trabalho de fundamentos da programção
public class mariaesoliveira
    {
        public static void main(String[]args){   
        
            int taxa;
            double salario;
            double total;
            double taxa1, taxa2, taxa3, taxa4, taxa5;
            taxa1=taxa2=taxa3=taxa4=taxa5=0;
            
            Scanner in = new Scanner (System.in);
            
            System.out.print("Informe aqui seu salário: R$");
            salario = in.nextDouble(); 
            
        if (salario <=1903.98){
                taxa = 1;
                taxa1= 0;        
        }
        else if (salario >= 1903.99 && salario <= 2826.65){
                taxa= 2;
                taxa1= 0;
        }
         else if (salario >= 2826.66 && salario <=3751.05){
                taxa= 3;
                taxa1= 0;
                taxa2= 69.20;
        }
        else if (salario >= 3751.06 && salario <=4664.68){
                taxa= 4;
                taxa1= 0;
                taxa2= 69.20;
                taxa3= 138.66;
        }
        else{
                taxa= 5;
                taxa1= 0;
                taxa2= 69.20;
                taxa3= 138.66;
                taxa4= 205.56;
        }
        
        switch (taxa){
            
            case 1:
              taxa1= 0;
              total = taxa1;
              
              System.out.printf("%s\n", "1ª Faixa: Isento.");
              System.out.printf("%s %2.2f %s\n", "Serão pagos: R$",total,"reais de imposto a Receita Federal.");
                  
              break;
              
            case 2:
                taxa2= ((salario-1903.98)*0.075);
                total=taxa1+taxa2;
                
                System.out.printf("%s\n", "1ª Faixa: Isento.");
                System.out.printf("%s %2.2f\n", "2ª Faixa:R$", taxa2);
                System.out.printf("%s %2.2f %s\n", "Serão pagos: R$:",total,"reais de imposto a Receita Federal.");
                    
                break;
                
            case 3:
                taxa3= (((salario-2826.66)*0.15));
                total=taxa1+taxa2+taxa3;
                
                System.out.printf("%s\n", "1ª Faixa: Isento.");
                System.out.printf("%s %2.2f\n", "2ª Faixa: R$", taxa2);
                System.out.printf("%s %2.2f\n", "3ª Faixa: R$", taxa3);
                System.out.printf("%s %2.2f %s\n", "Serão pagos: R$",total,"reais de imposto a Receita Federal.");
                    
                break;
                    
            case 4:
                taxa4= (((salario-3751.06)*0.225));
                total=taxa1+taxa2+taxa3+taxa4;
                
                System.out.printf("%s\n", "1ª Faixa: Isento.");
                System.out.printf("%s %2.2f\n", "2ª Faixa: R$", taxa2);
                System.out.printf("%s %2.2f\n", "3ª Faixa: R$", taxa3);
                System.out.printf("%s %2.2f\n", "4ª Faixa: R$", taxa4);
                System.out.printf("%s %2.2f %s\n", "Serão pagos: R$",total,"reais de imposto a Receita Federal.");
                    
                break;
                    
            case 5:
                taxa5= (((salario-4664.68)*0.275));
                total=taxa1+taxa2+taxa3+taxa4+taxa5;
                
                System.out.printf("%s\n", "1ª Faixa: Isento.");
                System.out.printf("%s %2.2f\n", "2ª Faixa: R$", taxa2);
                System.out.printf("%s %2.2f\n", "3ª Faixa: R$", taxa3);
                System.out.printf("%s %2.2f\n", "4ª Faixa: R$", taxa4);
                System.out.printf("%s %2.2f\n", "5ª Faixa: R$", taxa5);
                System.out.printf("%s %2.2f %s\n", "Serão pagos: R$",total,"de imposto a Receita Federal.");
                    
                break;
                    
                    default:
                        System.out.println("Valor não aceito.");
        }
    }    
}
