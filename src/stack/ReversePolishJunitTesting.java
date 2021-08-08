package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReversePolishJunitTesting {

    @Test
    public void testingNotation() {

        ReversePolishNotation notation = new ReversePolishNotation();

        String tokens[] ={"2","1","+","3","*"};
        assertEquals("Result", 9, notation.reverseNotation(tokens));

    }

}
