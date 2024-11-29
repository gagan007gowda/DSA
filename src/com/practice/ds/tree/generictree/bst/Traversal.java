package com.practice.ds.tree.generictree.bst;

public class Traversal {
    public void inOrderTraversal(BSNode node) {
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(" "+node.data);
            inOrderTraversal(node.right);
        }
    }
}