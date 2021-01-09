package org.pk;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<>();
list.add(23);
list.add(21);
list.stream().forEach((x)->System.out.println(x));
	}

}
