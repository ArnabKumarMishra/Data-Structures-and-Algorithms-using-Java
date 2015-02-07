import java.util.*;
public class LinkedList
{
	public static void main(String[] args)
	{
		dListNode newNode1 = new dListNode(10);
		dListNode newNode2 = new dListNode(5);		
		dListNode newNode3 = new dListNode(15);
		dListNode newNode4 = new dListNode(20);

		newNode1.setNext(newNode2);
		newNode2.setNext(newNode3);
		newNode3.setNext(newNode4);
		newNode4.setPrev(newNode3);
		newNode3.setPrev(newNode2);
		newNode2.setPrev(newNode1);

		dListNode headNode = newNode1;
		dListNode currentNode = newNode1;

		while(currentNode != null)
		{
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
}
class dListNode
{
	private int data;
	private dListNode next;
	private dListNode prev;
	public dListNode(int data)
	{
		this.data = data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public int getData()
	{
		return this.data;
	}
	public void setNext(dListNode next)
	{
		this.next = next;
	}
	public dListNode getNext()
	{
		return this.next;
	}
	public void setPrev(dListNode prev)
	{
		this.prev = prev;
	}
	public dListNode getPrev()
	{
		return this.prev;
	}
}