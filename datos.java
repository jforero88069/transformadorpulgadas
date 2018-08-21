
/**
 * Write a description of class desviacionest here.
 * Este programa permite transformar centimetros, pies, yardas, lenguas a pulgadas
 * @autores ean grupo de trabajo Juan Forero
 * @version 20082018
 */
 

import java.util.*;
import java.lang.Math.*;
/** import java.util.* permite cargar varios directorios ademas del de escanear
 *  1 pulgada equivale a 0.0833 pies, 
 *  1 pulgada equivale a 2.54 centímetros, 
 *  1 legua equivale a 190080.02 pulgadas y 
 *  1 yarda son 36 pulgadas. 
 * 
 * 
 */
public class datos 
{
    static double P;
    static double C;
    static double L;
    static double Y;
    static double Pulgada;
    
    public static void main(String[] args)
    {
       Scanner medida=new Scanner(System.in);
       int opc;
       System.out.println("Seleccione la medida que desea pasar a pulgadas si,pies a pulgadas P, si YArdas a Pulgadas Y, si Centimetros a pulgadas C, si Lenguas a Pulgadas L");
       
       opc=medida.nextInt();
       
       switch(opc){
        case 1:
        System.out.println("ingrese la cantidad de pies a transformar a pulgadas");
        P=medida.nextDouble();
        Pulgada=P/0.0833;
        System.out.println(Pulgada+"pulgadas equivalen a "+P+"pies");
        break;
    }
       switch(opc){
        case 2:
        System.out.println("ingrese la cantidad de centimetros a transformar a pulgadas");
        C=medida.nextDouble();
        Pulgada=C/2.54;
        System.out.println(Pulgada+"pulgadas equivalen a "+C+" centimetro");
        break;
    }
       switch(opc){
        case 3:
        System.out.println("ingrese la cantidad de Lenguas a transformar a pulgadas");
        L=medida.nextDouble();
        Pulgada=L*190080.02;
        System.out.println(Pulgada+"pulgadas equivalen a "+L+" lenguas");
        break;
    }
       switch(opc){
        case 4:
        System.out.println("ingrese la cantidad de Yardas a transformar a pulgadas");
        Y=medida.nextDouble();
        Pulgada=Y*36;
        System.out.println(Pulgada+"pulgadas equivalen a "+Y+" Yardas");
        break;
    }
           
        }

    
    }


/**Fuentes:
 * #6 [Java] – Conversor de medidas de longitud I (1/2) [PROGRAMA RESUELTO] 2016 https://www.youtube.com/watch?v=gVoxppSrbeo
 * 
 * /
 */

