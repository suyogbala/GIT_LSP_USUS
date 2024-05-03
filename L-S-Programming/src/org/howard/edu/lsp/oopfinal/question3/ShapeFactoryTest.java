package org.howard.edu.lsp.oopfinal.question3;


import static org.junit.Assert.*;
import org.junit.*;

public class ShapeFactoryTest {

    @Test
    public void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape("rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}
