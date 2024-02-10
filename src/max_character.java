import java.io.LineNumberReader;

public class max_character {
    public static void main(String[] args) {
        String input="abcbbbbbb";
        int ans=max_ch(input,0);
        System.out.println(ans);

    }
    static int max_ch(String input,int ans){
        int count=0;
        if (input.isEmpty()){
            return ans;
        }
        char ch=input.charAt(0);
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==ch){
                count++;
            }
        }
        if (count>ans){
            ans=count;
        }
        return  max_ch(input.substring(1),ans);

    }

}
