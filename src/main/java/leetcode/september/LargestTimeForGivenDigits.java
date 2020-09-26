package leetcode.september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestTimeForGivenDigits {

    public static String largestTimeFromDigits(int[] arr) {
        List<String> strList = Arrays.stream(arr).mapToObj( i -> new Integer(i).toString()).collect(Collectors.toList());
        strList = getAllCombinations(strList);
        //Comparator<String> comparator = (i,j) ->  strList.get(i) > strList.get(j) ;
        strList = strList.stream().filter(str -> Integer.parseInt(str) < 2359 ).collect(Collectors.toList());
        if( strList.size() == 0){
            return "";
        }
        Integer hrb = -1;
        Integer minb = -1;
        for(String str : strList){
            Integer i = Integer.parseInt(str);
            Integer hr = i/100;
            Integer min = i%100;
            if( hr > 23 || min > 59){
                continue;
            }
            if( hr > hrb){
                hrb = hr;
                minb = min;
            }else if(hr == hrb){
                if(min > minb){
                    minb = min;
                }
            }
        }
        if (hrb == -1 || minb == -1){
            return "";
        }
//        if( hrb == 0){
//            if(minb == 0 ){
//                return "00:00";
//            }else{
//                return "00:"+minb;
//            }
//        }
//        if(minb == 0){
//            return hrb+":00";
//        }
        if( hrb < 10){
            if( minb < 10){
                return "0"+hrb+":0"+minb;
            }
            return "0"+hrb+":"+minb;
        }
        if(minb < 10){
            return hrb+":0"+minb;
        }

        return hrb+":"+minb;
    }

    private static List<String> getAllCombinations(List<String> strList){
        if(strList.size() == 1){
            return strList;
        }
        List<String> retList = new ArrayList<>();
        for(int i = 0 ; i < strList.size() ; i++){
            List<String> t = new ArrayList<>();
            String str = strList.get(i);
            t.addAll(strList.subList(0,i));
            t.addAll(strList.subList(i+1,strList.size()));
            List<String> tempList = getAllCombinations(t);
            for(String s : tempList){
                retList.add(s+str);
            }
            //System.out.println(retList);

        }
        return retList;
    }
}
