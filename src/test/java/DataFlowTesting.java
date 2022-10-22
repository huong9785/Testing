import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataFlowTesting {
    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_DataFlowTesting")
    void test(int a, int b, int c, String expected_output) {
        String actual_output = Triangle.classifyTheTriangle(a, b, c);
        assertEquals(actual_output, expected_output);
    }
}
