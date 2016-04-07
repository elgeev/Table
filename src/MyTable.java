/**
 * Created by Денис on 10.03.2016.
 */
public class MyTable {
    private Bucket[]
    buckets = new Bucket[1000];
    void put (String key, String value){
        int h=Math.abs(key.hashCode()%buckets.length);
        Bucket b = buckets[h];
        for (Pair p:b.pairs){
            if (key.equals(p.key)) {
                p.value = value;
                return;
            }
        }
        b.pairs.add(new Pair(key, value));
    }

    String get (String key){
        int h=Math.abs(key.hashCode()%buckets.length);
        Bucket b = buckets[h];
        for (Pair p:b.pairs){
            if (key.equals(p.key)) {
                return p.value;
            }
        }
        return null;
    }

    MyTable() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }
    }
}