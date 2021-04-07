package LRUTest;

public class LruNode<T> {
    String key;
    T value;
    LruNode pre;
    LruNode next;
    public LruNode(String key,T value){
        this.key=key;
        this.value=value;
    }
    public boolean hasNext(){
        return this.next!=null;
    }
//    public LruNode getNode(String key){
//
//    }
}
