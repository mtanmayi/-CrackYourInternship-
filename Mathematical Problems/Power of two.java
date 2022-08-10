class Solution {
    public boolean isPowerOfTwo(int n) {
        return two(n);
    }
    static boolean two( int n ){
        if( n == 1 || n == 2){
            return true;
        }
        if(n < 1){
            return false;
        }
        if( n%2 == 0 ){
            return two(n/2);
        }
        return false;
    }
}
