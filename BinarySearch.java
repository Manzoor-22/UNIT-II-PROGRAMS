class BinarySearch{
    public static void main(String args[]){
        int[] array = {1,4,6,8,11,16,19,39};
        int ans = BS(array, 0, array.length - 1, 4);
        System.out.println(ans);
    }

    public static int BS(int[] array, int low, int high, int key){
    
        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }
}