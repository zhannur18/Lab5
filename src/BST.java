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
    // Method to retrieve the value associated with a given key
    public V get(K key) {
        Node node = get(root, key);
        return node == null ? null : node.val;
    }
    // Recursive helper method to retrieve a node with a given key
    private Node get(Node node, K key) {
        if (node == null)
            return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            return get(node.left, key); // Traverse to the left subtree if key is less
        else if (cmp > 0)
            return get(node.right, key); // Traverse to the right subtree if key is greater
        else
            return node;
    }
    // Method to delete a key-value pair from the BST
    public void delete(K key) {
        root = delete(root, key);
    }

}
