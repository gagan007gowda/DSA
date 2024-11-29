package com.practice.ds.tree.generictree.bst;

import java.util.Objects;

public class Search {

    public boolean search(Integer key, BSNode node){
        if(node == null)
            return false;
        if(Objects.equals(node.data, key))
            return true;
        if(key<node.data)
            return search(key,node.left);
        else
            return search(key,node.right);
    }
}
