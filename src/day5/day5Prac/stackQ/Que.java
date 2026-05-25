package day5.day5Prac.stackQ;

import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {

		//
		Queue<String> q = new LinkedList<String>();

		// 데이터 넣기
		q.offer("루시우");
		q.offer("트레이서");
		q.offer("안란");

		// 데이터 꺼내기
		System.out.println(q.poll());

	}

}
