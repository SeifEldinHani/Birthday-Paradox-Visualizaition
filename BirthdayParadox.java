public class BirthdayParadox {
    private static java.util.Random generator = new java.util.Random();
    public static Statistics runExperiments(int range, int numberOfRuns){

        Statistics s = new Statistics(numberOfRuns);
        for (int i = 0; i < numberOfRuns ; i++)
        {
            int temp = oneRun(range);
            s.updateStatistics(temp);
        }
        return s;
    }
    private static int oneRun(int range){
        boolean[] Visited = new boolean[range];
        int count =0 ;
        int ret;
        for (int i = 0 ; i < range ; i++)
        {
            Visited[i] = false;
        }
        while(true) {
            int rand = generator.nextInt(range - 1);
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
    public static void main(String[] args) {
        int size =0;
        int runs =0;
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

        System.out.println(runExperiments(size , runs).toString());
    }
}

class Statistics {
    private int Minimum;
    private int Maximum;
    private int [] results;
    private int sum ;
    private int count ;
    private int track;

    public Statistics(int numberOfRuns){
        this.Minimum = Integer.MAX_VALUE;
        this.Maximum = 0;
        this.results = new int[numberOfRuns];
        this.count = numberOfRuns;
        this.track = 0;

    }
    public void updateStatistics(int value){

        if (value > this.Maximum)
        {
            this.Maximum = value;
        }
        if (value < this.Minimum)
        {
            this.Minimum = value;
        }
        this.sum += value;
        this.results[this.track] = value;
        this.track++;
    }

    public double average(){
        return this.sum / this.count ;
    }

    public double standardDeviation(){
        double Sum =0 ;
        double avg = this.average();
        for (int i=0 ; i < this.results.length ; i++)
        {
            Sum += Math.pow(this.results[i] - avg , 2);
        }
        return Math.sqrt(Sum / this.count);
   }

    public String toString(){

      return "Minimum: " + this.Minimum +"\n Maximum: " + this.Maximum +"\n Average: " + String.format("%.2f", this.average()) +"\n Standard Deviation: " + String.format("%.2f" ,this.standardDeviation());
    }
}
