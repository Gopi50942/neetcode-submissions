class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                hm.put(i, hm.get(i)+1);
            }
        }
        int n=hm.size();
        // System.out.println(n);
        int[][] arr=new int[n][2];
        int i=0;
        for(Map.Entry<Integer, Integer> x:hm.entrySet()){
            arr[i][0]=x.getKey().intValue();
            arr[i][1]=x.getValue().intValue();
            i++;

        }
        // System.out.println(hm);
        Arrays.sort(arr, (x,y)->x[1]-y[1]);
        // System.out.println(arr[0][0]);
        // System.out.println(arr[1][1]);
        int j=0;
        int[] op=new int[k];
        for(int l=n-1; l>=(n-k); l--){
            op[j]=arr[l][0];
            j++;
        }
        return op;
    }
}
