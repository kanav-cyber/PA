class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean alive = true;

            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                int top = st.peek();

                if (Math.abs(top) < Math.abs(curr)) {
                    st.pop();
                }
                else if (Math.abs(top) == Math.abs(curr)) {
                    st.pop();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }
            if (alive) {
                st.push(curr);
            }
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }
}
