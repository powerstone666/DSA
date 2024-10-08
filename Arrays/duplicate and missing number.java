There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.

This is one of those problems.

Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

Food for thought :

Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4


  import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        int repeated = -1;
        int missing = -1;

        // Step 1: Find the repeated number
        for (int i = 0; i < A.size(); i++) {
            if (seen.contains(A.get(i))) {
                repeated = A.get(i);
                break;
            } else {
                seen.add(A.get(i));
            }
        }

        // Step 2: Find the missing number
        for (int i = 1; i <= A.size(); i++) {
            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }

        // Add the results to the list
        result.add(repeated);
        result.add(missing);

        return result;
    }
}
