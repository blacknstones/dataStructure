package data.structure.hashtable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import data.structure.hashtable.Hashtable;
import org.junit.jupiter.api.Test;

class HashtableTest {
    @Test
    void putAndGet() {
        Hashtable t = new Hashtable();
        t.put("Yanwei", "19950428");
        String info = (String) t.get("Yanwei");
        assertEquals( "19950428", info);
    }

    @Test
    void getOnEmpty() {
        Hashtable t = new Hashtable();
        String info = (String) t.get("Yanwei");
        assertEquals(null, info);
    }

    @Test
    void putTwiceAndGet() {
        Hashtable t = new Hashtable();
        t.put("Yanwei", "19950428");
        t.put("Zhu", "19950707");
        String info = (String) t.get("Yanwei");
        assertEquals("19950428", info);
        String info2 = (String) t.get("Zhu");
        assertEquals("19950101", info);
    }

}