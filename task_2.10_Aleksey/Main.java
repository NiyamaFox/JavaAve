/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 73, 23, 23, 236, 34, 85};
        int same = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (same % numbers[i] == 0) {
                same = numbers[i];
                System.out.println("да");
            }else{
                System.out.println("нет");
            }
        }
    }
}                   // Не могу понять, как это сделать
