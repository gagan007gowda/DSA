package com.practice.ds.tree.generictree.bst;

import java.util.Objects;

public class Insertion {
    public BSNode insert(BSNode root, Integer value) {
        if (root == null)
            return new BSNode(value);

        if (Objects.equals(root.data, value))
            return root;

        if (root.data > value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

}
