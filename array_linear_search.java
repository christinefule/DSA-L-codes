public class array_linear_search {
    
    public static int linearSearch(int[] num, int key) {
        for (int x = 0; x < num.length; x++){
            if(num[x] == key){
                return x;
            }
        }
        return -1;
    }

    
        public static void main(String[] args){

            int[] num_array = {10,20,30,40,50,60,70,80,90};

            int key = 50;
            System.out.print(key + "is found at " + linearSearch(num_array, key) );
        }
} 

