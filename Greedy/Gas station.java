class Solution {
   public int canCompleteCircuit(int[] gas, int[] cost) {
	int position=0,pos=0,neg=0;
       int n=gas.length;
       for(int i=0;i<n;i++)
       {
           pos+=gas[i]-cost[i];
           if(pos<0)
           {
              neg+=pos;
               pos=0;
               position=i+1;
           }
       }
       if(pos+neg>=0)
           return position;
       else
           return -1;
}
}
