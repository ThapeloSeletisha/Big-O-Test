import java.util.Random;
/**
 * This class defines functions
 * that implement algorithms
 */
public class Algorithms {
    public static void main(String[] args) {
        int size=10000;
        Timer myTimer=new Timer();
        int[] data = initialize(size);
        myTimer.start();
        int position = linearCount(data, 50);
        myTimer.stop();
        System.out.println("Time : " + myTimer.getTime());
    }
    // Generates an array with random integers
    // Returns the array
    public static int[] initialize(int size)
    {
        int[] data = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++)
        {
            data[i] = generator.nextInt(1000000);
        }
        return data;
    }
    // Counts the number of occurance of a some value
    // returns that number
    public static int linearCount(int[] data, int value)
    {
        
    }
    // Uses the bubble sort algorithm to sort the array
    // Returns that array
    public static int[] bubbleSort(int[] data)
    {

    }
    
}