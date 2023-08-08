package hashing;

public class HashTable {
//instance variable
    private HashNode[] buckets;
    private int numOfBuckets;//capacity
    private int size;//number of key value pairs


    public HashTable(){
        this(10);//default capacity
    }
    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
        this.size=0;
    }

    //inner class
    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;//reference to next node

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }


    //operation
    public int size(){
        return size;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public void put(Integer key,String value){

    }
    public String get(Integer key){

        return null;
    }

    public String remove(Integer key){
        return null;

    }
}
