/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package babeloff.matmult;

/**
 * e.g. a11-a21
 *
 * @author phreed
 */
public class SumOfTerm {

    enum Type { DIFF, SUM, SINGLE };

    private String _first;
    private String _second;
    private Type _sign;


    public static SumOfTerm make_sum(String first, String second) {
        return new SumOfTerm(Type.SUM, first, second);
    }

    public static SumOfTerm make_diff(String first, String second) {
        return new SumOfTerm(Type.DIFF, first, second);
    }

    public static SumOfTerm make(String single) {
        return new SumOfTerm(Type.SINGLE, single, null);
    }

    private SumOfTerm(Type sign, String first, String second) {
        this._sign = sign;
        this._first = first;
        this._second = second;  // null allowed
    }
}
