/** Задание 1
 Реализовать алгоритм сортировки слиянием.
 */

import java.util.Random;


public class dz3z1 {
    private static Random random = new Random();
    public static void main(String[] args) {
       
        int[] arr = getRandomArray(11, 0, 100); 

        printArr(arr, "Сгенерированный массив: "); 

        sortArr(arr); 

        printArr(arr, "Отсортированный массив: "); 

    }

  
    static int[] getRandomArray(int size, int min, int max){
        int[] arr = new int[size];//
        int index = 0;
        while (index < size) {
            arr[index] = random.nextInt(min, max);
            index = index + 1;
        }
        return arr;
    }



    static String printArr(int[] arr, String text){
        System.out.println(text);
        for (int element : arr) System.out.printf("%d ", element);
        System.out.println("");

        return null;
    }


    public static int[] sortArr(int[] array){
           
        if (array.length == 1) return array; 

        int firstPartArray[] = new int[array.length/2]; 
        System.arraycopy(array, 0, firstPartArray, 0, array.length/2);
        
        int secondPartArray[] = new int[array.length-firstPartArray.length];
        System.arraycopy(array, firstPartArray.length, secondPartArray, 0, array.length-firstPartArray.length);
        
        sortArr(firstPartArray);
        sortArr(secondPartArray);

        mergeArr(array, firstPartArray,secondPartArray); 

        return array;
    }


    public static void mergeArr(int[] array, int[] firstPartArray, int[] secondPartArray) {
    
        int positionLeftArr = 0;
        int positionRightArr = 0;
        int len = array.length;
       
    
        for (int i = 0; i < len; i++) {
            if (positionLeftArr == firstPartArray.length){  
                array[i] = secondPartArray[positionRightArr];
                positionRightArr++;
            } else if (positionRightArr == secondPartArray.length) {    
                array[i] = firstPartArray[positionLeftArr];
                positionLeftArr++;
            } else if (firstPartArray[positionLeftArr] < secondPartArray[positionRightArr]) {   
                array[i] = firstPartArray[positionLeftArr];     
                positionLeftArr++;     
            } else {    
                array[i] = secondPartArray[positionRightArr];
                positionRightArr++;     
            }
        }
    }

}