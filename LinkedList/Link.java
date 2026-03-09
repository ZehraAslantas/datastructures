// Dosya Adı: Link.java

package LinkedList;

public class Link {
    public int iData;     // Tam sayı veri
    public double dData;  // Ondalıklı sayı veri
    public Link next;     // Bir sonraki Link'e referans

    // Yapıcı (Constructor)
    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
        this.next = null; // Başlangıçta sonraki eleman yok
    }

    // Bağlantıyı görüntüleme metodu
    public void displayLink() {
        System.out.print("{" + this.iData + " | " + this.dData + "} ");
    }
}