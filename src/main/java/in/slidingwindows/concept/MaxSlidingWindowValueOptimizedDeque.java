package in.slidingwindows.concept;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindowValueOptimizedDeque {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0) {
            System.out.println("Invalid input!");
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];

        int ri = 0;
        // रिजल्ट एरे का इंडेक्स ट्रैक करने के लिए

        // Deque में हम एलिमेंट्स के इंडेक्स (Index) स्टोर करेंगे
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // 1. पुरानी खिड़की के एलिमेंट्स को आगे (Front) से हटाओ
            // अगर कतार का सबसे पहला इंडेक्स 'i - k' के बराबर या छोटा है, तो वो खिड़की से बाहर हो चुका है
            if (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            // 2. नए एलिमेंट से छोटे सभी एलिमेंट्स को पीछे (Tail) से हटाओ
            // क्योंकि नया एलिमेंट बड़ा है, तो पुराने छोटे एलिमेंट्स अब कभी 'max' नहीं बन पाएंगे
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            // 3. करंट एलिमेंट का इंडेक्स कतार में पीछे जोड़ें
            q.offer(i);

            // 4. जब हमारी विंडो का साइज कम से कम 'k' हो जाए, तब आंसर स्टोर करना शुरू करें
            // पहली विंडो इंडेक्स 'k - 1' पर पूरी होती है
            if (i >= k - 1) {
                result[ri++] = nums[q.peek()]; // कतार के सबसे आगे हमेशा मैक्सिमम एलिमेंट का इंडेक्स होता है
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));
    }


}

