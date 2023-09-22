import java.util.Arrays;

class Array_Test{
    int[] array_number = new int[5]; //create a empty array with 5 positions
    int[] array_number2 = {3,5,4,2,1}; // create a array with 5 defined positions

    public void operate_in_Array (){
        array_number[0] = 12;
        System.out.println(array_number[0]);//show the number insert in position 0 
        System.out.println(array_number2.length);//show o length the positions this array
        Arrays.sort(array_number2); //order this array 
        System.out.println(Arrays.toString(array_number2)); //print each elements this array
    }
 }