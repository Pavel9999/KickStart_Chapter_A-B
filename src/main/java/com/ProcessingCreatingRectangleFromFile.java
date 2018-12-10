package com;

import com.entity.Point;
import com.entity.Rectangle;
import com.exception.PointValidatorException;
import com.exception.RectangleValidatorException;
import com.reader.Reader;
import com.validator.PointValidator;
import com.validator.RectangleValidator;
import com.сonverter.PointConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ProcessingCreatingRectangleFromFile {

    private static final Logger logger = LogManager.getLogger(ProcessingCreatingRectangleFromFile.class);

    private final static String PATH = "C:\\io.txt";
    private Reader reader = new Reader();
    private RectangleValidator rectangleValidator = new RectangleValidator();
    private PointValidator pointValidator = new PointValidator();
    private PointConverter pointConverter = new PointConverter();


    public void run() throws IOException, URISyntaxException {

        logger.info("ProcessingCreatingRectangleFromFile");

        List<List<String>> lists = reader.readListLineSplitBySpace(PATH);

        List<Rectangle> rectangles = new ArrayList();


        for (List<String> list :
                lists) {
            try {
                pointValidator.fullValidation(list);
                List<Point> list1 = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    list1.add(pointConverter.convertToPoint(list.get(i), list.get(++i)));
                }
                rectangleValidator.fullValidation(list1);
                rectangles.add(new Rectangle(list1.get(0), list1.get(1), list1.get(2), list1.get(3)));
            } catch (RectangleValidatorException e) {
                logger.error(e.getMessage());
            } catch (PointValidatorException e) {
                logger.error(e.getMessage());
            }
        }
        logger.info("rectangles created  " + rectangles);
        logger.info("finish");


    }
}
