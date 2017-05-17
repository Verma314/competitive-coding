import java.util.Scanner;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class Absolute_List_Sort
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			Absolute_List_Sort llist = new Absolute_List_Sort();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
          
        GfG gfgobj = new GfG(); 
		llist.head = gfgobj.sortedList(llist.head);
		llist.printList(llist.head);
		
			t--;
		}
	}
}


class GfG
{
	Node sortedList(Node head)
	{
		// Your code here
		Node ptr = head;
	
		Node posHead = new Node(-1):
		Node posPtr = posHead;
		
		Node negHead = new Node(-1);
		Node negPtr = negHead;
		
		while ( ptr != null) {
		    if ( ptr.data >= 0 ) {
		        Node x = new Node(ptr.data);
		        posPtr.next = x;
		        posPtr = x;
		    }
		    else {
                negPtr.data = data;
                Node y = new Node(-1);
                y.next = negPtr;
                negPtr = y;
		    }
		}
		negHead.next = posHead.next;
		return (negPtr.next);
	}
}


