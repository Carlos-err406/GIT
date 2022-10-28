import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;
import cu.edu.cujae.ceis.tree.iterators.general.InDepthIterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Direction {
    private GeneralTree<Object> tree;

    public Direction() {
        tree = new GeneralTree<>();
        tree.setRoot(new BinaryTreeNode<Object>(new Faculty()));
    }

    public LinkedList<Brigade> itemA(int student_amount) {
        LinkedList<Brigade> brigades = new LinkedList<>();
        InDepthIterator<Object> i = tree.inDepthIterator();
        BinaryTreeNode<Object> node = i.nextNode();

        while (i.hasNext() && !(node.getInfo() instanceof Student)) {
            Object current = node.getInfo();
            if (current instanceof Brigade && ((Brigade) current).getStudent_list().size() == student_amount)
                brigades.addLast((Brigade) current);
            node = i.nextNode();
        }
        return brigades;
    }

    public ArrayList<Student> itemB(int group) {
        ArrayList<Student> students = new ArrayList<>();
        InDepthIterator<Object> i = tree.inDepthIterator();
        Brigade brigade = null;
        boolean found = false;
        while (i.hasNext()) {
            Object current = i.next();
            if (current instanceof Brigade && ((Brigade) current).getId() == group && !found) {
                brigade = (Brigade) current;
                found = true;
            }
            if (found && i.hasNext()) {
                current = null;
                if (current instanceof Student) {
                }
            }
        }
        return null;
    }
}
