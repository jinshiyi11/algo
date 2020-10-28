package com.shuai.algo.tree;

import java.util.Stack;

public class InOrderTraversalNoRecursive {
    public static void traversal(Item head) {
        if (head == null) {
            return;
        }
        Stack<Item> stack = new Stack<>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                System.out.println(head.data);
                head = head.right;
            }

        }
    }
}
