package LinkedList;

import java.util.List;

public class LinkList {
    private Link head;
    public LinkList(){
        this.head=null;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void insertToHead(int iData,double dData){
        Link newList=new Link(iData,dData);
        newList.next=head;//head listenin başı=ilk eleman.Bunu listenin baştan sonraki(2.elemana)atar.
        head=newList;
        //newList oluştur.sonra ilk elemanı sağa at.İlk elemana yani head a newList i yani yeni elemanı at.
    }
    public void delete(double dData){
        if (head.dData==dData){
            //head in iData alanını kontrol ediyor.
            head=head.next;
            return;//silme tamamlanınca metottan çıktı.
            /*dData silinmek isteniyor.Kontrolde eğer bu listenin başındaysa sil.
            head bir sonraki eleman olsun.
            */

        }
        Link oncekieleman=head;
        Link suankieleman=head.next;
        while (suankieleman!=null&&suankieleman.dData!=dData){
            //listenin sonuna geldikmi,şuanki eleman silinmek istenen mi
            oncekieleman=suankieleman;
            suankieleman=suankieleman.next;

        }
        if (suankieleman==null){
            System.out.println("listede yok");
            return;
        }
        oncekieleman.next=suankieleman.next;
//        if (!isEmpty()){
//            head=head.next;
//        }else {
//            System.out.println("Hata:Liste boş,Silme işlemi yapılamadı");
//        }
    }
    public void insertToLast(int iData,double dData){
        Link newLink=new Link( iData, dData);
        if (isEmpty()){
            System.out.println("list is empty");
            head=newLink;
            return;
        }
        Link current=head;
        while (current.next !=null){
            current=current.next;
        }
        current.next=newLink;
    }

    public void displayLinkList(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Link current=head;
        while (current !=null){
            current.displayLink();
            current=current.next;
        }
       System.out.println();
    }

}