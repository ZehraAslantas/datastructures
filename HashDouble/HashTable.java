package HashDouble;

public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem; // Silinen öğeleri işaretlemek için kullanılır

    public HashTable(int size) {
        this.hashArray = new DataItem[size];
        this.arraySize = size;
        this.nonItem = new DataItem(-1); // Silinmiş hücreyi temsil eder
    }

    public void displayTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] == null) {
                System.out.print("** ");
            } else if (hashArray[i].getKey() == -1) {
                System.out.print("DEL ");
            } else {
                System.out.print(hashArray[i].getKey() + " ");
            }
        }
        System.out.println();
    }

    public int hashFunct(int key) {
        return key % arraySize;
    }

    // İkinci hash fonksiyonu asla 0 dönmemelidir!
    public int hashFunct2(int key) {
        return 5 - (key % 5);
    }

    public boolean isFull() {
        for (int i = 0; i < arraySize; i++) {
            // Eğer tek bir tane bile null veya silinmiş (-1) hücre varsa yer vardır
            if (hashArray[i] == null || hashArray[i].getKey() == -1) {
                return false;
            }
        }
        return true; // Hiç boş yer bulunamadıysa tablo doludur
    }
    public void insert(DataItem dataItem) {
        if (isFull()) {
            System.out.println("Hata: Hash Table tamamen dolu! " + dataItem.getKey() + " eklenemedi.");
            return;
        }
        int key = dataItem.getKey();
        int hashValue = hashFunct(key);
        int stepSize = hashFunct2(key);

        // Hücre doluysa ve silinmiş bir öğe (-1) değilse dönmeye devam et
        while (hashArray[hashValue] != null && hashArray[hashValue].getKey() != -1) {
            hashValue += stepSize; // Adım boyutu kadar ilerle
            hashValue %= arraySize; // Dizinin sonuna gelince başa dön
        }
        hashArray[hashValue] = dataItem;
    }

    public boolean find(int key) {
        int hashValue = hashFunct(key);
        int stepSize = hashFunct2(key);

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKey() == key) {
                return true; // Bulundu!
            }
            hashValue += stepSize;
            hashValue %= arraySize;
        }
        return false; // Bulunamadı (null bir hücreye denk geldik)
    }
    public DataItem delete(int key) {
        int hashValue = hashFunct(key);
        int stepSize = hashFunct2(key);

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKey() == key) {
                DataItem temp = hashArray[hashValue]; // Silinecek öğeyi sakla
                hashArray[hashValue] = nonItem; // Hücreyi "silindi" olarak işaretle
                return temp;
            }
            hashValue += stepSize;
            hashValue %= arraySize;
        }
        return null; // Silinecek öğe bulunamadı
    }
}
