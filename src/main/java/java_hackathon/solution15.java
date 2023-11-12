package java_hackathon;

public class solution15 {
	String inputString = "Hello World Hello Java World";
	String[] words = inputString.split(" ");
	StringBuilder uniqueWords = new StringBuilder();
	for (String word : words) {
	if (!uniqueWords.toString().contains(word)) {
	uniqueWords.append(word).append(" ");
	}
	}
	System.out.println("Unique words in the string:");
	System.out.println(uniqueWords.toString().trim());
}
}
