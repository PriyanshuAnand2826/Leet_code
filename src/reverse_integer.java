public class reverse_integer {
    public static void main(String[] args) {
        System.out.println(reverse(4321));

    }
    static int reverse(int n){
        int check=0;
        while(n>0){
            int rem=n%10;
            check=check*10 + rem;
            n=n/10;
        }
        return check;
    }
}
