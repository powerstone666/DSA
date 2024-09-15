https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1

Binary Tree to DLL
Difficulty: HardAccuracy: 53.36%Submissions: 146K+Points: 8
Given a Binary Tree (BT), convert it to a Doubly Linked List (DLL) in place. The left and right pointers in nodes will be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be the same as the order of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

Note: h is the tree's height, and this space is used implicitly for the recursion stack.

TreeToList

Examples:

Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3

Explanation: DLL would be 3<=>1<=>2
Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40

Explanation:  DLL would be 40<=>20<=>60<=>10<=>30.


//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    Node head=null,lastNode=null;
    void helper(Node root)
    {
        if(root==null)
        return;
        helper(root.left);
        if(head==null)
        {
          head=root;
        }
        if(lastNode!=null)
        {
            lastNode.right=root;
        }
            root.left=lastNode;
            lastNode=root;
        helper(root.right);
        
    }
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {     
        helper(root);
        return head;
    }
}
