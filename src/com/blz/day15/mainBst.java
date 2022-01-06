package com.blz.day15;

public class mainBst {

	public static void main(String[] args) {

		BinaryTree bst = new BinaryTree();
		Node root = null;

		root = bst.insert(root, 56);

		root = bst.insert(root, 30);

		// 30->56->70->80
		root = bst.insert(root, 70);

		bst.print(root);

	}

}
