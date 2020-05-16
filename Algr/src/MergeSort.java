import java.util.ArrayList;
// import cs1.Keyboard;

public class MergeSort {
        public static void main(String[] args) {
                int[] n1 = { 1, 4, 5, 10 };
                int[] n2 = { 2, 6, 7, 8, 22 };
                System.out.println("Sort 1");
                for (int s : merge(n1, n2))
                        System.out.println(s);

                System.out.println();

                int[] n3 = { 4, 1, 1000, 3, 6, 8, 2, 7, 5, 9 };
                System.out.println("Basic Array merge sort");
                for (int num : mergeSort(n3))
                        System.out.println(num);

                System.out.println();

                String n4 = "4, 5, 1, 100, 0, 4, 2, 8, 9";
                // String n5 = Keyboard.readString();
                System.out.println("Basic String merge sort");
                for (int num : mergeSort(n4))
                        System.out.println(num);

                System.out.println();

                String[] n = {"Hello", "hello", "I", "Lost", "My", "Wallet"};
                System.out.println("True String sort");
                for (String word : mergeSort(n, true))
                        System.out.println(word);

                System.out.println();

                ArrayList<Integer> n6 = new ArrayList<Integer>();
                ArrayList<Integer> n7 = new ArrayList<Integer>();
                n6.add(1);
                n6.add(10);
                n7.add(5);
                n7.add(7);
                n7.add(9);
                System.out.println("ArrayList merge");
                System.out.println(merge(n6, n7));
                System.out.println();

                ArrayList<Integer> n8 = new ArrayList<Integer>();
                n8.add(111);
                n8.add(10);
                n8.add(55);
                n8.add(7);
                n8.add(9);
                System.out.println("ArrayList mergeSort");
                System.out.println(mergeSort(n8));
        }

        public static int[] merge(int[] arrayLo, int[] arrayHi) {
                int[] mergeArray = new int[arrayLo.length + arrayHi.length];
                int indexLo = 0, indexHi = 0, index = 0;
                while (indexLo < arrayLo.length && indexHi < arrayHi.length) {
                        if (arrayLo[indexLo] < arrayHi[indexHi]) {
                                mergeArray[index] = arrayLo[indexLo];
                                indexLo++;
                        } else {
                                mergeArray[index] = arrayHi[indexHi];
                                indexHi++;
                        }
                        index++;
                }

                for (; index < mergeArray.length; index++) {
                        if (indexHi != arrayHi.length) {
                                mergeArray[index] = arrayHi[indexHi];
                                indexHi++;
                        } else {
                                mergeArray[index] = arrayLo[indexLo];
                                indexLo++;
                        }
                }

                return mergeArray;
        }

        public static int[] mergeSort(int[] array) {
                if (array.length < 2)
                        return array;
                else {
                        int middle = array.length / 2, secondHalf = array.length - middle;
                        int[] arrayLo = new int[middle];
                        int[] arrayHi = new int[secondHalf];
                        int indexLo = 0, indexHi = 0;
                        for (int index = 0; index < array.length; index++) {
                                if (index < middle) {
                                        arrayLo[indexLo] = array[index];
                                        indexLo++;
                                } else {
                                        arrayHi[indexHi] = array[index];
                                        indexHi++;
                                }
                        }
                        return merge(mergeSort(arrayLo), mergeSort(arrayHi));
                }
        }

        public static int[] mergeSort(String Array) {
                String[] stringArray = Array.replaceAll("\\s+", "").split(",");
                int[] intArray = new int[stringArray.length];
                for (int index = 0; index < stringArray.length; index++)
                        intArray[index] = Integer.parseInt(stringArray[index]);
                return mergeSort(intArray);
        }

        public static String[] mergeSort(String[] Values, boolean trueStringSort) {
                if (Values.length < 2)
                        return Values;
                else {
                        int middle = Values.length / 2, secondHalf = Values.length - middle;
                        String[] arrayLo = new String[middle];
                        String[] arrayHi = new String[secondHalf];
                        int indexLo = 0, indexHi = 0;
                        
                        for (int index = 0; index < Values.length; index++) {
                                if (index < middle) {
                                        arrayLo[indexLo] = Values[index];
                                        indexLo++;
                                } else {
                                        arrayHi[indexHi] = Values[index];
                                        indexHi++;
                                }
                        }

                        return merge(mergeSort(arrayLo, true), mergeSort(arrayHi, true));
                }
        }

        public static String[] merge(String[] arrayLo, String[] arrayHi) {
                String[] mergeArray = new String[arrayLo.length + arrayHi.length];
                int indexLo = 0, indexHi = 0, index = 0;

                while (indexLo < arrayLo.length && indexHi < arrayHi.length) {
                        if (arrayLo[indexLo].compareTo(arrayHi[indexHi]) < 0) {
                                mergeArray[index] = arrayLo[indexLo];
                                indexLo++;
                        } else {
                                mergeArray[index] = arrayHi[indexHi];
                                indexHi++;
                        }
                        index++;
                }

                for (; index < mergeArray.length; index++) {
                        if (indexHi != arrayHi.length) {
                                mergeArray[index] = arrayHi[indexHi];
                                indexHi++;
                        } else {
                                mergeArray[index] = arrayLo[indexLo];
                                indexLo++;
                        }
                }

                return mergeArray;
        }

        public static ArrayList<Integer> merge(ArrayList<Integer> arrayLo, ArrayList<Integer> arrayHi) {
                ArrayList<Integer> mergeArray = new ArrayList<Integer>();
                int indexLo = 0, indexHi = 0;

                while (indexLo < arrayLo.size() && indexHi < arrayHi.size()) {
                        if (arrayLo.get(indexLo) < arrayHi.get(indexHi)) {
                                mergeArray.add(arrayLo.get(indexLo));
                                indexLo++;
                        } else {
                                mergeArray.add(arrayHi.get(indexHi));
                                indexHi++;
                        }
                }

                mergeArray.addAll(indexLo + indexHi, arrayLo.subList(indexLo, arrayLo.size()));
                mergeArray.addAll(indexLo + indexHi, arrayHi.subList(indexHi, arrayHi.size()));
                return mergeArray;
        }

        public static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
                if (array.size() < 2)
                        return array;
                else {
                        int middle = array.size() / 2;
                        ArrayList<Integer> arrayLo = new ArrayList<Integer>();
                        ArrayList<Integer> arrayHi = new ArrayList<Integer>();
                        arrayLo.addAll(array.subList(0, middle));
                        arrayHi.addAll(array.subList(middle, array.size()));
                        return merge(mergeSort(arrayLo), mergeSort(arrayHi));
                }

        }
}
