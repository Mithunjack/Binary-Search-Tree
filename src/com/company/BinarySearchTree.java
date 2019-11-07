package com.company;
public class BinarySearchTree {
    Node root;
        public class Node{
            int value;
            Node left,right;

            Node(int value){
                this.left=this.right=null;
                this.value = value;
            }
        }
        BinarySearchTree(){
            this.root=null;
        }
        public void insert(int value){
            root = insertRec(root,value);
        }

        public Node insertRec(Node root,int value){
            if (root==null){
                root = new Node(value);
                return root;
            }
            else if (value<root.value){
                root.left = insertRec(root.left,value);
            }
            else {
                root.right = insertRec(root.right,value);
            }
            return root;
        }

        public void inorder(){
            inorderRec(root);
        }
        public void inorderRec(Node root){
            if (root!=null){
                inorderRec(root.left);
                System.out.print("Tree Value: "+root.value);
                System.out.println("");
                inorderRec(root.right);
            }
        }

        public void searchValue(int value){
            boolean ischeck = searchValueRec(root,value);
            System.out.println("Searched Value: " + value);
            if (ischeck==true){
                System.out.println("Result : found");
            }
            else {
                System.out.println("Result : Not Found");
            }
        }

        public boolean searchValueRec(Node root,int value){
            boolean found =  false;
            if (root!=null){
                found = searchValueRec(root.left,value);
                if (found==true){
                    return found;
                }
                if (value==root.value){
                    return true;
                }
                found = searchValueRec(root.right,value);
            }
            return found;
        }
}
