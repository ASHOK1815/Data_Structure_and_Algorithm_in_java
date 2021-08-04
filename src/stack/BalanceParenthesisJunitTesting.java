package stack;

import org.junit.Test;
import stack.BalanceParenthesis;

import static org.junit.Assert.assertEquals;

public class BalanceParenthesisJunitTesting {
    @Test
    public void testingBalancedParenthesis() {

        BalanceParenthesis balanceParenthesis = new BalanceParenthesis();

        assertEquals("Result", true, balanceParenthesis.isbalanced("()()"));
        assertEquals("Result", false, balanceParenthesis.isbalanced("()((("));
        assertEquals("Result", false, balanceParenthesis.isbalanced("()))))"));
        assertEquals("Result", true, balanceParenthesis.isbalanced("()()()()()"));
       // assertEquals("Result", false, balanceParenthesis.isbalanced("()()()")); // it showing error as it did not satisfy the condition
    }
}
