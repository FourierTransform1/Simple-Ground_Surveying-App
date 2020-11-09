import java.util.Scanner;

public class Main {



    private boolean[][] square = new boolean[5][5];
    private Scanner input = new Scanner(System.in);
    private int yPos;
    private int xPos;




private void surveyLocation(){


    System.out.println("enter location to survey:");
    System.out.println("x-axis: ");
    xPos = input.nextInt();
    System.out.println("y-axis: ");
    yPos = input.nextInt();




    if (square[xPos][yPos]){
        System.out.println("position has been surveyed already!");
    }else{
        square[xPos][yPos] = true;
    }
}


private void viewBackyard(){

    for (int i =0 ; i< 5 ; i++ ){
        System.out.println();

        for (int j = 0 ; j<5 ; j++){

         if (square[i][j]){
             System.out.print("X");
             System.out.print(" ");
         }else{
             System.out.print("*");
             System.out.print(" ");
         }

        }
    }
}


    public static void main(String[] args) {
    Main obj = new Main();


    while (true){

        System.out.println("\n\ndo you want to survey [1] or view plot[2]?");
        int choice = obj.input.nextInt();

        switch (choice){

            case 1:
                obj.surveyLocation();
                break;

            case 2:
                obj.viewBackyard();
                break;

        }





    }





    }








}
