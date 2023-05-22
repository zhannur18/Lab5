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

        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(2, "Two");
        bst.put(4, "Four");
        bst.put(6, "Six");
        bst.put(8, "Eight");

        int treeSize = bst.levelTree();
        System.out.println("Size of the tree: " + treeSize);


    }}