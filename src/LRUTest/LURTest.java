package LRUTest;

import java.util.LinkedList;

public class LURTest {


    public static void main(String[] args) {
        LruNodeList<String> list=new LruNodeList<>(4);
        list.putLruNode("1","a");
        list.putLruNode("2","b");
        list.putLruNode("3","c");
        list.putLruNode("4","d");

        list.putLruNode("2","e");
        list.getLruNode("1");

        list.putLruNode("5","f");

        LruNode<String> forNode=list.getFirst().next;

        while (forNode.hasNext()){
            String v=forNode.value+"";
            String k=forNode.key;
            System.out.println("ket:"+k+",value:"+v);
            forNode=forNode.next;
        }
        System.out.println((list.getFirst().next==list.getLast())+"");
        list.clear();
        System.out.println((list.getFirst().next==list.getLast())+"");

    }

}
