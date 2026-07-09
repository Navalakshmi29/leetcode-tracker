// Last updated: 08/07/2026, 21:53:12
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()|| c==')' && stack.pop()!='('||c==']' && stack.pop()!='['||c=='}' && stack.pop()!='{'){
                    return false;

                }
            }
        }
        return stack.isEmpty();
        
    }
}