
package javaapplication7;
import java.util.LinkedList;

/**
 *
 * @author AHMET BURAK DİNÇ || 05200000054
 */
public class CustomerQueue {
    LinkedList<Customer> linkedList = new LinkedList<Customer>(); //LinkedList sınıfı tipinde bir değişken olan CustomerQueue sınıfı
    
    public CustomerQueue(){ // Constructor
        
    }
    public void add(Customer c){ // Listenin sonuna ekleme yapar
        linkedList.add(c);
    }
    public Customer remove(){ // Listenin sonundaki (sıradaki) elemanı  siler
        return linkedList.removeLast();
    }
    public Customer peek(){ // Sıradaki (sondaki) elemanı döndürür.
        return linkedList.peekLast();
    }
    public void printElements(){ // Tüm listeyi yazdırır.
        System.out.println(linkedList.toString());
    }
    public int size(){ // Listenin boyutunu döndürür.
        return linkedList.size();
    }
    private LinkedList getQueueLinkedList(){ // Listenin içsel veri yapısını döndürür.
        return linkedList;
    }
    
    
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue(); // LinkedList tipinde CustomerQueue oluşturuluyor.
        Customer c1 = new Customer(1, "ahmet"); 
        Customer c2 = new Customer(2, "burak");
        Customer c3 = new Customer(3, "efe");
        // Listeye ekleme yapılıyor
        customerQueue.add(c1);
        customerQueue.add(c2);
        customerQueue.add(c3);
        System.out.println("First version of Linked List:");
        customerQueue.printElements();
        System.out.println("*****************************");
        int i = 0; // LİSTEYİ BOŞALTAN DÖNGÜ
        while (i < customerQueue.size()){
            customerQueue.remove();
        }
        System.out.println("removed all.");
        customerQueue.printElements();
        System.out.println("*****************************");
        customerQueue.add(c1);
        customerQueue.add(c2);
        System.out.println("Second version of Linked List:");
        customerQueue.printElements();
        System.out.println("*****************************");
        System.out.println("Peek of Linked List"); // sıradaki elemanı yazdırıyor.
        System.out.println(customerQueue.peek());
        System.out.println("*****************************");
        System.out.println("Last version of Linked List:");
        System.out.println(customerQueue.getQueueLinkedList()); //Listenin içsel değerini döndürür.
    }
 
}

    
