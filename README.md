# Lab5
The put() method is used to insert a key-value pair into the binary search tree (BST). It starts by calling the recursive helper method put() with the root node and the given key-value pair. If the node is null, a new node is created with the key and value, and the size is incremented. If the key is less than the current node's key, the method recursively calls put() on the left subtree. If the key is greater, it recursively calls put() on the right subtree. If the key is equal to the current node's key, the value is updated.

The get() method retrieves the value associated with a given key. It calls the recursive helper method get() with the root node and the key. If the node is null, it returns null. If the key is less than the current node's key, the method recursively calls get() on the left subtree. If the key is greater, it recursively calls get() on the right subtree. If the key is equal to the current node's key, it returns the value.

The delete() method removes a key-value pair from the BST. It calls the recursive helper method delete() with the root node and the key to be deleted. If the node is null, it returns null. If the key is less than the current node's key, the method recursively calls delete() on the left subtree. If the key is greater, it recursively calls delete() on the right subtree. If the key is equal to the current node's key, it handles three cases: 1) If the node has no left child, it replaces the node with its right child. 2) If the node has no right child, it replaces the node with its left child. 3) If the node has both left and right children, it finds the minimum node from the right subtree, copies its key and value to the current node, and deletes the minimum node from the right subtree.

The findMin() method finds the minimum node in a given subtree by recursively traversing the left subtree until a node with no left child is found.

The deleteMin() method deletes the minimum node from a given subtree by recursively traversing the left subtree and replacing the node with its right child until a node with no left child is found.

The iterator() method performs in-order traversal of the BST by calling the recursive helper method inOrderTraversal(). It creates a list of nodes and returns it as an Iterable.

The inOrderTraversal() method recursively traverses the BST in in-order fashion (left subtree, current node, right subtree) and adds each node to the provided list.

The size() method returns the number of elements in the BST by returning the value of the size variable.

In the main() class, a BST instance is created, and three key-value pairs are inserted. Then, an enhanced for loop is used to iterate over the BST using the iterator(). Each node's key and value are printed to the console.
