package daria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CandyBox {
	private int countSugar = 0;
	private int boxWeight = 0;
	private ArrayList<Candy> candybox = new ArrayList<Candy>();

	public void AddCandy(Candy c) {
		candybox.add(c);
		countSugar += c.getSugar();
		boxWeight += c.getWeight();
	}

	public void RemoveCandy(String name) {
		Candy del=null;
		for (Candy d : candybox)
			if (d.getName() == name) {
				countSugar -= d.getSugar();
				boxWeight -= d.getWeight();
				del = d;
			}
		if(del!=null)
			candybox.remove(del);
	}
	
	public void SortBySugar() {
		Collections.sort(candybox, (Candy o1, Candy o2)->o1.getSugar() - o2.getSugar());
	}
	
	public List<Candy> SugarAvarage(int start,int end){
		return candybox.stream()
			.filter(candy->(candy.getSugar()>=start && candy.getSugar()<=end)).collect(Collectors.toList());
	}

	public int AllSugarInBox(){
			return countSugar;
		}
	
	public int AllWeightInBox() {
		return boxWeight;
	}


	}
	
	

