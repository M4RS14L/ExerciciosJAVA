import java.util.Scanner;

import java.util.Random;

class T2EX3{
    
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de eleitores: ");
        
        int eleitores= in.nextInt();
        Random rand = new Random();
        
        int votos=0, vContados;
        int candidato1=0, candidato2=0, candidato3=0, candidato4=0, nulo=0, branco=0;
        
        for (vContados=0; vContados<eleitores;vContados++){
            
            votos=1+rand.nextInt(6);
            
            if (votos==1){
                candidato1++;
    
            }
            else if(votos==2){
                candidato2++;
    
            }
            else if(votos==3){
                            candidato3++;
    
            }
            else if(votos==4){
                            candidato4++;
    
            }
            else if(votos==5){
                            nulo++;
    
            }else if(votos==6){
                            branco++;
    
            }
        
        }
        
        System.out.printf("\nVotos que o candidato 1 recebeu: "+candidato1);
        System.out.printf("\nVotos que o candidato 2 recebeu: "+candidato2);
        System.out.printf("\nVotos que o candidato 3 recebeu: "+candidato3);
        System.out.printf("\nVotos que o candidato 4 recebeu: "+candidato4);
        System.out.printf("\n\nVotos nulos: "+nulo);
        System.out.printf("\nVotos em branco: "+branco);
        
    }
}