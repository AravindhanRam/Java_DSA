import java.util.*;

/**
 * Demonstrates the core operations available on Java's {@link java.util.ArrayDeque}.
 * 
 * How it works
 * 
 *     The first integer  is read from standard input and represents the
 *     number of elements that will form the deque's initial contents
 *    Exactly  integers follow to populate the deque.
 *     Subsequent integers—five more in total—are consumed one‑by‑one by individual
 *     operations (addFirst, addLast, offerFirst, offerLast,
 *     and offer).
 *     Finally, a sequence of read‑only and removal operations is demonstrated, and
 *     their return values or effects on the deque are printed.
 * 
 * Input Template
 * 
 * n                // number of initial elements
 * e1 e2 … en       // the initial elements
 * aF aL oF oL o    // five additional integers consumed in order by the operations
 * 
 * Example
 * 
 * 3
 * 10 20 30
 * 5 40 15 25 50
 * 
 *
 *@ Aravindhan Ramasamy
 *
public class ArrayDequeuePro {
    public static void main(String[] args) {
        // Create a Scanner for reading from stdin
        Scanner sc = new Scanner(System.in);

        /* -------------------- Populate the deque -------------------- */
        int n = sc.nextInt();                       // number of initial elements
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            arrayDeque.add(sc.nextInt());           // add elements to tail
        }

        /* -------------------- Insertion operations ------------------ */
        arrayDeque.addFirst(sc.nextInt());          // 1) insert at head
        System.out.println(arrayDeque);

        arrayDeque.addLast(sc.nextInt());           // 2) insert at tail (identical to add)
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(sc.nextInt());        // 3) insert at head, returns boolean
        System.out.println(arrayDeque);

        arrayDeque.offerLast(sc.nextInt());         // 4) insert at tail, returns boolean
        System.out.println(arrayDeque);

        arrayDeque.offer(sc.nextInt());             // 5) synonym for offerLast
        System.out.println(arrayDeque);

        /* -------------------- Peek (read‑only) operations ----------- */
        System.out.println(arrayDeque.peek());      // head or null if empty
        System.out.println(arrayDeque.peekFirst()); // same as peek()
        System.out.println(arrayDeque.getFirst());  // head or throws NoSuchElementException
        System.out.println(arrayDeque.getLast());   // tail or throws NoSuchElementException
        System.out.println(arrayDeque.peekLast());  // tail or null if empty

        /* -------------------- Removal operations -------------------- */
        System.out.println(arrayDeque.pollFirst()); // remove head; returns element or null
        System.out.println(arrayDeque.poll());      // same as pollFirst()
        System.out.println(arrayDeque.pollLast());  // remove tail; returns element or null

        System.out.println(arrayDeque.remove());        // remove head; throws if empty
        System.out.println(arrayDeque.removeFirst());   // remove head; throws if empty
        System.out.println(arrayDeque.removeLast());    // remove tail; throws if empty

        /* -------------------- Conditional removal ------------------- */
        System.out.println(arrayDeque.removeLastOccurrence(5)); // remove last 5 if present

        /* -------------------- Final state --------------------------- */
        System.out.println(arrayDeque);

        // Always close your Scanner in real programs (prevents resource leak warning)
        sc.close();
    }
}
