/* Задание 3
    Задан целочисленный список ArrayList. 
    Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

 import java.util.ArrayList;
 import java.util.Random;
 import java.util.List;
 
 public class dz3z3 {
 
     private static Random random = new Random();
     public static void main(String[] args) {
 
         
         List<Integer> listArray = getRandomArray(10, -50, 51);
         
         
         System.out.println("Сформированный список чисел:");
         System.out.println(listArray);
         
         
         findMinMaxAverage(listArray);
         
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
 
         
     static void findMinMaxAverage(List<Integer> listArray){
         int min = (Integer)listArray.get(0);
         int max = (Integer)listArray.get(0);
         int lenList = listArray.size();
         double sum = 0;
         
         for (int i = 1; i < lenList; i++) {
             sum += (Integer)listArray.get(i);
             if ((Integer)listArray.get(i) < min) min = (Integer) listArray.get(i);
             if ((Integer)listArray.get(i) > max) max = (Integer) listArray.get(i);
         }
         
         double average = sum/lenList;
 
         
         System.out.println("Максимальное значение = " + max);
         System.out.println("Минимальное значение  = " + min);
         System.out.println("Cреднее арифметичское = " + average);
     }
 }