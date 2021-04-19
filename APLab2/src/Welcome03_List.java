/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
      ArrayList<WeatherStation> stateStns = new ArrayList<>();

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
            stateStns.add(ws);
         }
      }

      double lowestLat = 1e99;
      double currentLat;
      String lowestLatName = null;
      String lowestLatID = null;

      for(WeatherStation ws : stateStns){
         currentLat = ws.getLat();
         if(currentLat < lowestLat){
            lowestLatName = ws.getName();
            lowestLatID = ws.getId();
         }
      }

      System.out.println("The weather station furthest south in this state is: " + lowestLatID + ": " + lowestLatName);


   }
}