class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Number> pq = new PriorityQueue<>();

        for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
            Number number=new Number(entry.getKey(), entry.getValue());
         pq.offer(number);
            if(pq.size()>k){
                pq.poll();
            }    
        }
     int res[]=new int[k];
        int index=0;
        while(index<k){
           Number number =pq.poll();
            res[index]=number.num;
            index++;
        }
        return res;

    }
}

class Number implements Comparable<Number>{
    int num; int freq;
    Number(int num , int freq){
        this.num=num;
        this.freq=freq;
    }

    public int compareTo(Number that){
        return this.freq-that.freq;
    }
}
