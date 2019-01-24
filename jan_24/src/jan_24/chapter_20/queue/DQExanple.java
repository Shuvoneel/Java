package jan_24.chapter_20.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DQExanple {

    public static void main(String[] args) {
        Deque<String> d1 = new LinkedList<>();
        d1.add("Element 1 ");
        d1.addFirst("Element 2 ");
        d1.addLast("Element 3 ");
        d1.push("Element 4 ");
        d1.offer("Element 5 ");
        d1.offerFirst("Element 6 ");
        d1.offerLast("Element 7 ");

        System.out.println(d1 + "\n");

        System.out.println("Standard Iterator");
        Iterator iterator = d1.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
        Iterator reverse = d1.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext()) {
            System.out.println("\t" + reverse.next());
        }
        System.out.println("Peek: " + d1.peek());
        System.out.println("After Peek: " + d1);
        System.out.println("Pop: " + d1.pop());
        System.out.println("After Pop: " + d1);
        System.out.println("Contains Element 3: " + d1.contains("Element 3 "));
        d1.removeFirst();
        d1.removeLast();
        System.out.println("Deque After Removing First & Last Element: " + d1);
    }

}

/*
The java.util.Deque interface is a subtype of the java.util.Queue interface. The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure, it can be used as a queue (first-in-first-out/FIFO) or as a stack (last-in-first-out/LIFO). These are faster than Stack and LinkedList.
This is the hierarchy of Deque interface in Java:

Few important features of Deque are:

    It provides the support of resizable array and helps in restriction-free capacity, so to grow the array according to the usage.
    Array deques prohibit the use of Null elements and do not accept any such elements.
    Any concurrent access by multiple threads is not supported.
    In the absence of external synchronization, Deque is not thread-safe.

Methods of Deque:

    add(element): Adds an element to the tail.
    addFirst(element): Adds an element to the head.
    addLast(element): Adds an element to the tail.
    offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.
    offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    iterator(): Returna an iterator for this deque.
    descendingIterator(): Returns an iterator that has the reverse order for this deque.
    push(element): Adds an element to the head.
    pop(element): Removes an element from the head and returns it.
    removeFirst(): Removes the element at the head.
    removeLast(): Removes the element at the tail.
    poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
    pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
    pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
    peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
    peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.

 */
