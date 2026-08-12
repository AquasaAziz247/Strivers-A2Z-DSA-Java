//My Version
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}

TC : O(n)
SC : O(k)

k= number of divisors


//Optimized Code

class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
            if(i!=n/i){
                list.add(n/i);
            }
        }
        Collections.sort(list);

        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

}

TC : O(sqrt(n))
SC : O(k)
Sorting : O(klogk)
k= no. of divisors  

  
