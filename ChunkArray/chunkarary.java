import java.util.*;
public class chunkarary {
    //chunking the array based on the size passed on 
    //like array[1,2,3,4,5](2)=>[[1,2][3,4][5]]
    public static void main(String[] args) {
        int[] input = {1,2,3,4,78,999,-1,456};
        int chunkSize = 3;
        int[][] output = chunk_array(input, chunkSize);
        for(int[] i :output){
            for(int o: i){
                System.out.print(" "+o);               
            }
            System.out.println();
        }
       
    }
    public static int[][] chunk_array(int[] arr,int size) {
        if(size<=0){
            return null;
        }
        int rest=arr.length%size;// if 0 equal parts orelse any number means unequal parts
        int chunked_size = arr.length/size+(rest>0 ? 1 : 0);
        int[][] chunked = new int[chunked_size][];
        for(int i=0;i<(rest > 0 ? chunked_size-1:chunked_size);i++){
            chunked[i]=Arrays.copyOfRange(arr,i*size,i*size+size);
        }
        if(rest>0){
            chunked[chunked_size-1]=Arrays.copyOfRange(arr,(chunked_size-1)*size,(chunked_size-1)*size+rest);
        }
        return chunked;


        
    }
    public static int[][] splitArray(int[] arrayToSplit, int chunkSize){
        if(chunkSize<=0){
            return null;  // just in case :)
        }
        // first we have to check if the array can be split in multiple 
        // arrays of equal 'chunk' size
        int rest = arrayToSplit.length % chunkSize;  // if rest>0 then our last array will have less elements than the others 
        // then we check in how many arrays we can split our input array
        int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0); // we may have to add an additional array for the 'rest'
        // now we know how many arrays we need and create our result array
        int[][] arrays = new int[chunks][];
        // we create our resulting arrays by copying the corresponding 
        // part from the input array. If we have a rest (rest>0), then
        // the last array will have less elements than the others. This 
        // needs to be handled separately, so we iterate 1 times less.
        for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++){
            // this copies 'chunk' times 'chunkSize' elements into a new array
            arrays[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize);
        }
        if(rest > 0){ // only when we have a rest
            // we copy the remaining elements into the last chunk
            arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest);
        }
        return arrays; // that's it
    }
}
