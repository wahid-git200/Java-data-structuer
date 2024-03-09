class Factorial{
    public static void main(String[] args){
            int s=5;
            System.out.println(factorial(s));

    }
    public static int  factorial(int n){
        if(n<=1){
            return 1;
        }
        else  return n*factorial(n-1);
    }
}