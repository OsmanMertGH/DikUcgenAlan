import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;

        double c,UcgeninCevresi,u,UcgenAlan;

        Scanner input=new Scanner(System.in);
        System.out.print("A Kenarı Giriniz:");
        a=input.nextDouble();

        System.out.print("B Kenarı Giriniz:");
        b=input.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.println("Hipotonüs:"+c);

        //Alan Hesaplama Kısmı

        UcgeninCevresi=a+b+c;
        u=UcgeninCevresi/2;

        UcgenAlan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+UcgenAlan);


    }
}