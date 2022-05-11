import java.util.Scanner;

public class regrasParaVotar
{
    public static void main(String[] args){
        
    int anoNascimento, idade;
    int situacao = ' ';//0 = não pode votar;
                       //1 = voto é obrigatório;
                       //2 = pode votar mas é opcional;
    Scanner in = new Scanner(System.in);                   
   
    System.out.print("Informe o seu ano de nascimento: ");
    anoNascimento = in.nextInt();
            
    idade = 2022 - anoNascimento;
    
    if(idade < 16){
       situacao = 0;
    }else if((idade >= 18)&&(idade < 70)){
        situacao = 1;
    }else if( ((idade >= 16)&&(idade < 18))||(idade >= 70)){
        situacao = 2;
    }else{
        situacao = ' ';
    }
  
    switch(situacao){
      case 0:
           System.out.println("Você não pode votar com " + idade + " anos.");
           break;
      case 1:
           System.out.println("Você deve obrigatoriamente votar com " + idade + " anos.");
           break;
      case 2:
           System.out.println("Você pode votar com " + idade + " anos, mas não é obrigaório.");
           break;
      default:
          System.out.println("Situação não esperada para " + idade + " anos.");
          break;
    }
  }    
}
