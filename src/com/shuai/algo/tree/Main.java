package com.shuai.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        List<Item> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            Item item = new Item();
            item.data = i + 1;
            list.add(item);
        }

        for (int i = 0; i < capacity; i++) {
            Item item = list.get(i);
            int leftIndex = i * 2 + 1;
            int rightIndex = i * 2 + 2;
            if (leftIndex < capacity) {
                item.left = list.get(leftIndex);
            }
            if (rightIndex < capacity) {
                item.right = list.get(rightIndex);
            }
        }

        //PreOrderTraversalNoRecursive.traversal(list.get(0));
        InOrderTraversalNoRecursive.traversal(list.get(0));
    }
}
