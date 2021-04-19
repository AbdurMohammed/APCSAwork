import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CerealStats {

    public static void main(String[] args) {

        String pathToCSV = "N:\\APCSA Projects\\APLab2\\Cereal.csv";
        String boxName;
        double maxRating; 

        String[][] array = cerealReader(pathToCSV);

        List searchOutput = findMaxValue(array, 14);

        boxName = (String) searchOutput.get(0);
        maxRating = (double) searchOutput.get(1);

        System.out.println("My favorite cereal is " + boxName + ". " +
        "This is because it has the highest rating at " + maxRating + ", meaning it must be the best cereal. Right?");



    }

    public static String[][] cerealReader(String filePath){

        try {
            CSVReader cerealReader = new CSVReader(new FileReader(new File(filePath)));
            List<String[]> list = cerealReader.readAll();

            String[][] cerealArray = new String[list.size()][];
            cerealArray = list.toArray(cerealArray);

            return cerealArray;

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List findMaxValue(String[][] array, int index){

        String currentMaxString;
        double currentMaxNum;
        double maxNum = 0;
        String boxName = null;
        for(int i = 1; i < array.length; i++){

            currentMaxString = array[i][index];
            currentMaxNum = Double.parseDouble(currentMaxString);

            if(currentMaxNum > maxNum){
                maxNum = currentMaxNum;
                boxName = array[i][0];
            }
        }

        List arrayList = new ArrayList();

        arrayList.add(boxName);
        arrayList.add(maxNum);

        return arrayList;
    }

    }

