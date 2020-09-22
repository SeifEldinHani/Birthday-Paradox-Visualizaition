/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 class BirthdayParadox{
    private static java.util.Random generator = new java.util.Random();
    
    
    
    private static int oneRun(int range){
        boolean []chosenbefore = new boolean [range];
        for(int i=0;i<range;i++)
        {
            chosenbefore[i] = false; 
        }
        int counter = 0;
        while(true)
        {
            int next = generator.nextInt(range);
            if(chosenbefore[next]==false)
            {
                counter = counter + 1;
                chosenbefore[next] = true;
            }
            else{
                 return counter;
                
            }
        }
        
    }
    
     public static Statistics runExperiments(int range, int numberOfRuns)
     {
        Statistics snew = new Statistics(numberOfRuns);
        for(int i=0;i<numberOfRuns;i++)
        {
            int temp = oneRun(range);
            snew.updateStatistics(temp);
        }
        return snew;
    }

    public static void main(String[] args)
    {
        int size = 0;
        int runs = 0;
        if(args.length == 0)
        {
            size = 365;
            runs = 50;
        }
        else if( args.length == 2)
        {
            size = Integer.parseInt(args[0]);
            runs = Integer.parseInt(args[0]);
        }
        
        System.out.println(runExperiments(size , runs).toString());
    }

}
 class Statistics{
        private int min;
        private int max;
        private int results[];   
        private int counter2;
        private int sum;
        private int chosloc;
        public Statistics(int numberOfRuns)
        {
            this.counter2 = numberOfRuns;
            this.min = 10000;
            this.max = 0;
            this.results = new int[numberOfRuns];
            this.chosloc = 0;
        }
        
        public void updateStatistics(int value)
        {
            if(value> this.max)
            {
                this.max = value;
            }
            if(value<this.min)
            {
                this.min = value;
            }
            this.sum = this.sum + value;
            this.results[this.chosloc] = value;
            this.chosloc = this.chosloc + 1;
        }
        
        public double average()
        {
            return this.sum/this.counter2;
        }
        
        public double standardDeviation()
        {
            double sum = 0.0;
            double sum2 =0.0;
            double aveg = this.average();
            for (int j = 0; j < this.results.length ; j++)
            {
                sum = sum + Math.pow(this.results[j] - aveg,2);
            }
            sum2 = sum/this.counter2;
            return Math.sqrt(sum2);
        }
        
        public String toString(){
            return "Minimum: " + this.min + "\n Maximum: " + this.max + "\n Average: " + String.format("%.2f", this.average()) + "\n Standard Deviation : " + String.format("%.2f",this.standardDeviation()); 
        }
    }
    
   
