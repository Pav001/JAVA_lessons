public class Main {
    public static void main(String[] args) {
        // FOR statement
        System.out.println("For 200-210:");
        for (int i= 200; i <=210; i++) {
                System.out.print(i+" ");
        }
        System.out.println("\nFor 220-250:");
        for (int j=220; j<=250; j++){
                System.out.print(j+" ");
                if ((j+1)%10==0) {
                    System.out.println();
                }
        }
        // WHILE statement
        System.out.println("\nWhile 200-210:");
        int i=200;
        while (i<=210){
                System.out.print(i+" ");
            i++;
        }
        System.out.println("\nWhile 220-250:");
        i = 220;
        while (i<=250){
                System.out.print(i+" ");
            i++;
        }
        // one
        System.out.println("\nOne For:");
        for (i=200; i<=250; i++){
            if ((i>=200 && i<=210)||(i>=220 && i<=250)){
                System.out.print(i+" ");
                if (i==210){
                    System.out.println();
                }
            }
        }
        System.out.println("\nOne While:");
        i=200;
        while (i<=250){
            if ((i>=200 && i<=210)||(i>=220 && i<=250)){
                System.out.print(i+" ");
                if (i==210) {
                    System.out.println();
                }
            }
            i+=1;
        }
    }
}

