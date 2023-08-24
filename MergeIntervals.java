class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));  //sorting according to the startpoint of every interval
        
        Stack<int[]> stack=new Stack();
        stack.push(intervals[0]);   //as stack is empty here

        for(int i=1;i<intervals.length;i++){
            int startpoint2=intervals[i][0];
            int endpoint2=intervals[i][1];

            int[] poparray=stack.pop();
            int startpoint1=poparray[0];
            int endpoint1=poparray[1];

            //1 4
            //2 3  thats why we have to take the maximum endpoint

            int endmax=Math.max(endpoint1,endpoint2);

            if(startpoint2<=endpoint1){
                //If interval is overlapped
                int[] merge=new int[]{startpoint1,endmax};
                stack.add(merge);
            }
            else{
                //if not overlapped add popped array and current array also
                stack.add(poparray);
                stack.add(intervals[i]);
            }
        }
      
        int[][] output=new int[stack.size()][2];  //Adding in reverse order as Stack workds on LIFO
        for(int i=output.length-1;i>=0;i--){
            int[] poparray=stack.pop();
            output[i][0]=poparray[0];
            output[i][1]=poparray[1];   
        }
        return output;

    }
}
