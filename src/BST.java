public class BST <K extends Comparable<K>, V>{
    private Node root;
    private class Node {
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }
    public void put(K key, V val) { // Method to insert a key-value pair into the BST
        root = put(root, key, val);
    }
    // Recursive helper method to insert a key-value pair
    private Node put(Node node, K key, V val) {
        if (node == null) {
            size++;
            return new Node(key, val);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = put(node.left, key, val); // Traverse to the left subtree if key is less
        else if (cmp > 0)
            node.right = put(node.right, key, val); // Traverse to the right subtree if key is greater
        else
            node.val = val; // Update the value if key already exists

        return node;
    }

}
