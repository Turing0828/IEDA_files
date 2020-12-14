package LeetCode;
/**
 * @ClassName: Ten
 * @Description: 二分法
 * @author: h_xy
 * @date: 2020/12/14  20:04
 */
public class Ten {
    //给定一个数组A，目标值T，查找T在数组中的位置
    public static void main(String[] args) {
        //先定义数组和目标值
        int[] A  ={1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        //用二分法找出元素
        int mid =FindNum(A,target);
        System.out.println(mid);

    }
    static int FindNum(int[] A,int target){
        int front = 0;
        int rear = A.length -1;
        int mid =0;
        while(front<rear){
        mid = (front+rear)/2;
         if(target<A[mid]){
             rear = mid -1;
         }
         else if(target>A[mid]){
             front = mid +1;
         }
         else{
             return mid;
         }
        }
        return -1;
    }
}
