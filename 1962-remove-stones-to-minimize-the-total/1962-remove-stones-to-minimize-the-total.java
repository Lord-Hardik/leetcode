class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int pile : piles){
            pq.add(pile);
        }

        for(int i =0;i<k;i++){
            int maxPile = pq.poll();

            maxPile = maxPile - maxPile/2;
            pq.add(maxPile);
        }
        int sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}