/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package babeloff.matmult;

/**
 * A product of sums
 * e.g. (a11 - a12)*(b21 + b22)
 *
 * @author phreed
 */
public class ProductOfSums {
    private SumOfTerm _first;
    private SumOfTerm _second;

    int sum_count = 0;

    public static ProductOfSums create(SumOfTerm single) {
        return new ProductOfSums(single, null);
    }

    public static ProductOfSums create(SumOfTerm first, SumOfTerm second) {
        return new ProductOfSums(first, second);
    }

    ProductOfSums(SumOfTerm first, SumOfTerm second) {
        this._first = first;
        this._second = second;  // null allowed
    }
}
