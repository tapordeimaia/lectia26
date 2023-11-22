import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("A");
        deque.push("B");
        Map<String, String> map = new HashMap<>();
        map.put("Key1", deque.poll());
        map.put("Key2", deque.poll());
        System.out.println(map);
        int i = 0;
        while (deque.peek()!= null){
            map.put("key" + i, deque.poll());
            i++;
        }
    }
}