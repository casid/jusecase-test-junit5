package org.jusecase.test.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsecaseExecutorTest extends org.jusecase.test.UsecaseExecutorTest {

    @Override
    protected void assertUsecaseMatches(Class<?> requestClass, Class<?> usecaseClass, Object usecase) {
        assertNotNull(usecase, "No usecase was found for request '" + requestClass.getName() + "'");
        assertEquals(usecaseClass, usecase.getClass());
    }
}
