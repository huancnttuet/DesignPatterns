package StructuralPatterns.Flyweight.forest;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;

import StructuralPatterns.Flyweight.trees.Tree;
import StructuralPatterns.Flyweight.trees.TreeType;

public class ForestNotFlyWeight extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = new TreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
