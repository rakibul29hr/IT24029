import java.util.LinkedList;

public class LinkedListCompare {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Apple");
        list3.add("Banana");

        System.out.println("List1 equals List2? " + areLinkedListsEqual(list1, list2));
        System.out.println("List1 equals List3? " + areLinkedListsEqual(list1, list3));
    }

    public static boolean areLinkedListsEqual(LinkedList<String> l1, LinkedList<String> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }
        for (int i = 0; i < l1.size(); i++) {
            String val1 = l1.get(i);
            String val2 = l2.get(i);
            if (!val1.equals(val2)) {
                return false;
            }
        }
        return true;
    }
}