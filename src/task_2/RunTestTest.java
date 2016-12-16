package task_2;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunTestTest {

    @Test
    public void test() throws Exception {
        int n1 = 100;
        double eps1 = 0.00011;
        assertThat(96, Is.is(RunTest.getElement(eps1, n1)));
        int n2 = 500;
        double eps2 = 0.000011;
        assertThat(302, Is.is(RunTest.getElement(eps2, n2)));
    }
}