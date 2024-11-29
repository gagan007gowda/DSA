package com.practice.ds.tree.generictree.listmethod;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    Integer data;
    List<ListNode> children = new ArrayList<>();

    ListNode(Integer data) {
        this.data = data;
    }
}
