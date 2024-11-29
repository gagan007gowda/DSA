package com.practice.ds.tree.generictree.arraymethod;

public class InorderTraversal {

    private void inOrderTraverse(ArrayNode arrayNode) {
        if(arrayNode == null)
            return;

        int numberOfChildren = arrayNode.children.length;
        for(int i=0;i<numberOfChildren-1;i++)
            inOrderTraverse(arrayNode.children[i]);

        System.out.print(arrayNode.data+" ");

        inOrderTraverse(arrayNode.children[numberOfChildren-1]);
    }

    public static void main(String[] args) {
        ArrayNode root = new ArrayNode(3, 1);
        root.children[0] = new ArrayNode(3, 2);
        root.children[1] = new ArrayNode(3, 3);
        root.children[2] = new ArrayNode(3, 4);
        root.children[0].children[0] = new ArrayNode(3, 5);
        root.children[0].children[1] = new ArrayNode(3, 6);
        root.children[0].children[2] = new ArrayNode(3, 7);
        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.inOrderTraverse(root);
    }
}
