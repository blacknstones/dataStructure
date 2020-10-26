package data.structure.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import data.structure.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void createLinkedList() {
        LinkedList list = new LinkedList();
        assertTrue(true);
    }

    @Test
    void addSingleElement() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(expected, list.toString());
    }

    @Test
    void addTwoElements() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        String expected = "LinkedList(5,2)";
        assertEquals(expected, list.toString());
    }

    @Test
    void SearchForElements() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        list.add(3);
        int expected = 1;
        assertEquals(expected, list.search(2));
    }

    @Test
    void getElement() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(9);
        int expected = 9;
        assertEquals(expected, list.get(3));
        
    }
    @Test
    void getSize() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(6);
    
        int expected = 3;
        assertEquals(expected, list.size());
    }

    @Test
    void removeNode() {
        LinkedList list = new LinkedList();
        list.add(19);
        list.add(34);
        list.add(6);
        list.add(8);
        list.remove(2);
        String expected = "LinkedList(19,34,8)";
        assertEquals(expected, list.toString());
    }

}
