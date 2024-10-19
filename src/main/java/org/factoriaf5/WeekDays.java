package org.factoriaf5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeekDays 
{   
    private List<String> list;
    
    public WeekDays() {
        this.list = new ArrayList<>(List.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
    }

    public List<String> getList(){
        return list;
    }

    @Override
    public String toString(){
        return String.join(", ", list);
    }

    public int size(){
        return list.size();
    }

    public String remove(int n){
        return list.remove(n-1);
    }

    public String get(int n){
        return list.get(n-1);
    }

    public boolean contains(String s){
        return list.contains(s);
    }

    public void clear(){
        list.clear();
    }

    public void sortAlphabetically(){
        list.sort(Comparator.naturalOrder());
    }


}
