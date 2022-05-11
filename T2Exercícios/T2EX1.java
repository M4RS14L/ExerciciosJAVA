import java.util.Scanner;
public class T2EX1{
    public static void main(String[]args){
        double chico=1.50;
        double zé=1.10;
        int anos;
        
        for (anos=0;zé<=chico;anos++){
            
            zé=zé+0.03;
            chico=chico+0.02;

        }
        
        System.out.println("O tempo que vai levar até que Zé ultrapasse a altura de Chico é "+anos+" anos.");
        
        System.out.printf("Chico terá %.2f de altura.\n",chico);
        System.out.printf("Zé terá %.2f de altura.\n",zé);
        
    }
}