public class Main {


    public static <T extends Comparable<T>> void mySort(T[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            T key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i].compareTo(key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {

        System.out.println("Int Array Sort: ");
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Before Sort");

        for (Integer i : arr1) System.out.println(i + " ");
        System.out.println();

        System.out.println();

        mySort(arr1);

        System.out.println("After Sort");

        for (Integer i : arr1) System.out.println(i + " ");
        System.out.println();

        Meat[] meats = {
                new Meat("Steak", 800, "Beef", 52),
                new Meat("Breast", 165, "Poultry", 31),
                new Meat("Salmon", 367, "Fish", 40),
                new Meat("Pork", 313, "Pork", 26),
                new Meat("Turkey", 245, "Poultry", 28)


        };
        System.out.println("before: ");
        for (Meat m : meats) System.out.println(" " + m);
        mySort(meats);

        System.out.println("after:");
        for (Meat m : meats) System.out.println(" " + m);

    }



    }
}