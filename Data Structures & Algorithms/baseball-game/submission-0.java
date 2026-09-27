class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st1 = new Stack<>(), st2 = new Stack<>();
        for(String s : operations) {
            if(s.equals("+") || s.equals("C") || s.equals("D")) {
                if(s.equals("+")){
                    int a = st1.peek();
                    st1.pop();
                    st2.push(a);
                    int b = st1.peek();
                    st1.pop();
                    st2.push(b);
                    int sum = a + b;
                    while(!st2.isEmpty()){
                        st1.push(st2.peek());
                        st2.pop();
                    }
                    st1.push(sum);
                }
                else if(s.equals("C")){
                    st1.pop();
                }
                else{
                    int x = st1.peek();
                    st1.push(x*2);
                }
            } else{
                st1.push(Integer.parseInt(s));
            }
        }
        int ans = 0;
        while(!st1.isEmpty()){
            ans += st1.pop();
        }
        return ans;
    }
}