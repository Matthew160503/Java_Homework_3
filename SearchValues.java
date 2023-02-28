import java.util.ArrayList;
import java.util.Random;

/**
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

public class SearchValues {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();

        for (int num = 0; num < 10; num++){
            array.add(rand.nextInt(0, 101));
        }

        System.out.println(array);
        searchMinAndMaxValues(array);
        calculateAverageValue(array);
    }

    private static void searchMinAndMaxValues(ArrayList<Integer> array){
        int min = array.get(0);
        int max = array.get(0);
        for(int i = 0; i < array.size(); i++){
            if (min > array.get(i)) min = array.get(i);
            else if(max < array.get(i)) max = array.get(i);
            else continue;
        }
        System.out.format("Минимальное значение списка равно %d, а максимальное - %d\n", min, max);
    }

    private static void calculateAverageValue(ArrayList<Integer> array){
        double averageValue = 0;
        for(int value : array){
            averageValue += value;
        }
        averageValue /= array.size();
        System.out.println("Среднее значение равно " + averageValue);
    }
}
