public class Main {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(1, "One");
        tree.put(2, "Two");
        tree.put(3, "Three");

        for (BST<Integer, String>.Node key : tree) {
            String value = tree.get(key);
            System.out.println("key is " + key + " and value is " + value);
        }

    }
}