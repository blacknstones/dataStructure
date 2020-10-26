package data.structure.integerbinarytree;
import data.structure.integerbinarytree.IntegerBinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class IntegerBinaryTreeTest {

    @Test
    public void emptytreeHasSizeZero() {
        IntegerBinaryTree tree = new IntegerBinaryTree();

        assertEquals(0, tree.getSize());
    }

    @Test
    public void treeWithOneValueHasSizeOne() {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert(2);

        assertEquals(1, tree.getSize());
    }
    @Test
    public void treeWithThreeValuesHasSizeThree() {
        IntegerBinaryTree tree = new IntegerBinaryTree();

        tree.insert(2);
        tree.insert(-5);
        tree.insert(15);

        assertEquals(3, tree.getSize());
    }

    @Test
    public void treeReturnsTrueWhenExists() {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert(7);
        tree.insert(3);
        tree.insert(25);

        assertEquals(true, tree.exists(7));
    }

    @Test
    public void treeReturnsFalseWhenNotExists() {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert(25);
        tree.insert(51);
        tree.insert(92);

        assertEquals(false, tree.exists(5));
    }


    @Test
    public void  treeSumReturnsCorrectSum() {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert( 5);
        tree.insert(7);
        tree.insert(1);
        tree.insert(8);

        assertEquals(21, tree.sum());
    }

}

