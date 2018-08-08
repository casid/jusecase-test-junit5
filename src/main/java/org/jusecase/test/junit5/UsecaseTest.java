package org.jusecase.test.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.jusecase.Usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsecaseTest<Request, Response> extends org.jusecase.test.UsecaseTest<Request, Response> {
    protected Usecase<Request, Response> usecase;
    protected Response response;

    @BeforeEach
    @Override
    public void createRequest() {
        super.createRequest();
    }

    @Override
    protected void thenResponseIs(Response expected) {
        assertEquals(expected, response);
    }

    @Override
    protected void thenResponseIsNotNull() {
        assertNotNull(response);
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
