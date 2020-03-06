package epam.epamcollectionstask;
import java.util.*;
public class List1 {
	nodes head,tail;
	<T> List1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 elements:");
		int n;
		int t =10;
		while(t>0)
		{
			
			try {
				n = sc.nextInt();
				insertnode(n);
			} catch (Exception e) {
				T n1;
				n1 = (T) sc.next();
				insertnode(n1);
			}
			
			t--;
		}
		sc.close();
	}
	public <T> void insertnode(T n)  
	{
		nodes nodes= new nodes();
		nodes.next = null;
		nodes.data = n;
		
		if(head==null)
		{
			head = nodes;
			tail = nodes;
		}
		else
		{
			tail.next = nodes;
			tail = tail.next;
		}

	}
	
	public void print() 
	{
		nodes n = head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void  delete(int pos) 
	{
		if(pos==0)
		{
			System.out.println(head.data +" has been deleted from the list");
			head = head.next;
		}
		else {
		nodes n = head,n1 = head;
		int nu = 0;
		while(nu < pos && n!=null)
		{
			n1= n;
			n = n.next;
			nu++;
		}
		if(n==null)
		{
			System.out.println("Postion not present");
		}
		else
		{
			System.out.println(n.data +" has been deleted from the list");
			if(n == tail)
			{
				n1.next = null;
				tail = n1;
			}
			else
			{
				n1.next = n1.next.next;
			}
		}
		}
	}
	public  Object fetch(int pos) 
	{
		if(pos==0)
		{
			return head.data;
		}
		else
		{
			nodes n = head;
			int nu = 0;
			while(nu < pos && n!=null)
			{
				n = n.next;
				nu++;
			}
			if(n ==null)
			{
				return -1;
			}
			else
			{
				return n.data;
			}
		}
	}
}
