package com.example.MyWeather.utility;

import java.util.*;

public class WeatherMapper {
    /* base URL of the data */
    static String baseURL = "http://www.bom.gov.au/fwo/IDN60901/IDN60901.";
    /* Hash map to store address and associated URL; */
    static Map<String, String> addressToUrlMapper = new HashMap<>();
    /*Location List */
    static List<String> locationList = new ArrayList<String>(Arrays.asList("Sydney Observatory Hill", "Sydney Airport", "Sydney Harbour", "Sydney Olympic Park", "Badgerys", "Bankstown", "Bellambi", "Camden", "Campbelltown", "Canterbury", "Fort", "Gosford", "Holsworthy", "Holsworthy", "Horsley", "Katoomba", "Kurnell", "Lake", "Little", "Lucas", "Mangrove", "Mount", "Newcastle", "Norah", "North", "Parramatta", "Penrith", "Richmond", "Terrey Hills", "Wattamolla", "Williamtown"));
   /*URL code list */
    static List<Integer> urlList = new ArrayList<Integer>(Arrays.asList(94768, 94767, 95766, 95765, 94752, 94765, 94749, 94755, 94757, 94766, 94769, 94782, 95761, 95684, 94760, 94744, 95756, 95767, 94780, 95757, 95774, 94743, 94774, 95770, 95768, 94764, 94763, 95753, 94759, 95752, 94776));

    /* Methode the URL by location */
    public static String getURLByLocation(String location) {

        return addressToUrlMapper.get(location);
    }

    /*initialize the address to url mapper when the class loads */
    static {
        for (int i = 0; i < locationList.size(); i++) {
            addressToUrlMapper.put(locationList.get(i), baseURL + urlList.get(i) + "." + "json");
        }
    }
    /* Get the location list */
    public static List<String> getLocationList() {
        return locationList;
    }
}
