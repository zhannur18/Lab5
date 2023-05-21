import java.util.ArrayList;
import java.util.List;
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
    // Recursive helper method to delete a node with a given key
    private Node delete(Node node, K key) {
        if (node == null)
            return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = delete(node.left, key); // Traverse to the left subtree if key is less
        else if (cmp > 0)
            node.right = delete(node.right, key); // Traverse to the right subtree if key is greater
        else {
            if (node.left == null)
                return node.right; // Replace the node with its right child if left child is null
            else if (node.right == null)
                return node.left; // Replace the node with its left child if right child is null
            else {
                // Replace the node with the minimum node from the right subtree
                Node minNode = findMin(node.right);
                node.key = minNode.key;
                node.val = minNode.val;
                node.right = deleteMin(node.right); // Delete the minimum node from the right subtree
            }
        }

        return node;
    }
    // Method to find the minimum node in a subtree
    private Node findMin(Node node) {
        if (node.left == null)
            return node;
        return findMin(node.left);
    }
    // Method to delete the minimum node from a subtree
    private Node deleteMin(Node node) {
        if (node.left == null)
            return node.right;
        node.left = deleteMin(node.left);
        return node;
    }
    // Method to create an iterable of nodes in the BST using in-order traversal
    public Iterable<Node> iterator() {
        List<Node> nodes = new ArrayList<>();
        inOrderTraversal(root, nodes);
        return nodes;
    }
    // Recursive helper method to perform in-order traversal of the BST
    private void inOrderTraversal(Node node, List<Node> nodes) {
        if (node != null) {
            inOrderTraversal(node.left, nodes); // Traverse the left subtree
            nodes.add(node); // Add the current node to the list
            inOrderTraversal(node.right, nodes); // Traverse the right subtree
        }
    }

}
