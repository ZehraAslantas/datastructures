package HashDouble;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hash Table boyutunu belirleyin (Asal sayı önerilir): ");
        int size = input.nextInt();
        HashTable hashTable = new HashTable(size);

        boolean devamEt = true;

        while (devamEt) {
            System.out.println("\n--- Double Hashing Menü ---");
            System.out.println("1. Veri Ekle (Insert)");
            System.out.println("2. Veri Sil (Delete)");
            System.out.println("3. Veri Bul (Find)");
            System.out.println("4. Tabloyu Göster (Display)");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Eklenecek sayı: ");
                    int addValue = input.nextInt();
                    hashTable.insert(new DataItem(addValue));
                    System.out.println(addValue + " eklendi.");
                    break;

                case 2:
                    System.out.print("Silinecek sayı: ");
                    int delValue = input.nextInt();
                    DataItem deleted = hashTable.delete(delValue);
                    if (deleted != null) {
                        System.out.println(delValue + " başarıyla silindi.");
                    } else {
                        System.out.println("Hata: " + delValue + " tabloda bulunamadı.");
                    }
                    break;

                case 3:
                    System.out.print("Aranacak sayı: ");
                    int findValue = input.nextInt();
                    if (hashTable.find(findValue)) {
                        System.out.println("Sonuç: " + findValue + " tabloda mevcut. :)");
                    } else {
                        System.out.println("Sonuç: " + findValue + " bulunamadı. :(");
                    }
                    break;

                case 4:
                    hashTable.displayTable();
                    break;

                case 5:
                    System.out.println("Programdan çıkılıyor... Görüşürüz aşkoo!");
                    devamEt = false;
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen 1-5 arası bir sayı girin.");
                    break;
            }
        }
        input.close();
    }
}
