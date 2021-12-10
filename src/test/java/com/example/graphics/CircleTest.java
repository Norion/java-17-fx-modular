package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle = null;
    @BeforeEach
    public void before (){this.circle = new Circle(2.3, 1.3, 2);}

    @Test
    void computeArea() {
        assertEquals(circle.computeArea(),12.56,0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals(circle.computeCircumference(),12.56,0.01);
    }
}