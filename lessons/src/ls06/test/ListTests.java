package ls06.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ls06.list.List;
import ls06.list.MyList;

public class ListTests {

    @Test
    public void testSize() {
        MyList<String> my_list = new MyList<String>();

        assertEquals(0, my_list.size());

        my_list.add("A String");

        assertEquals(1, my_list.size());

//        MyList<Integer> my_list2 = new MyList<Integer>();
//        assertEquals(0, my_list2.size());
//        my_list2.add(1);
//        assertEquals(1, my_list2.size());
    }

    @Test
    public void testEmpty() {
        MyList<String> my_list = new MyList<String>();

        assertTrue(my_list.isEmpty());

        my_list.add("A String");

        assertFalse(my_list.isEmpty());
    }

    @Test
    public void testAdd() {
        MyList<String> my_list = new MyList<String>();

        my_list.add("hello");

        assertEquals(1, my_list.size());
        assertTrue(my_list.get(0).equals("hello"));

        my_list.add("world");

        assertEquals(2, my_list.size());
        assertTrue(my_list.get(0).equals("hello"));
        assertTrue(my_list.get(1).equals("world"));
    }
}