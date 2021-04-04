/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] elements = {2, 3, 4, 5};
        int mnoj = 1;
        for (int i = 0; i < elements.length; i++) {
            mnoj = mnoj * elements[i];
            System.out.println(mnoj);
        }
    }
}
