public class StringLoops {
    public StringLoops(){}

    //Already did reverseString()

    public String reverseString2(String origString) {
        String result = "";
        for (int i = 1; i <= origString.length(); i++) {
            result += origString.substring(origString.length() - i, origString.length() - i + 1);
        }
        return result;
    }

    public int countVowels(String origString) {
        int numOfVowels = 0;
        for (int i = 0; i < origString.length(); i++) {
            String character = origString.charAt(i) + "";
            character = character.toLowerCase();
            String vowels = "aeiou";
            if (vowels.indexOf(character) != 1) {
                numOfVowels++;
            }
        }
        return numOfVowels;
    }

    public int countString(String searchString, String origString) {
        int numTimesInString = 0;
        searchString = searchString.toLowerCase();
        origString = origString.toLowerCase();
        for (int i = 0; i < origString.length(); i++) {
            if (i + searchString.length() <= origString.length()) {
                if (origString.substring(i, i + searchString.length()).equals(searchString)) {
                    numTimesInString++;
                }
            }
        }
        return numTimesInString;
    }

    public String removeString(String searchString, String origString) {
        while (origString.contains(searchString)) {
            origString = origString.substring(0, origString.indexOf(searchString)) + origString.substring(origString.indexOf(searchString) + searchString.length());
        }
        return origString;
    }

    public String replaceCharacter(String searchChar, String origString, String replaceChar) {
        for (int i  = 0; i < origString.length(); i++) {
            if ((origString.charAt(i) + "").equals(searchChar)) {
                origString = origString.substring(0, i) + replaceChar + origString.substring(i + 1);
            }
        }
        return origString;
    }
}

