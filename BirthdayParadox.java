public class BirthdayParadox {
    /* Random generator */
    private static java.util.Random generator = new java.util.Random();
    /* The function runExperiments runs the series of experiments, and
    stores the result into a Statistics object. The parameter range is the
    size of the set from which random number are drawn. The parameter
    numberOfRuns is the number of experiments to run. The function returns
    a reference to a Statistics instance that holds the result of the
    experiment (min, max, average, stdev).
    */
    public static Statistics runExperiments(int range, int numberOfRuns){

        Statistics s = new Statistics(numberOfRuns);
        for(int i = 1; i <= numberOfRuns ; i++)
        {

        }

    }
    private static int oneRun(int range){
        boolean[] Visited = new boolean[range];
        int count =0 ;
        int ret;
        for (int i = 0 ; i < range ; i++)
        {
            Visited[i] = false;
        }
        int rand = generator.nextInt(range - 1);
        while(true) {
            if (!Visited[rand]) {
                count += 1;
                Visited[rand] = true;
            } else {
                ret = count;
                break;
            }
        }
        return ret;
    }
    /* Main method. The default size of the set is 365, and the experiment
    is run 50 times. Both numbers can be reset from the command line. This
    method runs the experiments and prints the resulting Statistics. The
    param args, if not empty, contains the runtime values for the size of
    the set and the number of runs
    */
    public static void main(String[] args) {
        int size ;
        int runs ;
        if (args.length == 0)
        {
            size = 365;
            runs = 50;
        }
        else if (args.length == 2)
        {
            size = Integer.parseInt(args[0]);
            runs = Integer.parseInt(args[1]);
        }
    }
}
/**
 * The class Statistics accumulates the results of
 * the experiments. It knows ahead of time how many experiments
 * will be run, and provides at the end the min, the max, the
 * average and the standard deviation for the data.
 *
 * This class should not use classes such as Array,
 * Lists etc. to store the data, only primitive types
 * and java arrays.
 *
 *
 */
public class Statistics {
    // ADD HERE INSTANCE VARIABLES DECLARATION
// The numberOfRuns is the number of experiments that will be run
    public Statistics(int numberOfRuns){
        int Minimum = Integer.MAX_VALUE;
        int Maximum = 0 ;
        float Average = 0 ;
        float StandardDeviation = 0;
    }
    /* Updates statistics after one experiment. This method cannot be
    called more times than the parameter that was passed in the
    constructor. If it is, an error message should be printed and no
    change should occur. The param value the result returned from a new
    experiment
    */
    public void updateStatistics(int value){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }
    /* The function returns the current average of the values passed to
    the method updateStatistic
    */
    public double average(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }
    /* The function returns the current standard deviation of the values
    passed to the method updateStatistic
    */
    public double standardDeviation(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }
    /* this function returns the complete statistics information:
    current minimum, maximum, average, and stdev. For the last two, only
    two digit decimals are printed. The toString function will define how
    an object will be printed out if you use something like
    System.out.println(objectName). It simply returns a string back
    describing the text that will be printed out.
    */
    public String toString(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }
}
