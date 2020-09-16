package algoexpert;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DiskStacking {
    public static List<Integer[]> diskStacking(List<Integer[]> disks) {
        // Write your code here.
        List<Integer[]> result = new ArrayList<>();
        int[] lengths = new int[disks.size()];
        int[] seqs = new int[disks.size()];
        if ( disks.isEmpty())
            return result;
        Comparator<Integer[]> comparator = (i,j) -> { return i[2] - j [2];};

        disks = disks.stream().sorted(comparator).collect(Collectors.toList());
        lengths[0] = disks.get(0)[2];
        seqs[0] = 0;
        int finalMaxLength = lengths[0];
        int finalSeq = 0;
        int maxLength = lengths[0];
        for ( int i = 0 ; i < disks.size() ; i++){
            seqs[i] = Integer.MIN_VALUE;
        }
        for ( int i = 1 ; i < disks.size() ; i++){
            for (int j = i-1 ; j >= 0 ; j--){
                if (disks.get(j)[0] < disks.get(i)[0] && disks.get(j)[1] < disks.get(i)[1] && disks.get(j)[2] < disks.get(i)[2] ) {
                    lengths[i] = Math.max(lengths[i], disks.get(i)[2] + lengths[j]);
                    if (maxLength < lengths[i]) {
                        maxLength = lengths[i];
                        seqs[i] = j;
                    }
                }else{
                    lengths[i] = Math.max(lengths[i],disks.get(i)[2]);
                    if( maxLength < lengths[i]){
                        maxLength = lengths[i];
                    }
                }
            }
            if ( maxLength > finalMaxLength){
                finalMaxLength = maxLength;
                finalSeq = i;
            }
        }
        while(finalSeq != Integer.MIN_VALUE){
            result.add(0,disks.get(finalSeq));
            finalSeq = seqs[finalSeq];

        }
        return result;
    }
}
