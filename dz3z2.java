/* Задание 2
    Пусть дан произвольный список целых чисел. 
    Удалить из него чётные числа.
 */

 import java.util.ArrayList;
 import java.util.Random;
 import java.util.List;
 
 public class dz3z2 {
 
     private static Random random = new Random();
     public static void main(String[] args) {
 
         
         List<Integer> listArray = getRandomArray(10, -50, 51);
         
         
         System.out.println("Содержимое списка чисел:");
         System.out.println(listArray);
         
         
         removalEvenElements(listArray);

         
         System.out.println("Список только НЕчётных чисел:");         
         System.out.println(listArray);
         
     }
 
         
     static List<Integer> getRandomArray(int size, int min, int max){
         List<Integer> listArray = new ArrayList<Integer>();
         
         int index = 0;
         while (index < size) {
             listArray.add(random.nextInt(min, max));
             index = index + 1;
         }
         return listArray;
     }

     
     static List<Integer> removalEvenElements(List<Integer> listAr){
        for (int i = 0; i < listAr.size(); i++) {
            if ((Integer)listAr.get(i) % 2 == 0){
                listAr.remove(i);
                i--;
            }
        }
        return listAr;
    }
 
 }