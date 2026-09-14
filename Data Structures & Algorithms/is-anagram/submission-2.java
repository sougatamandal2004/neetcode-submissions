class Solution {
    public boolean isAnagram(String s, String t) {
        // TC -> O(max(s.length(), t.length())), SC -> O(1)
        // int[] freq = new int[26];
        // for(char ch : s.toCharArray()){
        //     freq[ch - 'a']++;
        // }
        // for(char ch : t.toCharArray()){
        //     int x = ch - 'a';
        //     freq[x]--;
        //     if(freq[x] < 0) return false;
        // }
        // for(int i=0;i<26;i++){
        //     if(freq[i] != 0) return false;
        // }
        // return true;

        // Using Map
        // TC -> O(max(s.length(), t.length())), SC -> O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if(map.get(ch) < 0) return false;
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value != 0) return false;
        }
        return true;
    }
}
