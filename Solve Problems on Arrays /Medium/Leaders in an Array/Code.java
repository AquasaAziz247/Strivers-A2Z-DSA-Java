static ArrayList<Integer> leaders(int arr[]) {
    ArrayList<Integer> result = new ArrayList<>();

    int n = arr.length;
    int max = arr[n - 1];

    result.add(max);

    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] >= max) {
            max = arr[i];
            result.add(arr[i]);
        }
    }

    Collections.reverse(result);
    return result;
}

TC : O(N)
SC : O(N)
  
