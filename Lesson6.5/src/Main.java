public class Main {
    public static void main(String[] args) {
        int[] newArray1 = {99, 88, 88, 6, 5, 4, 3, 20, 20, 1, 1};
        int[] newArray2 = new int[newArray1.length];
System.out.println("Массив до сортировки:");
    for (int i: newArray1){
        System.out.print(i+" ");
    }
        for (int i = 0; i < newArray1.length - 1; i++) {
            for (int j = 0; j < newArray1.length -1; j++) {
                if (newArray1[j] >= newArray1[j + 1]) {
                    newArray2[j] = newArray1[j + 1];
                    newArray1[j+1]=newArray1[j];
                    newArray1[j]=newArray2[j];
                   // System.out.print(newArray1[j]+" "); использовал для доп проверки работы цикла

                } else { continue; // не понял как работают break / continue, в каких случаях их применять
                }
            }
        }
        System.out.println("\nМассив после пузырьковой сортировки:");
        for (int i : newArray1) {
            System.out.print(i + " ");
        }
    }
}
