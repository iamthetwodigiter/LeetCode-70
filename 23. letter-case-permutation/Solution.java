class Solution {
    // Iterative approach using BFS
    // public List<String> letterCasePermutation(String s) {
    //     LinkedList<String> res = new LinkedList<>();
    //     res.add(s);
    //     int n = s.length();

    //     for(int i=n-1; i>-1; i--) {
    //         char c = s.charAt(i);
    //         if(Character.isLetter(c)) {
    //             int size = res.size();
    //             while(size-- > 0) {
    //                 String st = res.poll();
    //                 String left = st.substring(0, i);
    //                 String right = st.substring(i+1, n);

    //                 res.add(left + Character.toLowerCase(c) + right);
    //                 res.add(left + Character.toUpperCase(c) + right);
    //             }
    //         }
    //     }
    //     return res;
    // }

    private void backtrack(char[] chars, int index, List<String> res) {
            // All characters are processed, add the result
            if(index == chars.length) {
                res.add(new String(chars));
                return;
            }

            // Case-I: Keep the current character as is and move forward
            // [Case with a digit]
            backtrack(chars, index+1, res);

            // Case-II: If it's a letter, toggle the case adn branch out
            if(Character.isLetter(chars[index])) {
                // ^32 toggles Upper case and Lower case
                chars[index] ^= 32;
                backtrack(chars, index+1, res);
                // Backtrack: Change it back for the next recursive paths
                chars[index] ^= 32;
            }
        }

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        return res;
    }

}