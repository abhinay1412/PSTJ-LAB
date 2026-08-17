  import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            // Add current number to deque and set
            deque.add(num);
            set.add(num);
            
            // When window size reaches M
            if (deque.size() == m) {
                // Update maximum unique count
                if (set.size() > maxUnique) {
                    maxUnique = set.size();
                }
                
                // Early exit optimization if maximum possible unique count is reached
                if (maxUnique == m) {
                    System.out.println(maxUnique);
                    return;
                }
                
                // Slide the window: remove the oldest element
                int first = deque.removeFirst();
                
                // If the removed element is no longer in the current deque window,
                // remove it from the set to keep unique count accurate
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }
        
        System.out.println(maxUnique);
        in.close();
    }
}

