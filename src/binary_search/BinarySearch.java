package src.binary_search;

import java.util.List;

public class BinarySearch {

    public static int searchNumber(List<Integer> data, int myNumber){
        int index = (data.size() - 1) / 2;
        int foundNumber = data.get(index);

        if(foundNumber < myNumber){
            List<Integer> newData = data.subList(data.indexOf(foundNumber), data.size());

            return searchNumber(newData, myNumber);
        }
        else if(foundNumber > myNumber){
            List<Integer> newData = data.subList(0, data.indexOf(foundNumber));

            return searchNumber(newData, myNumber);
        }
        else{
            return foundNumber;
        }
    }
}
