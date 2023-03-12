import java.util.Scanner;
class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        return (int) (0.5 * alas.doubleValue() * tinggi.doubleValue());
    }

    public double getResultAsDouble() {
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isBalik=true,ulang=true,isNumber = true;
        int pilihh;
        double base;
        double height;
        while(isBalik){
        System.out.println("=====LUAS SEGITIGA MASBRO====");
        System.out.println("1.Hasil Integer \n2.Hasil double\n3.Keluar");
        int choice= input.nextInt();
        switch (choice) {
            case 1:
                while(ulang) {
                    System.out.print("Masukkan Alas: ");
                    base = input.nextDouble();
                    if (Double.isNaN(base)) {
                        System.out.println("inputanmu bukan angka");
                        ulang=true;
                    }
                    System.out.print("Masukkan Tinggi: ");
                    height = input.nextDouble();
                    if (Double.isNaN(height)) {
                        System.out.println("inputanmu bukan angka");
                        ulang=true;
                    }
                    Segitiga<Double> segitigaint = new Segitiga<>(base, height);
                    System.out.println("Luas Segitiga as int: " + segitigaint.getResultAsInt());
                    System.out.println("\n Mau Hitung Lagi? 1. Ya \n 2. Gak dulu");
                    pilihh = input.nextInt();
                    if (pilihh == 1) {
                        isBalik = true;
                    } else if (pilihh == 2) {
                        System.exit(0);
                    } else {
                        System.out.println("pilihannya cuman 2 gausah banyak minta gw matiin nih");
                        System.exit(0);
                    }
                }
                break;
            case 2:
                while(ulang){
                System.out.print("Masukkan Alas: ");
                base = input.nextDouble();
                    if (Double.isNaN(base)) {
                        System.out.println("inputanmu bukan angka");
                        ulang=true;
                    }
                System.out.print("Masukkan Tinggi: ");
                height = input.nextDouble();
                    if (Double.isNaN(height)) {
                        System.out.println("inputanmu bukan angka");
                        ulang=true;
                    }

                Segitiga<Double> segitigadouble = new Segitiga<>(base, height);
                System.out.println("Luas Segita as double: " + segitigadouble.getResultAsDouble());
                System.out.println("\n Mau Hitung Lagi? 1. Ya \n 2. Gak dulu");
                pilihh= input.nextInt();
                if(pilihh == 1){
                    isBalik=true;
                }else if (pilihh == 2){
                    System.exit(0);
                }else {
                    System.out.println("pilihannya cuman 2 gausah banyak minta gw matiin nih");
                    System.exit(0);
                }
                }
                break;
            case 3:
                System.exit(0);

            default:
                break;
            }
        }
    }

}