package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{
	
	private LinkedList<String> dict;	
	int size=0;
	public DictionaryLL() {
		dict = new LinkedList<String>();
		
	}
	
    // TODO: Add a constructor
    

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	
    	// TODO: Implement this method
    	if (word==null) {
    		return false;
    	}
    	word=word.toLowerCase();
    	
    	if (dict.contains(word)) {
    		return false;
    	}
    	else {
    		dict.add(word);
    		size++;	
    	}
        return true;
        
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
        // TODO: Implement this method
    	
        return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
        //TODO: Implement this method
    	s=s.toLowerCase();
    	return dict.contains(s);
    }

    
}
