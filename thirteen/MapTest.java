package thirteen;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> list = new HashMap<String, String>();
		
		list.put("100", "홍길동");
		list.put("200", "김유신");
		list.put("300", "김철수");
		
		// 모든 항목을 출력한다.
		System.out.println(list);
		
		// 하나의 항목을 삭제한다.
		list.remove("200");
		
		// 하나의 항목을 대치한다.
		list.put("100", "최지영");
		
		// 값을 참조한다.
		System.out.println(list.get("300"));
		
		// 모든 항목을 방문한다.
		for(String key : list.keySet())
		{
			String value = list.get(key);
			System.out.println("key=" + key + ", value=" + value);
		}
	}

}
