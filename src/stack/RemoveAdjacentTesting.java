package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAdjacentTesting {

    @Test
    public void testingAdjacentDuplicate() {

        RemoveAllAdjacentDuplicate removeAllAdjacentDuplicate = new RemoveAllAdjacentDuplicate();
        assertEquals("Result", "ca", removeAllAdjacentDuplicate.removeDuplicate("abbaca"));
        assertEquals("Result", "ay", removeAllAdjacentDuplicate.removeDuplicate("azxxzy"));

    }
}
