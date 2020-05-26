/* Türk lirası oalrak girilen paranın parametreli metod kullanarak diğer para birimlerine dönüştüren bir uygulamadır*/

package odev.pkg7;
import java.util.Scanner; //Scanner sınıfını kütüphaneye ekledik.
public class Odev7 
{
    public static void main(String[] args) 
    {
        int para; //int türünde para adında değişken oluşturduk.
        String tür; String veri türünde tür adında değişken oluşturduk.
        Scanner girdi = new Scanner(System.in); //klavyeden değer almamızı sağlayan sınıfı çağırdık.
        for (int i = 1; i > 0; i++) //döngü kullanarak tekrar tekrar aynı işlemi yapabildik.
        {  
        System.out.println("Elinizdeki Türk Lirası Miktarını Giriniz"); //ekranda yazan ifade.
        para =girdi.nextInt(); //klavyeden değer alabildik.
        System.out.println("Hangi Para Birimine Dönüştürmek İstersiniz(dolar,euro,leva,paund,ruble)");
        //ekranda yazan ifade.
        tür = girdi.next(); //klavyeden değer almamızı sağlar.   
        switch(tür) //sorgu yapabilmek için bu ifadeyi kullandık.
        {
            case "dolar": //eğer ki dolar yazarsak. 
                dolar(para); //dolar metodunu çağırır.
            break; işlemi bitirir.
            case "euro": //eğer ki euro yazarsak.
                euro(para); euro metodunu çağırır.
            break; işlemi bitirir.
            case "leva": //eğer ki leva yazarsak.
                leva(para); leva metodunu çağırır.
            break; işlemi bitirir.
            case "paund": //eğer ki paund yazarsak.
                paund(para); paund metodunu çağırır.
            break; işlemi bitirir.
            case "ruble": //eğer ki ruble yazarsak.
                ruble(para); ruble metodunu çağırır.
            break; işlemi bitirir.
            default: //eğer ki hiçbir koşul sağlanmaz ise;
                System.out.println("Lütfen Belirtilen Para Birimlerinden Birini Giriniz"); //ekrana yazar.    
        }       
        }
     }   
    static double dolar(int a) //dolar metodu oluşturduk.(parametreli)
    {
     double b; //double veri türünde b değişkeni oluşturduk.
     double dolar=6.82; //double veri türünde dolar değişkeni oluşturduk.
     b=a/dolar; //yapılan işlemi b değişkenine atadık.
     System.out.println(a+"TL = "+b+"Dolar"); //ekrana yazdırdık.
    return b; //geri değer döndürdük.
    }
    static double euro(int a) //euro metodu oluşturduk.(parametreli)
    {
     double b; //double veri türünde b değişkeni oluşturduk.
     double euro=7.43; //double veri türünde euro değişkeni oluşturduk.
     b=a/euro; //yapılan işlemi b değişkenine atadık.
     System.out.println(a+"TL = "+b+"Euro"); //ekrana yazdırdık.
    return b; //geri değer döndürdük.
    }
    static double leva(int a) //leva metodu oluşturduk.(parametreli)
    {
     double b; //double veri türünde b değişkeni oluşturduk.
     double leva=3.80; //double veri türünde leva değişkeni oluşturduk.
     b=a/leva; //yapılan işlemi b değişkenine atadık.
     System.out.println(a+"TL = "+b+"Leva"); //ekrana yazdırdık.
    return b; //geri değer döndürdük.
    }
    static double paund(int a) //paund metodu oluşturduk.(parametreli)
    {
     double b; //double veri türünde b değişkeni oluşturduk.
     double paund=8.31; //double veri türünde paund değişkeni oluşturduk.
     b=a/paund; //yapılan işlemi b değişkenine atadık.
     System.out.println(a+"TL = "+b+"Paund"); //ekrana yazdırdık.
    return b; //geri değer döndürdük.
    }
    static double ruble(int a) //ruble metodu oluşturduk.(parametreli)
    {
     double b; //double veri türünde b değişkeni oluşturduk.
     double ruble=0.95; //double veri türünde ruble değişkeni oluşturduk.
     b=a/ruble; //yapılan işlemi b değişkenine atadık.
     System.out.println(a+"TL = "+b+"Ruble"); //ekrana yazdırdık.
    return b; //geri değer döndürdük.
    }
}

