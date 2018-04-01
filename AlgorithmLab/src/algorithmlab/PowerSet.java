/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author pigrick
 */
public class PowerSet {
    public static List<Set<Integer>> powerSet(List<Integer> x){
        List<Set<Integer>> p = new ArrayList<Set<Integer>>();
        Set<Integer> s = new HashSet<>();
        p.add(s);
        Set<Integer> t = new HashSet<>();
        while(!x.isEmpty()){
            int f = x.remove(0);
            int psize = p.size();
            for(int i = 0; i < psize; i++){
                t = new HashSet<>();
                t.addAll(p.get(i));
                t.add(f);
                p.add(t);           
            }
            
        }
        return p;
        
    }
    public static void main(String[] args) {
        List<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        List<Set<Integer>> bb = powerSet(aa);
        for(Set<Integer> cc : bb){
    
            for(Integer dd : cc){
                System.out.print(dd + ",");
            }
            System.out.println();
        }
    }
}
