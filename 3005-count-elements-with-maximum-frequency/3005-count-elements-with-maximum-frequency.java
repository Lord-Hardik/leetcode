class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        for(int count : freq.values()){
            maxFreq = Math.max(maxFreq, count);
        }

        int answer = 0;
        for(int count : freq.values()){
            if(count == maxFreq){
                answer += count;
            }
        }

        return answer;

    }
}













