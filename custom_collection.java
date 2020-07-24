package custom_collection;
import java.util.logging.Logger;

public class custom_list {
	private static  final Logger LOGGER=Logger.getLogger(custom_list.class.getName());
	public static void main(String args[])
	{
		List<Integer> list1=new List<Integer>();
		list1.add_element(11);
		list1.add_element(30);
		list1.add_element(25);
		list1.add_element(87);
		list1.add_element(91);
		list1.add_element(22);
		list1.add_element(85);
		list1.add_element(44);
		list1.add_element(18);
		list1.add_element(27);
		LOGGER.info("ELEMENTS IN THE LIST ARE:");
		for(int i=0;i<list1.sizeoflist();i++)
			LOGGER.info(list1.get_element(i)+" ");
		
		LOGGER.info("REMOVE ELEMENT:" + list1.remove_element(4));
		
	    LOGGER.info("ELEMENT AT INDEX 5:" + list1.get_element(5));
	    LOGGER.info("SIZE OF LIST:" + list1.sizeoflist());
		//System.out.println(list1);
	}
}