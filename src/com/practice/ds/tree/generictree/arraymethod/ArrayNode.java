package com.practice.ds.tree.generictree.arraymethod;

public class ArrayNode {
    Integer data;
    ArrayNode[] children;

    ArrayNode(Integer size, Integer data) {
        this.data = data;
        children = new ArrayNode[size];
    }
}
