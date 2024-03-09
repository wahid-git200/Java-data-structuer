class BinarySearch{
    public static void main(String[] args){
        int[] arr ={1,4,5,6,10,12,19,20};
        System.out.println(binarySearch(arr, 12));
    }

    public static int binarySearch(int[] arr,int number){
        int first=0;
        int last=arr.length-1;
        return binarySearch(arr, first, last, number);
    }
    public static int binarySearch(int[] arr,int first,int last,int number){
        int middle= (first+last)/2;

        if(arr[middle] == number){
            return middle;
        }
        else if(last < first){
            return -1;
        }
        else if(number > arr[middle]){
            return binarySearch(arr, middle+1, last, number);
        }
        else 
            return binarySearch(arr, first ,middle-1, number);
    }
}