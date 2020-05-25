
package odev.pkg7;

import java.util.Scanner;

public class Odev7 
{
    public static void main(String[] args) 
    {
        int para;
        String tür;
        Scanner girdi = new Scanner(System.in);
        for (int i = 1; i > 0; i++) 
        {  
        System.out.println("Elinizdeki Türk Lirası Miktarını Giriniz");
        para =girdi.nextInt();
        System.out.println("Hangi Para Birimine Dönüştürmek İstersiniz(dolar,euro,leva,paund,ruble)");
        tür = girdi.next();   
        switch(tür)
        {
            case "dolar":
                dolar(para);
            break;
            case "euro":
                euro(para);
            break;
            case "leva":
                leva(para);
            break;
            case "paund":
                paund(para);
            break;
            case "ruble":
                ruble(para);
            break;
            default:
                System.out.println("Lütfen Belirtilen Para Brimlerinden Birini Giriniz");    
        }       
        }
     }   
    static double dolar(int a)
    {
     double b;
     double dolar=6.82;
     b=a/dolar;
     System.out.println(a+"TL = "+b+"Dolar");
    return b;
    }
    static double euro(int a)
    {
     double b;
     double euro=7.43;
     b=a/euro;
     System.out.println(a+"TL = "+b+"Euro");
    return b;
    }
    static double leva(int a)
    {
     double b;
     double leva=3.80;
     b=a/leva;
     System.out.println(a+"TL = "+b+"Leva");
    return b;
    }
    static double paund(int a)
    {
     double b;
     double paund=8.31;
     b=a/paund;
     System.out.println(a+"TL = "+b+"Paund");
    return b;
    }
    static double ruble(int a)
    {
     double b;
     double ruble=0.95;
     b=a/ruble;
     System.out.println(a+"TL = "+b+"Ruble");
    return b;
    }
}
