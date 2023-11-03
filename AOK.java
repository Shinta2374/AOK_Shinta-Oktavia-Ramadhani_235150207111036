//DUNIAILKOM
import java.util.Scanner;

public class AOK {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih konversi:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Heksadesimal");
        System.out.println("4. Heksadesimal ke Biner");
        System.out.println("5. Desimal ke Heksadesimal");
        System.out.println("6. Heksadesimal ke Desimal");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan bilangan biner: ");
                String biner = scanner.next();
                int desimalFromBinary = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi ke desimal: " + desimalFromBinary);
                break;
            case 2:
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = scanner.nextInt();
                String binerFromDecimal = Integer.toBinaryString(desimal);
                System.out.println("Hasil konversi ke biner: " + binerFromDecimal);
                break;
            case 3:
                System.out.print("Masukkan bilangan biner: ");
                String binary = scanner.next();
                int desimalFromBinaryForHex = Integer.parseInt(binary, 2);
                String hexFromBinary = Integer.toHexString(desimalFromBinaryForHex);
                System.out.println("Hasil konversi ke heksadesimal: " + hexFromBinary);
                break;
            case 4:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hex = scanner.next();
                String binaryFromHex = Integer.toBinaryString(Integer.parseInt(hex, 16));
                System.out.println("Hasil konversi ke biner: " + binaryFromHex);
                break;
            case 5:
                System.out.print("Masukkan bilangan desimal: ");
                int decimal = scanner.nextInt();
                String hexFromDecimal = Integer.toHexString(decimal);
                System.out.println("Hasil konversi ke heksadesimal: " + hexFromDecimal);
                break;
            case 6:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexa = scanner.next();
                int decimalFromHex = Integer.parseInt(hexa, 16);
                System.out.println("Hasil konversi ke desimal: " + decimalFromHex);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
