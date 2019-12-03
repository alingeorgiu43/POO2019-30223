import java.util.*;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		String text = "Buan dimineata. Sa aveti ore cu folos. " + "Vizita placuta!. Distrati-va!";
		Map<String, Integer> map = new TreeMap<String, Integer>();

		String[] words = text.split("[ \n\t\r.,;:!?(){}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		for (Map.Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey() + "\t" + entry.getValue());
	}
}
