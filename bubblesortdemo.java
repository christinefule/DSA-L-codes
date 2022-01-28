public class bubblesortdemo { 

static void BubbleSort(int[] array1){
    int ctr = array1.length;
    int temp =0;
    int n;

    for(int a=0; a< ctr; a++){
        for(int b =1; b<(ctr-a); b++){
            System.out.println("Elements [" + array1[b-1] + "] [" + array1[b] + "]");

            if(array1[b-1] > array1[b]){
                //swapping technique
                temp = array1[b-1];
                array1[b-1] = array1[b];
                array1[b] = temp;
            }
        }
    }
}
static void insertSort(int array2[]){
    int ctr = array2.length;

    for( int a =1; a < ctr; a++){
         int toInsert = array2[a];
         int h = a - 1; //hole position

         while (( h> - 1) && (array2[h] > toInsert)){
            array2[h +1] = array2[h];
            h--;// on the way to left / decrement

         }
         array2[h + 1] = toInsert;
    }
}
    public static void main(String[] args){
        int b_array[] = {14,33,27,35,10};
        int i_array[] = {14,33,27,10,35,19,42,44};

        //UNSORTED
        System.out.print("UNSORTED ARRAY:\n" );
            for (int a =0; a < b_array.length; a++){
                System.out.print(" " + i_array[a]);
            }
        //call function
       // BubbleSort(b_array);
        insertSort(i_array);
        //SORTED
            System.out.print("\n\nSORTED ARRAY:  " );
            for (int a =0; a < i_array.length; a++){
                System.out.print(" " + i_array[a]);
            }
    }
}
