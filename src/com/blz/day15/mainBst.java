package com.blz.day15;

public class mainBst {

	public static void main(String[] args) {

		BinaryTree bst = new BinaryTree();
		Node root = null;

		root = bst.insert(root, 56);
		root = bst.insert(root, 30);
		root = bst.insert(root, 70);
		root = bst.insert(root, 22);
		root = bst.insert(root, 40);
		root = bst.insert(root, 60);
		root = bst.insert(root, 95);
		root = bst.insert(root, 11);
		root = bst.insert(root, 65);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 63);
		root = bst.insert(root, 67);

		bst.print(root);

		System.out.println(bst.nodePresent(root, 63));

	}

}
