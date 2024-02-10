public class longest_sub_without_repeating {
    public static void main(String[] args) {
        System.out.println(long_sub("pwwkew"));

    }
    static int long_sub(String input){
        String hold="";
        int len=0;
        String ans="";
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length();j++){
                hold=input.substring(i,j);
                Boolean check=unique(hold);
                if (check && hold.length()>len){
                    ans=hold;
                    len=hold.length();
                }
            }
        }
        System.out.println(ans);
        return len;
    }
    static boolean unique(String input){
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length();j++){
                if (input.charAt(i)==input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
