package data.structure.linkedlist;

class Node {
    int value; // package-private
    Node next;
    Node(int num) {
        value = num;
        next = null;
    }
}

/**
 * This class implements a standard single linked list.
 */
public class LinkedList {

    // For an empty list, the "first" reference
    // is null.
    private Node first = null; // also called "head"

    /**
     * Adds the integer element `num` to the end of
     * the list. Calling this method grows the size
     * of this list by one.
     *
     * @param num the element to be added.
     */
    public void add(int num) {
        Node nodeForNum = new Node(num);
        if (first == null) { // case 1
            first = nodeForNum;
        } else { // case 2
            // we know: first != null

            // walk through nodes to find the node
            // where "next" is null.
            // that node is the last node!

            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            // we know: current.next == null
            // this is AWESOME!
            // what do we know about "current"?
            // it is the LAST node.

            // now we should add the node with "num"
            current.next = nodeForNum;
            // now "nodeForNum" is the new last node!
        }
    }

    /**
     * Returns a string representation of this list,
     * containing all elements in their insertion order.
     */
    public String toString() {
        // "LinkedList(5, 2, 7)"
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedList(");
        // append the elements
        if (first != null) { // list is non-empty
            Node current = first;
            builder.append(current.value);

            while (current.next != null) {
                current = current.next;
                // what if current is last node?
                // OK!
                builder.append("," + current.value);
            }    
        }
        builder.append(")");
        return builder.toString();
    }

    public int search(int num) {
        Node current = first;
        int index = 0;
        while (current.next != null) {
            if (current.value != num) {
                index++;
                current = current.next;
            } else {
                return index;
            }
        }
        return -1;
    }

    public int get(int index) {
        if(first == null) {
            return -1;
        } else {
            Node current = first;
            int currentIndex = 0;

            if (index == 0) {
                return current.value;
            }
            while (current.next != null) {
                currentIndex++; 
                current = current.next;
                if (currentIndex == index) {
                return current.value;
                }
            }
        } return -2;  
    }

    public int size() {
        if(first == null) {
            return -1;
        } else {
            Node current = first;
            int count =1; 
            while(current.next != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public void remove(int removeIndex) {
       
        Node current = first;
        int currentIndex = 0;
        if (removeIndex  == 0) {
            first = first.next;
        }
        while (current.next != null) {
            currentIndex++;
            if (currentIndex == removeIndex) {
                current.next = current.next.next;
                break;
            } else {
                current = current.next;
            }
        }
    }
}
