//package ueb3;

/**
 *
 * @author werner, braun (IFIS)
 */
public class MyIntOrderedList {

    private MyIntListElement head = null;

    public MyIntOrderedList() {
    }

    public void insert(int key) {
        MyIntListElement newElement1 = new MyIntListElement(key, null);
        head = newElement1;
        //newElement1 = new MyIntListElement(key, null);
        // drugi komentar
    }

    public void removeKeyAtIndex(int idx){
        MyIntListElement currentElement = head;
        MyIntListElement lastElement = null;
        for (int i = idx; i > 0; i--) {
            lastElement = currentElement;
            currentElement = currentElement.next;
        }
        lastElement.setNext(currentElement.getNext());
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        MyIntListElement current = head;
        String output = "";
        while (current != null) {
            output += current.toString() + " ";
            current = current.getNext();
        }
        return output;
    }

}
