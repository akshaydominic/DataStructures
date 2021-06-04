package Excercise1;

import java.util.ArrayList;
import java.util.List;

class workspace{

    //Find duplicates element in array
	//input : [2,3,1,3,4,1,5,1,2]
    //got:[231301012],[2313112][231311]
    //solutionn array:[2,3,1]
    public static void main(String[] args) {
        int[] inputarray= new int[]{2,3,1,3,4,1,5,1,2,3};
        List<Integer> results= findduplicates(inputarray);
        printarrayList(results);
       
    }
    private static void printarrayList(List<Integer> results) {
        for(int i: results){
            System.out.println(i);
        }
    }
    public static List<Integer> findduplicates(int[] duplicatearray){
        List<Integer>solutions = new ArrayList<>();
        
            for(int i=0;i<duplicatearray.length;i++){
            for(int j=i+1;j<duplicatearray.length;j++){
                    if(duplicatearray[i]==duplicatearray[j] && !(linearSearchlist(solutions,duplicatearray[j])) ){
                        solutions.add(duplicatearray[i]);
                        break;
                    }
            }  
        }
        return solutions;
    }
    public static boolean linearSearchlist(List<Integer> sol,int searchelement){
        
        for(int i : sol){
            if(searchelement == i){
                return true;
            }
        }
        return false; 
    }
}