import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BestMovie {

    public static void main(String[] args) {

        String pathToCSV = "N:\\APCSA Projects\\APLab2\\tmdb_5000_movies.csv";
        double moviePopularity;
        String movieName;

        String[][] array = movieReader(pathToCSV);

        List searchOutput = findMaxValue(array, 8);

        movieName = (String) searchOutput.get(0);
        moviePopularity = (double) searchOutput.get(1);

        System.out.println("The most popular movie in this database is: " + movieName + " with a popularity index of: " + moviePopularity);



    }

    public static String[][] movieReader(String filePath){
        try {
            CSVReader movieReader = new CSVReader(new FileReader(new File(filePath)));
            List<String[]> list = movieReader.readAll();

            String[][] movieArray = new String[list.size()][];
            movieArray = list.toArray(movieArray);

            return movieArray;

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return null;



    }

    public static List findMaxValue(String[][] array, int index){

        String currentMaxString;
        double currentMaxNum;
        double maxNum = 0;
        String movieName = null;
        for(int i = 1; i < array.length; i++){

            currentMaxString = array[i][index];
            currentMaxNum = Double.parseDouble(currentMaxString);

            if(currentMaxNum > maxNum){
                maxNum = currentMaxNum;
                movieName = array[i][6];
            }
        }

        List arrayList = new ArrayList();

        arrayList.add(movieName);
        arrayList.add(maxNum);

        return arrayList;
    }

}
