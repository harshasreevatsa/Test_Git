import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;

public class Test_Node {

	public static void main(String[] args) throws ParseException {
		Node n = new Node();
		
		
		DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date date1 = sdf.parse("10:20:00");
		Date date2 = sdf.parse("11:21:00");
		Double diff = (double) (date2.getTime() - date1.getTime());
		System.out.println((diff/(1000.0*60.0*60.0)));
		//sdf.format(date1)
		Double num = (diff/(1000.0*60.0*60.0));
		System.out.println(num<1);
		int sum = 0;
	    if(num==0)
	    {
	    	System.out.println("in here1");
	        System.out.println("0");
	    }
	    if(num<=1)
	    {
	    	System.out.println("in here2");
	        System.out.println("5");
	    }
	    else
	    {
	       sum = 2 + 3;
	       num = num - 1;
	       int rem = num.intValue();
	 //      System.out.println("rem = "+rem);
	       rem = rem*4;
	//       System.out.println("num = "+num);
	       Double rem1 = (double) rem;
	//       System.out.println(rem1);
	       if(num-num.intValue()>0)
	       {
	           rem = rem + 4;
	       }
	        sum = sum + rem; 
	        System.out.println("sum = "+sum);       
	    }
	//     
    
		for(int i=0;i<10;i++)
		{
			 n.insert(i);
		}
		n.insert(10, 9);
		n.print();
	//	n.head = n.rotate_left(n.head, 2);
	//	System.out.println("");
	//	n.print();
	//	n.reverse();
	//	System.out.println("");
	//	n.print();
	//	n.reverse();
		n.head = n.reverse(3);
		System.out.println("");
		n.print();
	//	n.delete(9,9);
	//	System.out.println("");
	//	n.print();
		n.half_reverse();
		System.out.println("");
		n.print();
		System.out.println("");
		System.out.println("testing nth node from last");
		System.out.println(n.N_Node(5));
	}

}
