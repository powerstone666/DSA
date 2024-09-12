https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

Middle of a Linked List
Difficulty: EasyAccuracy: 57.93%Submissions: 339K+Points: 2
Given the head of a linked list, the task is to find the middle. For example, the middle of 1-> 2->3->4->5 is 3. If there are two middle nodes (even count), return the second middle. For example, middle of 1->2->3->4->5->6 is 4.

Examples:

Input: Linked list: 1->2->3->4->5
Output: 3

Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
Input: Linked list: 2->4->6->7->5->1
Output: 7 

Explanation: The given linked list is 2->4->6->7->5->1 and its middle is 7.

Use Fast and Slow Pointer
  
class Solution {
    int getMiddle(Node head) {
        if(head==null || head.next==null)
          return head.data;
        Node start=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            start=start.next;
            fast=fast.next.next;
        }
        return start.data;
    }
}
