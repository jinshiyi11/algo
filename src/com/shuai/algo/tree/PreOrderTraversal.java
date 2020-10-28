package com.shuai.algo.tree;

public class PreOrderTraversal {
    public static void traversal(Item head) {
        while (head != null) {
            System.out.println(head.data);
            traversal(head.left);
            traversal(head.right);
        }
    }
}
