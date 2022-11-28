import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

class checkA implements StringChecker {
  public boolean checkString(String s) {
    if(s.contains("A")){
      return true;
    }  
    return false;
  }
}

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter(){
    StringChecker sc = new checkA();

    List<String> input1 = new ArrayList<>();
    List<String> result = new ArrayList<>();

    input1.add("TOYOTA");
    input1.add("HONDA");
    input1.add("NISSAN");
    input1.add("MITSUBISHI");

    result.add("TOYOTA");
    result.add("HONDA");
    result.add("NISSAN");

    //assertArrayEquals(result.toArray(), ListExamples.filter(input1, sc).toArray());
    assertEquals(result, ListExamples.filter(input1, sc));
  }

  @Test
  public void testMerge(){
    List<String> input1 = new ArrayList<>();
    List<String> input2 = new ArrayList<>();
    List<String> result = new ArrayList<>();

    input1.add("ALPHA");
    input1.add("CHARLIE");
    input1.add("ECHO");
    input1.add("GOLF");

    input2.add("BRAVO");
    input2.add("DELTA");
    input2.add("FOXTROT");
    input2.add("HOTEL");

    result.add("ALPHA");
    result.add("BRAVO");
    result.add("CHARLIE");
    result.add("DELTA");
    result.add("ECHO");
    result.add("FOXTROT");
    result.add("GOLF");
    result.add("HOTEL");
    
    assertEquals(result, ListExamples.merge(input1, input2));
  }

}
