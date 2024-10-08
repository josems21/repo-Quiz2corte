
package vectortipofloat;

import java.util.Scanner;

public class VectortipoFloat {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    float []  altura;
        altura=new float[5];
        for(int i=0;i<5;i++){
            System.out.println("Ingrse la altura de la persona: ");
            altura[i]=sc.nextFloat();        
        }
        float suma=0,promedio=0;
        for(int w=0;w<5;w++){
            suma=suma+altura[w];
        }
        System.out.println("la suma de la altura es: " +suma);
        promedio=suma/5;
        System.out.println("el promedio de la altura es: "+promedio);
        int may, men;
        may=0;
        men=0;
  
        for (int w=0;w<5;w++){
            if (altura[w]>promedio){
                may++;
            }else if (altura[w]<promedio){
                men++;
            }
        }
        System.out.println("la cantidad mayor de las alturas es : "+may);
        System.out.println("la cantidad menor de las alturas es: "+men);
    }
    
    
}
