package de.brunel.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lösung zu Coding Task 2
 * Implementieren Sie eine Funktion MERGE die eine Liste von Intervallen entgegennimmt und als
 * Ergebnis wiederum eine Liste von Intervallen zurückgibt. Im Ergebnis sollen alle sich
 * überlappenden Intervalle gemerged sein. Alle nicht überlappenden Intervalle bleiben unberührt.
 **/
class Interval{
    int start, end;

    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
    public String toString(){
        return "["+start+","+end+"]";
    }
}
class Solution{
    public static List<Interval> merge(List<Interval> intervals){
        if(intervals.size()<=1){
            return intervals;
        }
        Collections.sort(intervals, (i1,i2)->Integer.compare(i1.start,i2.start)); //Intervalle nach start-Werten sortieren (O(nlog(n)))

        List<Interval> result = new ArrayList<>();
        Interval current = intervals.get(0);
        result.add(current);
        for(Interval inter: intervals){    // (O(n))
            if(inter.start <= current.end) //Ueberlappende Intervalle, Ende wird angepasst
                current.end= Math.max(current.end, inter.end);
            else{                          // Disjunkte Intervalle, Intervall wird zur ergebnis liste hinzugefuegt
                current = inter;
                result.add(current);
            }
        }
        return result;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Interval> test = new ArrayList<>();
        test.add(new Interval(25,30));
        test.add(new Interval(2,19));
        test.add(new Interval(14,23));
        test.add(new Interval(4,8));

        List<Interval> merged = Solution.merge(test);
        for(Interval inter: merged){
            System.out.print(inter.toString());
        }
    }
}