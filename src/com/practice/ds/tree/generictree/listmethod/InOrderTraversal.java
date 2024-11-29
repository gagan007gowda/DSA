package com.practice.ds.tree.generictree.listmethod;

public class InOrderTraversal {

    private void inorderTraversal(ListNode listNode) {
        if (listNode == null)
            return;
        int size = listNode.children.size();
        for (int i = 0; i < size - 1; i++)
            inorderTraversal(listNode.children.get(i));

        System.out.print(listNode.data + " ");
        if (!listNode.children.isEmpty())
            inorderTraversal(listNode.children.get(size-1));

    }


    public static void main(String[] args) {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        ListNode root = new ListNode(1);
        root.children.add(new ListNode(2));
        root.children.add(new ListNode(3));
        root.children.add(new ListNode(4));
        root.children.get(0).children.add(new ListNode(5));
        root.children.get(0).children.add(new ListNode(6));
        inOrderTraversal.inorderTraversal(root);

    }
}
