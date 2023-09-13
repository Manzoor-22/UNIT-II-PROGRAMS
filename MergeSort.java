public class MergeSort {
    public static void main(String args[]){
        int[] array = {1,5,3,7,4};
        MS(array, 0, array.length-1);
        for(int val : array){
            System.out.println(val + " ");
        }
        System.out.println();
    }

    public static void merge(int[] array, int low, int high){
        int h = 0,k = 0,i = 0;
        int mid = (low+high)/2;

        //Declaring half arrays
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        //Adding values to temp arrays
        for(int j = 0; j < mid; j++){
            LeftArray[j] = array[j];
        }
        for(int j = mid+1; j < high; j++){
            RightArray[j] = array[j];
        }

        while(h < mid && k < high){
            if(LeftArray[h] < RightArray[k]){
                array[i] = LeftArray[h];
                h++;
            }
            else{
                array[i] = RightArray[k];
                k++;
            }
            i++;
        }

        if(h > mid){
            while(k < high){
                array[i] = RightArray[k];
                k++;
                i++;
            }
        }
        else{
            while(h < mid){
                array[i] = LeftArray[h];
                h++;
                i++;
            }
        }
    }

    public static void MS(int array[], int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            MS(array, low, mid);
            MS(array, mid+1, high);
            merge(array, low, high);
        }
    }
}
