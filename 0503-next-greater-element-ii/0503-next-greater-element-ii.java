class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;

            while (!s.isEmpty() && arr[index] > arr[s.peek()]) {
                int top = s.pop();
                result[top] = arr[index];
            }

            if (i < n) {
                s.push(index);
            }
        }

        return result;
    }
}