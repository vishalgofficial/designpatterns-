package tddproblems;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiggerIsGreter {

    public static final String NO_ANSWER = "no answer";

    @Test
    public void getNextLargesWordTest() {
        getNextLargestWord(NO_ANSWER, "");
        getNextLargestWord(NO_ANSWER, "a");
        getNextLargestWord(NO_ANSWER, "aa");
        getNextLargestWord("ba", "ab");
        getNextLargestWord(NO_ANSWER, "aaa");
        getNextLargestWord("acb", "abc");
        getNextLargestWord("bac", "acb");
        getNextLargestWord("baa", "aba");
        getNextLargestWord("cab", "bca");
        getNextLargestWord(NO_ANSWER, "cba");
        getNextLargestWord(NO_ANSWER, "bbbb");
        getNextLargestWord("bcab", "bbca");
        getNextLargestWord("adbc", "acdb");
    }

    private void getNextLargestWord(String expected, String input) {
        assertEquals(expected, getNextLargesWord(input));
    }

    private String getNextLargesWord(String word) {
        List<Character> chars = convertToCharactors(word);
        Pair<Integer, Integer> pair = new Pair<>(Integer.MIN_VALUE, 0);
        for (int biggerLetterIndex = chars.size() - 1; biggerLetterIndex > 0; biggerLetterIndex--) {
            for (int pivot = biggerLetterIndex - 1; pivot >= 0; pivot--) {
                if (chars.get(biggerLetterIndex) > chars.get(pivot)) {
                    if (pair.getKey() < pivot) {
                        pair = new Pair<>(pivot, biggerLetterIndex);
                    }
                }
            }
        }
        if (pair.getKey() != Integer.MAX_VALUE) {
            return getResult(chars,pair.getValue(), pair.getKey());
        } else {
            return NO_ANSWER;
        }
    }

    private String getResult(List<Character> chars, int biggerLetterIndex, int pivot) {
        List<Character> firstPart = chars.subList(0, pivot);
        List<Character> middlePart = chars.subList(pivot, biggerLetterIndex);
        List<Character> lastPart = chars.subList(biggerLetterIndex + 1, chars.size());
        return Stream.of(firstPart.stream(),
                Stream.of(chars.get(biggerLetterIndex)),
                Stream.concat(middlePart.stream(),
                        lastPart.stream()).sorted()
        )
                .flatMap(f -> f.map(String::valueOf))
                .collect(Collectors.joining());
    }

    private List<Character> convertToCharactors(String word) {
        return word.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
    }


}
