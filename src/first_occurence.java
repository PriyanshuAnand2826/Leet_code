public class first_occurence {
    public static void main(String[] args) {
        String haystack="leetcode";
        String needle="leeto";
        int ans=occur(haystack,needle);
        System.out.println(ans);

    }
    static int occur(String haystack , String needle){
        String hold="";
        int len=0;
        int ans=-1;
        for(int i=0;i<haystack.length();i++){
            for (int j=i+1;j<haystack.length();j++){
                hold=haystack.substring(i,j);
                if(hold.length()==needle.length() && hold.equals(needle)){
                    ans=i;
                }
            }
        }
        return  ans;
    }

}
