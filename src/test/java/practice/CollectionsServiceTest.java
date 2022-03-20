package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.Utils.getMethodName;
import static utils.Utils.print;

class CollectionsServiceTest {

    @Test
    void test_dummyTest() {
        print("Running " + getMethodName() + "()...");
        assertEquals(true,true);
    }

    @Test
    void test_arrayListTest1() {
        print("Running " + getMethodName() + "()...");
        CollectionsService cs = new CollectionsService();
        print(cs.getExampleArrayList().isEmpty() == true ? "ArrayList is empty" : "ArrayList has content");
        cs.getExampleArrayList().add("Hello");
        print(cs.getExampleArrayList().get(0));
    }

}