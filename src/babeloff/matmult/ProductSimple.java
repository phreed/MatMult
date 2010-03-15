/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package babeloff.matmult;

/**
 * e.g. a11*b12
 *
 * @author phreed
 */
public class ProductSimple {
    private String _first;
    private String _second;

    private int _coeff;

    int sum_count = 0;

    public static ProductSimple create(String first, String second) {
        return new ProductSimple(first, second);
    }

    public ProductSimple(String first, String second) {
        this._first = first;
        this._second = second;  // null allowed
        this._coeff = 1;
    }
}
