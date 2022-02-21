public class Main {
    public static void main(String[] args){
        // Enter ingredients in gram
        int milk = 2000;
        int flour = 500;
        int eggs = 30;
        int sugar = 50;
        int butter = 30;
        int apple = 8;
        byte not1 = 0;
        byte not2 = 0;
        byte not3 = 0;

        if (milk>=1000 && flour>=400 && sugar>=10 && butter>=30){
            System.out.println("You can make pancakes!");
            System.out.println("Recipe of pancakes:\nflour-400g, sugar-10g, milk-1l, butter-30 ml.");
        } else {
            not1 = 1;
        }
        if (milk>=300 && eggs>=5 && flour>=5){
            System.out.println("You can make omelette!");
            System.out.println("Recipe of omelette:\nflour-5g, milk-300 ml, eggs-5.");
        } else {
            not2 = 2;
        }
        if (apple>=3 && milk>=100 && flour>=300 && eggs>=4){
            System.out.println("You can make Apple pie!");
            System.out.println("Recipe of pancakes:\napple-3, flour-300g, milk-300ml, eggs-4");
        }else {
            not3 = 3;
        }
        if (not1==1 && not2==2 && not3==3){
            System.out.println("Sorry! You couldn't cook anything!\nYou need check any ingredients.");
        }
//        рецепты:
//        pancakes  (мука 400г ,сахар 10г, молоко 1 литр, масло 30 мл.)
//        omelette (молоко 300 мл, яйца 5 шт,  мука 5 г)
//        Apple pie (яблоки 3 шт, молоко 100 мл, мука 300г, яйца 4 шт.)

    }
}
