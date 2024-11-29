package com.practice.ds.tree.generictree.bst;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        BSNode root = null;
        for (int i : new int[]{50, 30, 20, 40, 70, 60, 80}) {
            root = insertion.insert(root, i);
        }
        Traversal traversal = new Traversal();
        System.out.print("Inorder tree traversal.");
        traversal.inOrderTraversal(root);
        Search search = new Search();
        System.out.print("\nThe key " + (search.search(110, root) ? " Found" : " Not found"));
        Integer deleteNode = 20;
        System.out.print("Deleting a node: " + deleteNode+"\n");
        Deletion deletion = new Deletion();
        deletion.deleteNode(root, deleteNode);
        traversal.inOrderTraversal(root);
    }
}
