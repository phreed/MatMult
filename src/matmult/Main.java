/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matmult;

import babeloff.matmult.ProductSimple;
import babeloff.matmult.SumOfTerm;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phreed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // build SumOfTerm's list
        List<String> A_s = new ArrayList<String>();
        A_s.add("a11");
        A_s.add("a12");
        A_s.add("a21");
        A_s.add("a22");

        List<String> B_s = new ArrayList<String>();
        B_s.add("b11");
        B_s.add("b12");
        B_s.add("b21");
        B_s.add("b22");

        List<SumOfTerm> Sum_s = new ArrayList<SumOfTerm>();
        for (String a_i : A_s) {
            Sum_s.add( SumOfTerm.make(a_i) );
        }
        for (String b_i : B_s) {
            Sum_s.add( SumOfTerm.make(b_i) );
        }
        for (String a_i : A_s) {
            for (String b_i : B_s) {
                Sum_s.add( SumOfTerm.make_sum(a_i, b_i) );
                Sum_s.add( SumOfTerm.make_diff(a_i, b_i) );
            }
        }


        // build product of sums
        List<String> C_s = new ArrayList<String>();


    }

}
