package cn.hsw.niuke;

/**
 * @author author: ShuWei Hu, 279577923@qq.com
 * @date createTime��2017��4��6�� ����2:30:02
 * @version 1.0 ���󣺸���һ�Ŷ�������ǰ���������������ؽ�����������ʵ�ֶ�������ǰ���С�����������ʽ
 */
public class BinaryTree {

	public static TreeNode buildTree(int[] preOrder, int[] inOrder) {

		if (inOrder == null || preOrder == null)
			return null;

		TreeNode tree = recreateTree(preOrder, 0, preOrder.length - 1, inOrder,
				0, inOrder.length - 1);

		return tree;

	}

	private static TreeNode recreateTree(int[] preOrder, int preStart,
			int preEnd, int[] inOrder, int inStart, int inEnd) {

		TreeNode tNode = new TreeNode(preOrder[preStart]);
		tNode.left = null;
		tNode.right = null;
		if (preStart == preEnd && inStart == inEnd) {
			return tNode;
		}

		// ��¼���ڵ���������������е�λ��
		int index = 0;

		for (index = inStart; index < inEnd; index++) {
			if (preOrder[preStart] == inOrder[index]) {
				break;
			}
		}

		int leftlength = index - inStart;
		int rigthlength = inEnd - index;

		if (leftlength > 0) {
			tNode.left = recreateTree(preOrder, preStart + 1, preStart
					+ leftlength, inOrder, inStart, index - 1);
		}

		if (rigthlength > 0) {
			tNode.right = recreateTree(preOrder, preStart + 1 + leftlength,
					preEnd, inOrder, index + 1, inEnd);
		}

		return tNode;
	}
	
	public static void postTraverseBinTree(TreeNode node){
		if(node == null)
			return;
		
		if(node.left != null)
			postTraverseBinTree(node.left);
		if(node.right != null)
			postTraverseBinTree(node.right);
		
		System.out.print(node.val +",");
	}

	public static void main(String[] args) {
		
		int[] pre = {1,2,4,5,3,6,7};
		int[] in ={4,2,5,1,6,3,7};
		BinaryTree binaryTree = new BinaryTree();
		TreeNode  tree = binaryTree.buildTree(pre, in);
		postTraverseBinTree(tree);

	}

	private TreeNode tNode;
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
