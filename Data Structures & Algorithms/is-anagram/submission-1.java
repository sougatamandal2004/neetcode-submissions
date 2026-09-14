class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            int x = ch - 'a';
            freq[x]--;
            if(freq[x] < 0) return false;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}
