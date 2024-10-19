package org.factoriaf5;

import java.util.List;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class WeekDaysTest 
{   
    WeekDays w;
    
    @Before
    public void setUp()
    {
        w = new WeekDays();
    }
    @Test
    public void testGetList()
    {
        List<String>list=List.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
        assertTrue(list.equals(w.getList()));
    }
    @Test
    public void testToString()
    {
        String s = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
        assertTrue(s.equals(w.toString()));
    }
    @Test
    public void testSize()
    {
        assertTrue(w.size()==7);
    }
    @Test
    public void testRemove()
    {   
        w.remove(1);
        assertTrue(w.getList().equals(List.of("Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")));
    }
    @Test
    public void testGet()
    {   
        assertTrue(w.get(1).equals("Monday"));
    }
    @Test
    public void testContains()
    {   
        assertTrue(w.contains("Monday"));
    }
    @Test
    public void testClear()
    {   
        w.clear();
        assertTrue(w.getList().isEmpty());
    }
    @Test
    public void testSortAlphabetically()
    {   
        w.sortAlphabetically();
        assertTrue(w.getList().equals(List.of("Friday","Monday","Saturday","Sunday","Thursday","Tuesday","Wednesday")));
    }
    
}
