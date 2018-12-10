package com;

import com.entity.Point;
import com.entity.Rectangle;
import com.exception.PointValidatorException;
import com.exception.RectangleValidatorException;
import com.validator.PointValidator;
import com.validator.RectangleValidator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Tests {

    @AfterClass
    public void setUp() throws IOException, URISyntaxException {
        new ProcessingCreatingRectangleFromFile().run();
    }

    @Test(expectedExceptions = PointValidatorException.class)
    public void pointValidatorUnSuccessfulTest() {
        new PointValidator().fullValidation(Arrays.asList("-2.0", "-1.z0", "-4.0", "3.0", "4.0", "3.0", "2.0", "-1.0"));
    }

    @Test(expectedExceptions = RectangleValidatorException.class)
    public void RectangleValidatorUnSuccessful() {
        new RectangleValidator().fullValidation(Arrays.asList(new Point(-2.0, -1.0), new Point(-3.0, -1.0), new Point(4.0, 3.0), new Point(2.0, -1.0)));
    }

    @Test
    public void RectanglePerimeterSuccessful() {
        Rectangle rectangle = new Rectangle(new Point(-2.0, -1.0), new Point(-2.0, 3.0), new Point(4.0, 3.0), new Point(4.0, -1.0));
        Assert.assertEquals(rectangle.perimeter(), 20.0);
    }

    @Test
    public void RectangleAreaSuccessful() {
        Rectangle rectangle = new Rectangle(new Point(-2.0, -1.0), new Point(-2.0, 3.0), new Point(4.0, 3.0), new Point(4.0, -1.0));
        Assert.assertEquals(rectangle.area(), 24.0);
    }
}
