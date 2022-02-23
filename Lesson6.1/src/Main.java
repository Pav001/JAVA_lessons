public class Main {
    public static void main(String[] args) {
        int[] newArray1 = {11, 22, 33, 44, 55};
        // тут сначала был цикл FOR но IDEA предложил заменить, наверное более компактное решение
        for (int k : newArray1) {
            System.out.print(k + " ");
        }
        System.out.println("\n Exercise 6.2");
        for (int i = newArray1.length - 1; i >= 0; i--) {
            System.out.print(newArray1[i] + " ");
        }
        System.out.println("\n Exercise 6.3");
        // создал еще один массив такой же размерности и записал в него значения в обратном порядке
        int[] newArray2 = new int[5];
        for (int i = 0; i < newArray1.length; i++) {
            newArray2[newArray2.length - i - 1] = newArray1[i];
        }
        // и тут изначально был цикл FOR
        for (int j : newArray2) {
            System.out.print(j + " ");
        }
    }
}
