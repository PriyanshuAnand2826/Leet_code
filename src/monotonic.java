public class monotonic {
    public static void main(String[] args) {
        int [] arr={1,3,2};
        System.out.println(mono(arr));

    }
    static boolean mono(int[] nums){
        boolean ans=false;
        boolean increasing=false;
        boolean decreasing=false;
        int i=1;
        if (nums[i]>nums[i-1]){
            increasing=true;
        }
        if (nums[i]<nums[i-1]){
            decreasing=true;
        }
        if (increasing){
            while (i<nums.length){
                if (nums[i]>=nums[i-1]){
                    ans=true;
                    i++;
                }
                else {
                    return false;
                }
            }
        }
        if (decreasing){
            while (i<nums.length-1){
                if (nums[i]<=nums[i-1]){
                    ans=true;
                    i++;
                }
                else {
                    return false;
                }
            }
        }

        return ans;
    }
}
