package data.structure.integerbinarytree;

class Node {
    int value;
    Node left = null;
    Node right = null;
    public Node(int value) {
        this.value = value;
    }
}


/***
 * Implementation of binary tree data structure.
 * This implementation only stores {@code int} values.
 */
public class IntegerBinaryTree {

        //private modifier ensures that it cannot be changed by user
        private Node root = null;
        private int size = 0;

        public int getSize() {
            return size;
        }

        // this method insert a new node and return true if a new node has successfully inserted in the tree
        public boolean insert(int value) {
            // if the root node is empty
            if (root == null) {
                root = new Node(value);
                size++;
                return true;
            }

            insertRecursive(root, value);
            return false;
        }


        private boolean insertRecursive(Node currentNode, int value) {
            // if the current position is not occupied by a node,
            // insert a new node at this position
            if (currentNode == null) {
                currentNode = new Node(value);
                //after a new node is created, it's gurantted that the size of the tree is increased by 1
                size++;
                return true;
            }

            //ignore duplicate value during insertion
            if (currentNode.value == value) {
                return false;
            }

            //compare the searching value to the current value
            if (value > currentNode.value) {
                insertRecursive(currentNode.right, value);
            } else if (value < currentNode.value) {
                insertRecursive(currentNode.left, value);
            }
            return false;

        }

        //This method checks if a value exists in a tree
        public boolean exists(int value) {
            if (root == null) {
                return false;
            }
            return existsRecursive(root, value);
        }

        private boolean existsRecursive(Node currentNode, int value) {
            if (currentNode == null) {
                return false;
            }
            //if the searched value exists at current position
            if (value == currentNode.value) {
                return true;
            }

            //compare the searched value to the current value and choose a direction to proceed
            if (value > currentNode.value) {
                return existsRecursive(currentNode.right, value);
            } else if (value < currentNode.value) {
                return existsRecursive(currentNode.left, value);
            } else {
                return false;
            }
        }

        public int sum() {
            if (root == null) {
                return 0;
            }
            return sumRecursive(root);
        }

        public int sumRecursive(Node currentNode) {

            if (currentNode == null) {
                return 0;
            }

            //traverse left and right from current node
            int leftSum = sumRecursive(currentNode.left);
            int rightSum = sumRecursive(currentNode.right);

            return  leftSum + rightSum + currentNode.value;
        }
    }

