package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createInputsVariable1() {
        String addVariablesTogether = String.valueOf(new AppTest());

        assertNotEquals("99 88 77 66 55 44 33 22 11","99 88 77 66 55 44 33 22 10");
    }

    @Test
    void createInputsVariable2() {
        String addVariablesTogether = String.valueOf(new AppTest());

        assertEquals("98 87 76 65 54 43 32 21 10","98 87 76 65 54 43 32 21 10");
    }

}