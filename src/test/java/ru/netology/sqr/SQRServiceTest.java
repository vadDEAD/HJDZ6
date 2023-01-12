package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void calcTestFewMatches() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestMinNoMatches() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 11);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTestMaxNoMatches() {
        SQRService service = new SQRService();

        int actual = service.calc(98, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}