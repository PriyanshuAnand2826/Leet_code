import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int [] arr={3,2,4};
        int target=6;
        int[] ans=return_indices(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] return_indices(int [] arr,int target){
        int [] ans={-1,-1};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
