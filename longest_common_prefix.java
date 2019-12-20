/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".\

Example 1:

      Input: ["flower","flow","flight"]
      Output: "fl"
*/

Solution  :-
  Time Complexity :- O(S)
  S is the sum of all characters in a string
 
Code :-

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null||strs.length==0) return "";
        
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        int i=0,len = Math.min(first.length,last.length);
        while(i<len&&first[i]==last[i]) i++;
        
        return strs[0].substring(0,i);
        
    }
}
