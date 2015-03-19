//package Hashing;
//
//import java.util.LinkedList;
//
///**
// * Created by Gurkan on 19.03.2015.
// */
//public class MyHashMap<K, V> implements MyMap<K,V> {
//    private static int DEFAULT_INITIAL_CAPACITY = 4;
//
//    private static int MAXIMUM_CAPACITY = 1<<30;
//
//    private int capacity;
//
//    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
//
//    private float loadFactorThreshold;
//
//    private int size = 0;
//
//    LinkedList<MyMap.Entry<K,V>>[] table ;
//
//    public MyHashMap(){
//        this(DEFAULT_INITIAL_CAPACITY,DEFAULT_MAX_LOAD_FACTOR);
//    }
//    public MyHashMap(int initialCapacity){
//        this(initialCapacity,DEFAULT_MAX_LOAD_FACTOR);
//    }
//
//    public MyHashMap(int initialCapacity, float loadFactorThreshold){
//        if(initialCapacity > MAXIMUM_CAPACITY)
//            this.capacity = MAXIMUM_CAPACITY;
////        else
////            this.capacity = trimToPower2(initialCapacity);
//
//        this.loadFactorThreshold = loadFactorThreshold;
//        table = new LinkedList[capacity];
//    }
////
////    @Override
////    public void clear(){
////        size = 0;
////        removeEntries();
////    }
//
//    @Override
//    public boolean containsKey(K key){
//        if(get(key) != null)
//            return true;
//        else
//            return false;
//    }
//
//    @Override
//    public boolean containsValue(V value){
//        for (int i = 0; i < capacity ; i++) {
//            if(table[i] != null){
//                LinkedList<Entry<K, V>> bucket = table[i];
//                for (Entry<K,V> entry : bucket)
//                    if(entry.getValue().equals(value))
//                        return true;
//
//            }
//
//        }
//        return false;
//    }
//
//    @Override
//
//    public boolean isEmpty(){
//        return size == 0;
//    }
//
//
//
//
//
////    @Override
////
////    public V getKey(K key){
////        int bucketIndex = hash(key.hashCode());
////        if(table[bucketIndex] != null){
////            LinkedList<Entry <K , V>> bucket = table[bucketIndex];
////            for(Entry<K,V> entry : bucket)
////                if(entry.getKey().equals(key))
////                    return entry.getValue();
////        }
////        return null;
////    }
//
////    public java.util.Set<MyMap.Entry<K,V>> entrySet(){
////        java.util.Set<MyMap.Entry<K,V>> set =
////                new java.util.HashSet<>();
////        for (int i = 0; i < capacity; i++) {
////            if(table[i] != null ){
////                LinkedList<Entry<K, V>> bucket = table[i];
////                for(Entry<K,V> entry : bucket)
////                    set.add(entry);
////            }
////        }
////        return set;
////    }
//
////    @Override
////
////    public java.util.Set<K> keySet(){
////        java.util.Set<K> set = new java.util.HashSet<K>();
////
////    }
//}
