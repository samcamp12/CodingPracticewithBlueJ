
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder Rev = new StringBuilder() ;
        Rev.append(valueToBeReversed);
        Rev = Rev.reverse();
        return Rev.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) { 
            ch[i] = word.charAt(i); 
        } 
        int index = (word.length())/2;
        return ch[index];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] ch = new char[value.length()];
        for (int i = 0; i < value.length(); i++) { 
            ch[i] = value.charAt(i); 
        }
        StringBuilder del = new StringBuilder();
        del.append(value);
        for(int i=0; i<value.length();i++ ){
            if(ch[i] == charToRemove){
               del.delete(i,i);
            }
        }
        return del.toString();      
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
    
}
