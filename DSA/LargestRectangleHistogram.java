package DSA;

import java.util.Stack;

public class LargestRectangleHistogram{
	public static void main (String args[]){
	int[] heights = {2,1,5,6,2,3};
	System.out.println(largestRectangleArea(heights));
}

public static int largestRectangleArea(int[] heights){
	int maxArea =0;
	int n = heights.length;
	Stack<Integer> stack = new Stack<>();
	
	//Add a Sentinel bar
	int[] newHeights = new int[n+1];

	for(int i = 0;i < n;i++){
	    newHeights[i] = heights[i];
    }
    newHeights[n] = 0;
    for(int i =0; i< n+1; i++){
        while(!stack.isEmpty()&& newHeights[i]<newHeights[stack.peek()]){
            int h = newHeights[stack.pop()];
            int w= stack.isEmpty()?i:i - stack.peek()-1;
            int area = w*h;
            maxArea = Math.max(maxArea, area);
        }
        stack.push(i);
    }
    return maxArea;
    }
}

