package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {
    private Rectangular rectangle = null;
    @BeforeEach
    public void before (){this.rectangle = new Rectangular(1.2,4.3,3,4);}

    @Test
    void computeArea() {
        assertEquals(rectangle.computeArea(), 12,0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals(rectangle.computeCircumference(),14,0.01);
    }
}