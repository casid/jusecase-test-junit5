package org.jusecase.test.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.jusecase.VoidUsecase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class VoidUsecaseTest<Request> extends org.jusecase.test.VoidUsecaseTest<Request> {
    protected VoidUsecase<Request> usecase;

    @BeforeEach
    @Override
    public void createRequest() {
        super.createRequest();
    }

    protected void whenRequestIsExecuted() {
        usecase.execute(request);
    }

    @Override
    protected void thenErrorIs(Throwable expected) {
        assertEquals(expected, error);
    }

    @Override
    protected void thenErrorIs(Class<? extends Throwable> expected) {
        assertEquals(expected, error.getClass());
    }

    @Override
    protected void thenErrorMessageIs(String expected) {
        assertNotNull(error, "Expected error with message '" + expected + "', but nothing was thrown.");
        assertEquals(expected, error.getMessage());
    }
}
