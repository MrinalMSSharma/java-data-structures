package org.com.ds.binarytree;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{

        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root, int value){

        if(null == root){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int key){

        if(null == root || key == root.data){
            return root;
        }
        if(key<root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

    }
}