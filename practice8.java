import java.util.*;
class practice8{
    public static void main(String[]args){
        
        int[] name={1,2,34,5,6};
        int[] name1=new int[name.length];
        int i=0;
     
            for(int j=name1.length-1;j>=0;j--){
                name1[i]=name[j];
                i++;


            }          
    

        System.out.println(Arrays.toString(name1));
    }
}