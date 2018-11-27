import java.util.ArrayList;
public class ArrayListgithub{
	public static void main(String[]args){
		ArrayList<Integer> list=new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
		ArrayList<Integer> list2=new ArrayList<>();
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			list.add(10);

		System.out.println(list);
	}
	public static ArrayList<Integer> combine(ArrayList<Integer> list, ArrayList<Integer> list2){
		for(int i=0;i<list2.size();i++)
			list.add(list2.get(i));

		return list;
	}
}