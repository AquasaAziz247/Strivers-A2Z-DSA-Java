class Solution {
    public int largestDigit(int n) {
        int x=n;
        if(x==0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(x!=0){
            int digit=x%10;
            list.add(digit);
            x=x/10;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
}
