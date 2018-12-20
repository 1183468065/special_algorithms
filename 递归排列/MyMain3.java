import java.util.ArrayList;
import java.util.List;

public class MyMain3 {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("1");
		arr1.add("2");
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("a");
		arr2.add("b");
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("B");
		arr3.add("2");
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		test(list, arr1, "");
	}

	public static void test(List<ArrayList<String>> list, ArrayList<String> arr, String str) {
		for (int i = 0; i < list.size(); i++) {
			// 取得当前的list
			if (i == list.indexOf(arr)) {
				// 迭代数组
				for (String st : arr) {
					st = str + st;
					if (i < list.size() - 1) {
						test(list, list.get(i + 1), st);
					} else if (i == list.size() - 1) {
						System.out.println(st);
					}
				}
			}
		}
	}
}
