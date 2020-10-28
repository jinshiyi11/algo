package com.shuai.algo.tree;

import java.util.Stack;

public class PreOrderTraversalNoRecursive {
    public static void traversal(Item head) {
        if (head == null) {
            return;
        }

        Stack<Item> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            head = stack.pop();
            System.out.println(head.data);
            if (head.right != null) {
                stack.push(head.right);
            }
            if (head.left != null) {
                stack.push(head.left);
            }
        }
    }
}
