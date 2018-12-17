package com.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {

    private static final Logger logger = LogManager.getLogger( Reader.class);

    public List<List<String>> readListLineSplitBySpace(String path) throws IOException{

        logger.info("start readListLineSplitBySpace");

        List<List<String>> result = new ArrayList();
        Files.lines(Paths.get(path), StandardCharsets.UTF_8)
                .map(line -> line.split("\\s+"))
                .map(Arrays::asList)
                .forEach(l -> result.add(l));

        logger.info("finish readListLineSplitBySpace");
        return result;
    }
}
