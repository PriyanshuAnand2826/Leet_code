import java.util.ArrayList;
import java.util.List;

public class removing_common_element {
    public static void main(String[] args) {
        int[] input={0,0,1,1,1,2,2,3,3,4};
        List<Integer> ans=expected(input);
        System.out.println(ans);

    }
    static List<Integer> expected(int[] arr){
        List<Integer> ans=new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            if (ans.contains(arr[i])){
                continue;
            }

            else {
                ans.add(arr[i]);
            }

        }
        System.out.println(ans.size());
        return ans;
    }
}
