class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('{' ,'}');
        pairs.put('(' ,')');
        pairs.put('[' ,']');

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } 
                char latestBracket = stack.pop();
                if (pairs.get(latestBracket) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
