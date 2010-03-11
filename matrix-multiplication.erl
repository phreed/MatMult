http://en.wikipedia.org/wiki/Strassen_algorithm

Build all sample sums for each matrix (retain count of summations).
  Only one and two element sums (for this pass)
A11
A11 + A12
A11 + A21
A11 + A22
A12
A12 + A21
A12 + A22
A21
A21 + A22
A22
(n C k = 4 C 2 = 4/2 * 3/1 = 6) + (4 C 1 = 4) = 10

Build all products of these sums (set of M).
(10 C 2 = 10/2 * 9/1 = 45) + (10 C 1 = 10) = 55

Generate all combinations of the products and test against goals.
(55 C 4 = 55/4 * 54/3 * 53/2 * 52/1 = ?) +
(55 C 3 = 55/3 * 54/2 * 53/1 = ?) +
(55 C 2 = 55/2 * 54/1 = ?) +
(55 C 2 = 55/1 = ?) = ?

Generate all combinations of the set producing products.
I do not know.
Run the program and see.

Compute the cost for each of the combinations and sort by cost.

Try again dividing n by 3.


