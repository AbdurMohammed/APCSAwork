//Abdur Mohammed
//Period 5



public class Numbers {

    /** Method that takes an array and outputs the mean
     *
     * @param array - inputted array
     * @return - outputted mean
     */
    public static double mean(double[] array){

        double sum = 0;
        double mean = 0;

        for (double i : array) {
            sum += i;
        }

        mean = sum / array.length;
        return mean;
    }

    /**Method that takes an array and outputs the mode. Ties are broken using the lowest mode.
     *
     * @param array - inputted array
     * @return - outputted mode
     */
    public static int mode(int[] array){

        int[] counter = new int[array.length];
        int counterPosition = 0;
        int counterValue;
        int mode;

        //Count the number of times each int pops up and tally it in the array "counter"
        for (int i = 0; i < array.length; i++){

            int currentInt = array[i];

            for (int j = 0; j < i; j++){

                if(array[j] == currentInt){
                    counterPosition = j;

                    counterValue = counter[counterPosition];
                    counterValue += 1;
                    counter[counterPosition] = counterValue;

                    continue;
                }
            }

            counterPosition = i;

            counterValue = counter[counterPosition];
            counterValue += 1;
            counter[counterPosition] = counterValue;
        }



        int biggestCount = 0;
        int secondBiggestCount = 0;
        boolean modeTie = false;
        int mode1Pos = 0, mode2Pos = 0;

        //Find the biggest value in counter, i.e. the most frequent number
        for (int x = 0; x < counter.length; x++){

            if(counter[x] > biggestCount){
                biggestCount = counter[x];
                mode1Pos = x;
            }
        }

        //Checks for a tie
        for (int y = 0; y < counter.length; y++){
            if(counter[y] == biggestCount){
                secondBiggestCount = counter[y];
                mode2Pos = y;
                modeTie = true;
            }
        }

        //Breaks the tie by picking the smaller mode
        if(modeTie){
            int mode1 = array[mode1Pos];
            int mode2 = array[mode2Pos];

            if(mode1 < mode2){
                mode = mode1;
            }
            else{
                mode = mode2;
            }

            return mode;
        }

        mode = array[mode1Pos];
        return mode;
    }


    /**Method that takes an array and outputs its standard deviation
     *
     * @param array - inputted array
     * @return - outputted standard deviation
     */
    public static double stDev(int[] array){

        double[] arrayForMean = new double[array.length];
        for(int i = 0; i < array.length; i++){
            arrayForMean[i] = array[i];
        }

        double mean = mean(arrayForMean);

        double[] numerator = new double[array.length];

        for(int j = 0; j < array.length; j++){
            numerator[j] = array[j];
        }

        for(int k = 0; k < numerator.length; k++){
            numerator[k] -= mean;
        }

        for(int m = 0; m < numerator.length; m++){
            numerator[m] = Math.pow(numerator[m], 2);
        }

        double sum = 0;

        for(int n = 0; n < numerator.length; n++){
            sum += numerator[n];
        }

        double underRadical = (sum) / (numerator.length - 1);

        double stDev = Math.sqrt(underRadical);

        return stDev;

    }

    /**Method that takes an inputted array and outputs its median
     *
     * @param array - inputted array
     * @return - outputted median
     */
    public static double median(int[] array){

        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }

        int n = sortedArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (sortedArray[j] > sortedArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }


        boolean isOdd = true;

        if (sortedArray.length % 2 == 0) {
            isOdd = false;
        }

        if(isOdd){
            int medPos = ((sortedArray.length + 1) / 2) - 1;



            double median = sortedArray[medPos];


            return median;

        }
        else{

            double num1 = sortedArray[(sortedArray.length / 2) - 1];
            double num2 = sortedArray[((sortedArray.length / 2) + 1) - 1];

            double median = (num1 + num2) / 2;
            return median;

        }

    }

    /**Method that takes in an array as well as an integer k, and outputs the element of the array such that k elements have greater or equal value
     *
     * @param k - inputted integer k, tells how many elements must be greater than or equal to the output element
     * @param array - inputted array
     * @return - outputted element
     */
    public static int kthLargest(int k, int[] array){

        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }

        int n = sortedArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (sortedArray[j] > sortedArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }

        return sortedArray[sortedArray.length - 1 - k];


    }


}


