/*
public class TextAnalyzer {
    private Map<Character, Integer> characterCountMap;

    public TextAnalyzer(String text) {
        characterCountMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c == '.' || c == ';' || c == ',') {
                characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
            }
        }
    }

    public int getCharacterCount(char c) {
        if (c != '.' && c != ';' && c != ',') {
            return 0;
        }
        return characterCountMap.getOrDefault(c, 0);
    }
    */
