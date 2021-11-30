import java.util.Scanner;
public class Hw2 {
    public static double min;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = new double[4][5];
        System.out.println("\t- Hello to the Average Calculation Program -");
        System.out.println();

        System.out.print("*This program will fined the average for every 5 numbers entered!---> ");
        System.out.println("And then will display the (minimum average)...");
        System.out.println("*For fun we will display the numbers in reverse order like magic!! :o");
        System.out.println("*Please Enter 20 numbers which every row can contain only 5 numbers!");
        System.out.println("--Enjoy with the calculation =)--");
        System.out.println();
        System.out.println();
        System.out.println("START!");


        int j=1;
        for (double[] oneDarray : array) { //Enter the numbers by user
            System.out.println("Enter 5 numbers to find the average");

            for (int i = 0; i < oneDarray.length; i++) {

                oneDarray[i] = input.nextDouble();
            }


            if(j< array.length){ //print (Again) from row1 to row3
                System.out.print("Again ");}

            j++;

        }

        System.out.printf("%88s\n", "Averages");
        System.out.println("------------------------------------------------------------------------------------------");
        double average;


        for (int number = 0; number < array.length; number++) { //display the number with all averages and the minimum average

            System.out.printf("INPUTS %1d\t\t", number + 1);

            for (double rows : array[number]) {
                System.out.printf("%,10.2f", rows);

            }



            average= finedAverage(array[number]);//Averages calculation method
            System.out.printf("%,22.2f", average);

            finedMinAverage(average,number); //minimum average finder method
            System.out.println("\n------------------------------------------------------------------------------------------");

        }


        System.out.println();
        System.out.printf("The minimum average between them is ----------------->[%,.2f]\n",min);


        System.out.println("\n\n\t--Print The Numbers In The Reverse Order--");
        System.out.println("--------------------------------------------------------------------");
        reverseArray(array);
        System.out.println("\n\nThe End, see you son ;)!");


    }


//method1
    public static double finedAverage(double[] array2) {
        double total = 0;

        for (double amount : array2) {
            total += amount;
        }

        return total/array2.length;
    }


//method2
    public static void finedMinAverage(double value , int row) {
        if (row==0) //assume the first average is the minimum!
            min=value;

        if(value<min)
            min = value;
    }



//method3
    public static void reverseArray(double[][] array3){

       for( int Row=array3.length-1; Row>=0 ; Row--){

           System.out.printf("INPUTS %1d\t", Row+1 );

           for (int Column=array3[Row].length-1; Column>=0;Column-- ){
               System.out.printf("%,10.2f",array3[Row][Column]);
           }

           System.out.println();
           System.out.println("--------------------------------------------------------------------");

       }
    }


}//end class
