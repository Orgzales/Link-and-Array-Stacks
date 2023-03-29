import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        Random prng = new Random();

        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = prng.nextInt(100);
        }

        printStuff(numbers);
        qsort(numbers);
        printStuff(numbers);

        String[] names = {"orion", "lee", "peter", "Atya", "Casey", "JD"};

        printStuff(names);
        qsort(names);
        printStuff(names);
    }

    private static <E> void printStuff(E[] stuff)
    {
        for (E element: stuff) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static <E extends Comparable> void qsort(E[] stuff)
    {
        qsort(stuff, 0, stuff.length-1);

    }

    private static <E extends Comparable> void qsort(E[] stuff, int start, int end)
    {
        if (start >= end)
            return;

        int p = partition(stuff, start, end);
        qsort(stuff, start, p);
        qsort(stuff, p+1, end);

    }

    private static <E extends Comparable> int partition(E[] stuff, int start, int end)
    {
        int pi = (start + end ) / 2;
        E pivot = stuff[pi];

        int i = start;
        int j = end;

        while(true)
        {
            while(stuff[i].compareTo(pivot)<0)
                i++;
            while(stuff[i].compareTo(pivot)>0)
                j--;

            if (i >= j)
                return j;

            E temp = stuff[i];
            stuff[i] = stuff[j];
            stuff[j] = temp;

            i++;
            j--;
        }
    }

}
