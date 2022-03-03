package com.twobitjay.p02100;

import com.twobitjay.common.LeetAnnotations;

import java.util.Arrays;

@LeetAnnotations(id=2185,
        name="Counting Words With a Given Prefix",
        url = "https://leetcode.com/problems/counting-words-with-a-given-prefix/")
public class Solution2185 {
    public static void main(String[] args) {
        Solution2185 obj = new Solution2185();
        System.out.println(obj.prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
        System.out.println(obj.prefixCount(new String[]{"leetcode","win","loops","success"}, "code"));
    }

    public int prefixCount(String[] words, String pref) {
        long c = Arrays.stream(words).filter(word -> word.startsWith(pref)).count();
        return (int) c;
    }

    public int prefixCount2(String[] words, String pref) {
        int count = 0;

        for (String word: words) {
            if(word.startsWith(pref))
                count++;
        }

        return count;
    }
}
