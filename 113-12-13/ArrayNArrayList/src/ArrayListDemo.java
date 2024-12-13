import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        System.out.println("ArrayList內容:" + list);

        // 取得ArrayList元素
        String fruit = list.get(1);
        System.out.println("第2個元素是:" + fruit);

        // 更新ArrayList元素
        list.set(1, "Blueberry");
        System.out.println("更新後的ArrayList:" + list);

        // 刪除ArrayList元素
        list.remove(0);
        System.out.println("刪除後的ArrayList:" + list);

        // 檢查ArrayList大小
        int size = list.size();
        System.out.println("ArrayList大小:" + list.size());

        // 判斷是否包含特殊元素
        boolean contains = list.contains("Cherry");
        System.out.println("ArrayList是否包含Cherry:" + contains);


        // 使用迴圈讀取ArrayList
        if(list.isEmpty()) {
        System.out.println("使用迴圈讀取ArrayList:");
        for(String item : list) {
            System.out.println(item);
            }
        }
        else {
            System.out.println("ArrayList是空的");
        }
    }
}
