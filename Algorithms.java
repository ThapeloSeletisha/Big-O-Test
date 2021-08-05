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
    public static int[] initialize(int size)
    {

    }
    public static int linearCount(int[] data, int value)
    {

    }
    public static int bubbleSort(int[] arr)
    {

    }
    
}