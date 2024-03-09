class Fbionacci{
    public static void main(String[] args){
        int  n = 6;
        System.out.println(fbionacci(n));
    }
    public static int fbionacci(int n ){
        if(n==0||n==1)
            return 1;
        else
            return fbionacci(n-1)+fbionacci(n-2);
    }
}