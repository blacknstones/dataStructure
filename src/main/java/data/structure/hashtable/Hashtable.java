package data.structure.hashtable;

class Entry {
    Object key;
    Object value;
    Entry next;

    Entry(Object k, Object v) {
        key = k;
        value = v;
    }
}

class Hashtable {

    private int SIZE = 2000;
    private Entry[] storage = new Entry[SIZE];

    public void put(Object key, Object value) {
        int hc = key.hashCode();
        int index = hc % SIZE;
        Entry entry = new Entry(key, value);

        storage[index] = entry;
    }

    public Object get(Object key) {
        int hc = key.hashCode();
        int index = hc % SIZE;
        Entry entry = storage[index];

        if (entry == null) {
            return null;
        }
        // go through the chain to find the entry with the given key
        while (entry.next != null && entry.key != key) {
            entry = entry.next;
        }

        // if reach the last element in the chain
        if(entry.next == null) {
            if(entry.key == key) {
                return entry.value;
            } else {
                return null;
            }

        } else {
            // entry is not the last node
            return entry.value;
        }
    }
}