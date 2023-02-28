import java.util.ArrayList;
import java.util.Random;

public class ArrayDifference {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        addElements(list1);
        addElements(list2);
        System.out.println("Исходные списки:\n" + list1 + "\n" + list2);
        System.out.println("Разность массивов для 1 списка:");
        differenceArray(list1, list2);
        System.out.println("Разность массивов для 2 списка:");
        differenceArray(list2, list1);
        System.out.println("Симметрическая разность:");
        symmetricalDifference(list1, list2);
    }

    private static void addElements(ArrayList<Integer> list){
        Random rand = new Random();

        for (int num = 0; num < 10; num++){
            list.add(rand.nextInt(0, 20));
        }
    }

    private static void differenceArray(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            if(!(list2.contains(list1.get(i)))) result.add(list1.get(i)); 
        }
        System.out.println(result); 
    }

    private static void symmetricalDifference(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            if(!(list2.contains(list1.get(i)))) result.add(list1.get(i)); 
        }
        for (int j = 0; j < list2.size(); j++){
            if(!(list1.contains(list2.get(j)))) result.add(list2.get(j)); 
        }
        System.out.println(result);
    }
}
