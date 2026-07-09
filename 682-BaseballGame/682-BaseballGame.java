// Last updated: 08/07/2026, 21:43:35
import java.util.Stack;
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(String op:ops){
            if(op.equals("C")){
                  st.pop();
            }
        
        else if(op.equals("D")){
               st.push(st.peek()*2);
        }
        else if(op.equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
        }
        else{
            st.push(Integer.parseInt(op));
        }
    }
        int sum=0;
        for(int x:st){
            sum+=x;
        }
        return sum;
    }
}