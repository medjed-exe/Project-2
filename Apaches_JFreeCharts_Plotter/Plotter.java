
/**
 * This class plots a function using JFreeCharts.
 * This function will then be salted and smoothed using Apaches stats library.
 *
 * @Bianca Hernandez
 */
public class Plotter
{
    // instance variables
    private int x[] = {-2, 0, 2};
    private int m = 2;
    private int b = 1;
    private int y;
    /**
     * Constructor for class Plotter.
     * @param none
     */
    public Plotter()
    {
        for (int element: x ){ // for each loop to go through all the elements in array x
            y = m * element + b;
        }
    }

    /**
     * This method returns the function y.
     *
     * @param none
     * @return the function y
     */
    public int getFunction()
    {
        return y;
    }
}
