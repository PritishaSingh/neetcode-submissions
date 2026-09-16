class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char arr[]=new char[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
         for(int i=0; i<t.length(); i++){
           if(arr[t.charAt(i)-'a']!=0) arr[t.charAt(i)-'a']--;
           else
           arr[t.charAt(i)-'a']++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
