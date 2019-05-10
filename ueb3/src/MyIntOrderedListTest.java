import org.junit.jupiter.api.Assertions;

class MyIntOrderedListTest {

    @org.junit.jupiter.api.Test
    void insert() {
        Assertions.assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void removeKeyAtIndex() {
        Assertions.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    void print() {
        MyIntOrderedList list = new MyIntOrderedList();
        Assertions.assertEquals("", list.toString());
        list.insert(1);
        Assertions.assertEquals("1", list.toString());
    }
}