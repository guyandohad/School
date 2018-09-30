import java.util.Scanner;

class scritp{
    public static void main (String [] args){
        int num1 = 0;
        String word = "Hello";
        System.out.println(word);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num1 = input.nextInt();

        for (int i= 0 ; i < 100 ; i++ ){
            num1++;
            System.out.println(num1);
        }



    }
}
