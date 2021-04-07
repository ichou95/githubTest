package LRUTest;

import java.util.HashMap;
import java.util.Map;

public class LruNodeList<T> {
    private Map<String,LruNode> map =new HashMap<>();
    private LruNode<T> first;
    private LruNode<T> last;

    private int size;

    public LruNode getLruNode(String key){
        if(map.containsKey(key)){
            LruNode node=map.get(key);
            moveLruNode(node);
            insertFirst(node);
            return  node;
        }else{
            return null;
        }
    }

    public void putLruNode(String key,T value){
        if(map.containsKey(key)){
            LruNode node=map.get(key);
            LruNode newNode=new LruNode(key,value);
            moveLruNode(node);
            insertFirst(newNode);
            map.put(key,newNode);
        }else{
           if((size-map.size())>0){
               LruNode newNode=new LruNode(key,value);
               insertFirst(newNode);
               map.put(key,newNode);
           }else{
               LruNode lastLruNode=last.pre;
               moveLruNode(lastLruNode);
               LruNode newNode=new LruNode(key,value);
               insertFirst(newNode);
               map.put(key,newNode);
           }
        }
    }

    public void clear(){


        first.next=last;
        last.pre=first;
        map=new HashMap<>();

    }

    public int size(){
        return this.map.size();
    }

    public LruNodeList(int size) {
        LruNode<T> f=new LruNode<>(null,null);
        LruNode<T> l=new LruNode<>(null,null);
        first=f;
        last=l;
        first.next=last;
        last.pre=first;
        this.size=size;
    }

    private void moveLruNode(LruNode node){
        node.next.pre=node.pre;
        node.pre.next=node.next;
    }

    private void insertFirst(LruNode node){
        node.next=first.next;
        node.pre=first;
        first.next.pre=node;
        first.next=node;
    }

    public LruNode getFirst() {
        return first;
    }

    public LruNode<T> getLast() {
        return last;
    }

    public void setLast(LruNode<T> last) {
        this.last = last;
    }
}
