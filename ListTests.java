import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class CheckString implements StringChecker{
    @Override
    public boolean checkString(String s) {
        if (s.equals("1") || s.equals("2")) {
          return true;
        }
        return false;
    }
  }

public class ListTests {
    @Test 
	public void testFilter1() {
        CheckString sc = new CheckString();
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("1");
        expectedList.add("2");

        assertEquals(expectedList, ListExamples.filter(list, sc));
	}

    @Test
    public void testMerge1() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("b");
        list1.add("c");

        list2.add("a");
        list2.add("d");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("b");
        expectedList.add("c");
        expectedList.add("d");

        assertEquals(expectedList, ListExamples.merge(list1, list2));
    }

}
