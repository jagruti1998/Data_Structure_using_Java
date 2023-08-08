package hashing;

public class SeparateChaining {

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public SeparateChaining(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
    }

    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
