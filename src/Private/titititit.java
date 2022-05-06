package Private;

public class titititit {
	public String doubleChar(String str) {
		  String result = "";
		  str = "abc";
		  for (int i = 0; i < str.length(); i++) {
		    result = result + str.charAt(i) + str.charAt(i);
		  }
		  return result;
		} // doubleChar("The") → "TThhee"
}
