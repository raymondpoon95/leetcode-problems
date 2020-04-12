class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }
        
        if(stones.length == 1){
            return stones[0];
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : stones){
            queue.add(i);
        }
        
        while(queue.size() > 1){
            int y = queue.poll();
            int x = queue.poll();
            
            if(x != y){
                queue.add(y-x);
            }
        }
        
        if(queue.isEmpty()){
            return 0;
        }
        return queue.poll();
    }
}

// Time complexity is O(n log n) because priorityQueue operation for poll is O(log n) and you do this for every element in
// stones.length, space complexity is O(n) because created a new queue with every element from stones
