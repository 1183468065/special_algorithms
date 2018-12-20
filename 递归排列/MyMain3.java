import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MyMain3 {

	public static void main(String[] args) {
		String[] arr1 = { "1", "2" };
		String[] arr2 = { "a", "b" };
		String[] arr3 = { "A", "B" };
		List<String[]> list = new ArrayList<String[]>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		test(list, arr1, "");
	}

	public static void test(List<String[]> list, String[] arr, String str) {
		for (int i = 0; i < list.size(); i++) {
			// 取得当前的数组
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
