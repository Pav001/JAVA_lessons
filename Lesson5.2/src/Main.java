public class Main {
    public static void main(String[] args) {
        // FOR statement
        System.out.println("For");
        for (int i= 100; i < 300; i++) {
            if (i >= 200 && i <= 210) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        for (int j=100; j<300; j++){
            if (j>=220 && j<=250){
                System.out.print(j+" ");
                if ((j+1)%10==0) {
                    System.out.println();
                }
            }
        }
        // WHILE statement
        System.out.println("\nWhile");
        int i=1;
        while (i<=300){
            if (i>=200 && i<=210){
                System.out.print(i+";");
            }
            i++;
        }
        System.out.println();
        i = 1;
        while (i<=300){
            if (i>=220 && i<=250){
                System.out.print(i+",");
            }
            i++;
        }
        // one
        System.out.println("\nOne For");
        for (i=100; i<300; i++){
            if ((i>=200 && i<=210)||(i>=220 && i<=250)){
                System.out.print(i+":");
                if (i==210){
                    System.out.println();
                }
            }
        }
        System.out.println("\nOne While");
        i=100;
        while (i<300){
            if ((i>=200 && i<=210)||(i>=220 && i<=250)){
                System.out.print(i+".");
                if (i==210) {
                    System.out.println();
                }
            }
            i+=1;
        }
    }
}

