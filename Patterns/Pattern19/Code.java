class Solution {
    public void pattern19(int n) {
        for(int i=0;i<n;i++){
            //upper half
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            //upper half
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
