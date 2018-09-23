// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 261
// Programming Project: #4
// Due Date : 9/20/18 23:00 CST
// Program Description: Modifying classes that implement stacks and queues
// and making classes that implemenet stacks and queues
// Certificate of Authenticity:
// I certify that the code in the method functions including method function main of this project are entirely my own work.
package p4_4_c00039405;

/**
 *
 * @author cxb02
 */
public class P4_4_C00039405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringArrayCircularQueue queue = new StringArrayCircularQueue();
        while (queue.isFull() == false) {
            queue.enqueue("Spot");
            System.out.println(queue);
        }
        System.out.println();
        StringArrayCircularQueue queueOf6 = new StringArrayCircularQueue(6);
        while (queue.isEmpty() == false) {
            queueOf6.enqueue(queue.dequeue());
            System.out.println(queue);
            System.out.println("Size of six " + queueOf6 + "\n");
        }
        queueOf6.enqueue("Sixth");
        System.out.println(queueOf6);

    }
}
