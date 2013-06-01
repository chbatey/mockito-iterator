package com.batey.test.utils;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created with IntelliJ IDEA.
 * User: chbatey
 * Date: 31/05/2013
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class MockIteratorTest {

    @Test
    public void testManyItemsInIterator() {
        //given
        Set<String> mockIterable = mock(Set.class);
        List<String> expectedResultsFromIterator = Arrays.asList("one", "two", "three");
        //when
        MockIterator.mockIterable(mockIterable, "one", "two", "three");
        //then
        List<String> results = new ArrayList<>();
        for (String s : mockIterable) {
            results.add(s);
        }
        assertEquals(expectedResultsFromIterator, results);
    }

    @Test
    public void testSingleItemInIterator() {
        //given
        Set<String> mockIterable = mock(Set.class);
        List<String> expectedResultsFromIterator = Arrays.asList("one");
        //when
        MockIterator.mockIterable(mockIterable, "one");
        //then
        List<String> results = new ArrayList<>();
        for (String s : mockIterable) {
            results.add(s);
        }
        assertEquals(expectedResultsFromIterator, results);
    }

    @Test
    public void testEmtpyIteratorResults() {
        //given
        Set<String> mockIterable = mock(Set.class);
        //when
        MockIterator.mockIterable(mockIterable);
        //then
        List<String> results = new ArrayList<>();
        for (String s : mockIterable) {
            results.add(s);
        }
        assertEquals(Collections.emptyList(), results);
    }

}
