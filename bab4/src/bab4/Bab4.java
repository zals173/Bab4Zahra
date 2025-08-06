package bab4;

/**
 *
 * @author MyHP
 */
public class Bab4 {

    public static String variabel1;
    public static String variabel2;
    public static int var1, var2, var3;

    public static void main(String[] args) {
        // Contoh 1: nilai default
        System.out.println("variabel1 -> " + variabel1);
        System.out.println("variabel2 -> " + variabel2);

        // Contoh 2: multi deklarasi
        System.out.println("multi deklarasi -> " + var1);
        System.out.println("multi deklarasi -> " + var2);
        System.out.println("multi deklarasi -> " + var3);

        // Contoh 3: setelah diisi
        variabel1 = "Hello";
        variabel2 = "World";

        System.out.println("Setelah diisi:");
        System.out.println("variabel1 -> " + variabel1);
        System.out.println("variabel2 -> " + variabel2);

        // Contoh 4: konversi string ke angka
        String str1 = "1234567899";
        String str2 = "3.14";
        String str3 = "1";

        int bulat = Integer.parseInt(str1);
        double pecahan = Double.parseDouble(str2);
        short bulat2 = Short.parseShort(str3);

        System.out.println("konversi bilangan bulat = " + bulat);
        System.out.println("konversi bilangan pecahan = " + pecahan);
        System.out.println("konversi bilangan bulat2 = " + bulat2);

        // Contoh 5: pembagian
        int a = 5;
        int b = 3;
        System.out.println("Hasil pembagian integer : " + a / b);
        System.out.println("Hasil pembagian double : " + (double) a / b);
    }
}