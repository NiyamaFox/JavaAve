/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {15, 10, 5, 20, 25};
        int five = 5;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == five) System.out.println("да");
            else {
                System.out.println("нет");
            }
        }
    }
}
