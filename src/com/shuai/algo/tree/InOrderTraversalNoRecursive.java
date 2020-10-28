package com.shuai.algo.tree;

import java.util.Stack;

public class InOrderTraversalNoRecursive {
    public static void traversal(Item item) {
        if (item == null) {
            return;
        }
        Stack<Item> stack = new Stack<>();
        stack.push(item);
        while (!stack.isEmpty()) {
            item = stack.pop();
            if (item.right != null) {
                stack.push(item.right);
            }

            if (item.left == null) {
                System.out.println(item.data);
            } else {
                stack.push(item);
                stack.push(item.left);
            }
        }
    }
}
