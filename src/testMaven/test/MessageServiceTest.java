package testMaven.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import testMaven.main.MessageService;
@DisplayName("I'm a Test Class")
public class MessageServiceTest {
	@Test
	@DisplayName("Test with message, expected ok")
	void testGet() {
		assertEquals("Hello JUnit 5", MessageService.get());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue(MessageService.isOdd(number));
	}
	
	@ParameterizedTest(name = "#{index} - Test with {0} and {1}")
    @MethodSource("argumentProvider")
    void test_method_multi(String str, int length) {
    }

    static Stream<Arguments> argumentProvider() {
        return Stream.of(
                arguments("abc", 3),
                arguments("lemon", 2)
        );
    }

	
}

