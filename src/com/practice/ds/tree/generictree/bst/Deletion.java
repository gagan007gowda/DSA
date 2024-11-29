package com.practice.ds.tree.generictree.bst;

public class Deletion {
    public BSNode deleteNode(BSNode root, Integer key){
        if (root == null)
            return root;

        if(key < root.data)
            root.left = deleteNode(root.left,key);
        else if (key > root.data)
            root.right = deleteNode(root.right,key);
        else
        {
            if(root.left == null)
                return root.right;

            if(root.right == null)
                return root.left;
        }
        return root;
    }

}
