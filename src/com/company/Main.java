package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(12);
        tree.insert(22);
        tree.insert(20);
        tree.insert(13);
        tree.insert(14);
        tree.insert(16);

        tree.inorder();
        tree.searchValue(16);


    }
}
