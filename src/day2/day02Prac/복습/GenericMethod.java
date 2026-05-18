package day2.day02Prac.복습;

public class GenericMethod {
	public static void main(String[] args) {
		/*
		 * 1. 제네릭 메서드 만들기 문제 - String[] strings = {"apple", "banana", "orange",
		 * grape", "kiwi"}; - int[] integers = {};
		 */

		int numbers[] = { 10, 20, 30, 40, 50 };
		int index = GenericMethod.findIndex(numbers, 80);
		System.out.println(index);
		
		String[] strings = {"apple", "banana", "orange","grape", "kiwi"};
		int index2 = GenericMethod.findIndex(strings, "watermelon");
		
		double douNumbers[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		
		
		
	}

//	입력 : 배열, 찾고자 하는 내용
//	반환 : 배열 내에서 찾고자 하는 내용의 index 반환, 없으면 -1 반환

	public static int findIndex(int[] arr, int search) {
		int resultIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				resultIdx = i;
				break;
			}
		}
		return resultIdx;
	}

	public static int findIndex(String[] arr, String search) {
		int resultIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(search)) {
				resultIdx = i;
				break;
			}
		}
		return resultIdx;
	}

	public static int findIndex(double[] arr, double search) {
		int resultIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				resultIdx = i;
				break;
			}
		}
		return resultIdx;
	}

}
