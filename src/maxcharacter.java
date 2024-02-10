public class maxcharacter {
    public static void main(String[] args) {
        char ans=max("mamamamammmmm",'a',0);
        System.out.println(ans);

    }
    public static char max(String input,char ans,int ans_count){
        int count=0;
        if (input.isEmpty()){
            return ans;
        }
        char check=input.charAt(0);
        for (int i=1;i<input.length();i++){
            if (check==input.charAt(i)){
                count++;
            }
        }
        if (count>ans_count){
            ans_count=count;
            ans=check;
        }
        return max(input.substring(1),ans,ans_count);
    }
}
