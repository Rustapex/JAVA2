package day1prac.myarrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] kor = { 90, 80, 55, 78 };
		String[] names = { "장해든", "박세인", "김건희" };

//		왼쪽부터 정렬이 완성됨
		for (int i = 0; i < kor.length; i++) {

			for (int j = 0; j < kor.length; j++) { // 오름차순

//				반드시 임시 변수 필요
				if (kor[i] > kor[j]) {
					int tmp = kor[j];
					kor[j] = kor[i];
					kor[i] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(kor));

		//
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
//				기준			비교
//				문자열.compareTo(문자열)
				if(names[i].compareTo(names[j]) >0) { //기준이 크면 양수, 작으면 음수 반환
					String tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
		
	}

}
