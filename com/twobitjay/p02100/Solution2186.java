package com.twobitjay.p02100;


import com.twobitjay.common.LeetAnnotations;

@LeetAnnotations(id=2186,
        name="Minimum Number of Steps to Make Two Strings Anagram II",
        url = "https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii/")
public class Solution2186 {
    public static void main(String[] args) {
        Solution2186 obj = new Solution2186();
        System.out.println(obj.minSteps("leetcode", "cotas"));
        System.out.println(obj.minSteps("night", "thing"));
    }

    public int minSteps(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];

        for(char c: s.toCharArray()) {
            s1[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            t1[c - 'a']++;
        }

        int count = 0;
        for(int i=0; i<26; i++) {
            if(s1[i] != t1[i]) {
                count += Math.abs(s1[i] - t1[i]);
            }
        }

        return count;
    }

}
