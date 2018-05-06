package document;



public class MyCustomString {
	private String string;
	public String getString() {
		return string;
		
	}
	public void setString(String string) {
		this.string = string;
	}
    public int countNumbers() {
		if (string == "") return 0;
		int count = 0;
		int i = 0;
		while (i < string.length()) {
			if (!Character.isDigit(string.charAt(i))) {
				i++;
			}
			else {
				count++;
				while (i < string.length() && Character.isDigit(string.charAt(i))) {
					i++;
				}
			}
		}
		return count;
	}
    public String removeEveryNthCharacter(int n, boolean maintainSpacing) {
    	if (n>string.length())
    		throw new IndexOutOfBoundsException();
    	if (n<=0)
    		throw new IllegalArgumentException();
    	StringBuilder sb = new StringBuilder(string);
    	int i = 1;
    	while (n*i <= string.length()) {
    	
    		if (maintainSpacing == false) {
    			sb = sb.deleteCharAt(n*i-i);
    		}
    		else {
    			sb = sb.replace(n*i-1, n*i, " ");
    		}
    		i++;
    		
    	}
    	return sb.toString();
    	
    }
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
    	if (string == null) throw new NullPointerException();
    	if ((startPosition > endPosition) || (endPosition > string.length()))
    		throw new IndexOutOfBoundsException();
    	if (startPosition <= endPosition && startPosition < 1)
    		throw new IllegalArgumentException();
    	String s = "";	
    	StringBuilder sb = new StringBuilder(string);
        for (int i = startPosition; i <= endPosition; i++) {
        	char c = string.charAt(i-1);
        	if (i != startPosition) s = s + "-";
        	if (c == '0') s = s + "zero";
        	if (c == '1') s = s + "one";
        	if (c == '2') s = s + "two";
        	if (c == '3') s = s +"three";
        	if (c == '4') s = s + "four";
        	if (c == '5') s = s + "five";
        	if (c == '6') s = s + "six";
        	if (c == '7') s = s + "seven";
        	if (c == '8') s = s + "eight";
        	if (c == '9') s = s + "nine";
        }
        sb.replace(startPosition-1, endPosition, s);
        string = sb.toString();
    }
    public static void main (String[] args) {
    	MyCustomString test = new MyCustomString();
    	test.setString("1"); 
    	int c = test.countNumbers();
    	System.out.println(c);
    	
    }

}