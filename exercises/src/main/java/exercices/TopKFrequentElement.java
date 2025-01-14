package exercices;

import java.util.*;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, 1 + freqMap.getOrDefault(num, 0));
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (var pair : freqMap.entrySet()) {
            heap.add(new int[]{pair.getValue(), pair.getKey()});
            if(heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0 ; i < k; i++) {
            result[i] = heap.poll()[1];
        }

        return result;

    }
}
