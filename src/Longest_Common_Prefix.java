public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String [] arr= {"flower","flow","flight"};
        System.out.println(common(arr));

    }
    static String common(String [] arr){
        String check=arr[0];
        String hold="";
        int len=0;
        String ans="";
        for (int i=0;i<check.length();i++){
            for (int j=i+1;j<check.length();j++){
                hold=check.substring(i,j);
                Boolean contain=contains(hold,arr);
                if (contain && hold.length()>len){
                    ans=hold;
                    len=hold.length(); //f
                }

            }
        }
        return ans;
    }
    static boolean contains (String input,String [] arr){
        Boolean ans=false;
        for (int i=1;i<arr.length;i++){
            if (arr[i].contains(input)){
                ans=true;
            }
            else {
                return false;
            }
        }
        return ans;
    }
}
