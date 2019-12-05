package com.osl.testcuba.web.screens;


public class ParserAutoComplete {

    /**
     * get entity name from current position text
     * @param text text to search
     * @param position position cursor
     * @return entity name found or empty string if not found
     */
    static public String getEntityStatement(String text, int position){
        String ret="";
        int idx$ = text.lastIndexOf("$", position);
        if (idx$>0){
            int idx1 = text.lastIndexOf(" ", idx$);
            int idx2 = text.indexOf(" ", idx$);
            if (idx1>0 && idx2>0)
                ret = text.substring(idx1, idx2).trim();
        }
        return ret;
    }

    /**
     * search an entity string with relative alias into a string
     * @param text string to search
     * @param alias alias entity to find
     * @return entity name found
     */
    static public String findEntity(String text, String alias){
        if (alias==null || alias.isEmpty())
            return "";
        alias = alias.replace(".", "");
        String ret="";
        String []listStrings = text.split(" ");
        for (int i=0; i<listStrings.length; i++){
            if (listStrings[i].indexOf("$")>0 && i+1<listStrings.length && listStrings[i+1].replace(".","").compareTo(alias)==0){
                ret = listStrings[i];
            }
            else if (listStrings[i].indexOf("_")>0 && i+1<listStrings.length && listStrings[i+1].replace(".","").compareTo(alias)==0){
                ret = listStrings[i];
            }
        }

        return ret;
    }

    /**
     * find previous word from position, right to left. word is found searching separators char like space and "'{
     * @param text text to search
     * @param cursorPosition position cursor, index base 1
     * @return word found or empty string if not found
     */
    static public String getPreviousWordFromPosition(String text, int cursorPosition){
        String word="";

        if (cursorPosition<=0)
            return "";
        cursorPosition--;

        String separator=" ", separator1="\"", separator2="{", separator3="'", separator4="\n";
        int idxSeparator = text.lastIndexOf(separator, cursorPosition);
        int idxSeparator1 = text.lastIndexOf("\"", cursorPosition);
        int idxSeparator2 = text.lastIndexOf("{", cursorPosition);
        int idxSeparator3 = text.lastIndexOf("'", cursorPosition);
        int idxSeparator4 = text.lastIndexOf("\n", cursorPosition);
        if (idxSeparator1>idxSeparator){
            idxSeparator = idxSeparator1;
            separator = separator1;
        }
        if (idxSeparator2>idxSeparator) {
            idxSeparator = idxSeparator2;
            separator = separator2;
        }
        if (idxSeparator3>idxSeparator) {
            idxSeparator = idxSeparator3;
            separator = separator3;
        }
        if (idxSeparator4>idxSeparator) {
            idxSeparator = idxSeparator4;
            separator = separator4;
        }

        if (idxSeparator>=0){


            word = text.substring(idxSeparator+1,cursorPosition+1).trim();

            // not found anything, try search previous word
            if (word.isEmpty()){
                word = text.substring(0, idxSeparator).trim();
                idxSeparator = word.lastIndexOf(separator);
                if (idxSeparator>=0)
                    word = word.substring(idxSeparator).trim();
                else
                    word = "";
            }
        }
        else
            return text;
        return word;
    }
}
