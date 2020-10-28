package com.shuai.algo.tree;

import java.util.Stack;

public class PreOrderTraversalNoRecursive {
    public static void traversal(Item head) {
        if (head == null) {
            return;
        }

        Stack<Item> stack = new Stack<>();
        stack.push(head);
        Item item = stack.pop();
        while (item != null) {
            System.out.println(head.data);
            if (item.right != null) {
                stack.push(item.right);
            }
            if (item.left != null) {
                stack.push(item.left);
            }

            if (!stack.empty()) {
                item = stack.pop();
            }
        }
    }
}
