/**
 * The class counts the amount of time passed
 * Used to assess the time an algorithm takes
 * args:
 *      none
 */
public class Timer {
    
    private long startTime;
    private long endTime;

    // Starts the timer
    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    // Ends the timer
    public void stop()
    {
        endTime = System.currentTimeMillis();
    }

    // Returns the amount of time passed on success
    // Returns -1 if an invalid call is made
    public long getTime()
    {
        return (endTime - startTime);
    }
}

