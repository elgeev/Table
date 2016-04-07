/**
 * Created by Денис on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTable table = new MyTable();
        table.put("book", "kniga");
        System.out.println(table.get("book"));
    }
}
