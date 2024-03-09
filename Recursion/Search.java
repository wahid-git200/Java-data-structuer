class Search{
    public static void main(String[] args){
        int arr[] = {2,4,1,6,7,9,12};
        int n=12;
        System.out.println(search(arr,n));
    }

    public static int search(int [] arr, int number){
        return search(arr,number,0);
    }
    public static int search(int arr[] , int number , int start){
        if(start>=arr.length || start<0)
            return -1;
        if(arr[start]==number)
          return start;

        return search(arr, number, start+1);
    }
}