import java.util.ArrayList;

/**
 Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */

public class DeleteEvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(19);
        list.add(22);
        list.add(26);
        list.add(45);
        list.add(99);
        list.add(56);
        list.add(666);

        for(int ind = 0; ind < list.size(); ind++){
            if (list.get(ind) % 2 == 0) list.remove(ind--);
        }
        System.out.println(list);
    }
}
