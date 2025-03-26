public class Problem1 {
  public static void main(String[] args){
    int[] a={-1,2,3,3,4,5,-1};
    int n=a.length;
    int range=4;
    if(n<range){
      System.out.println("Array is smaller than range");
      return;
    }
    int lt=0;
    int rt=range-1;
    int sum=0;
    for(int i=lt;i<=rt;i++){
      sum+=a[i];
    }
    int max=sum;
    while(rt<n-1){
      sum-=a[lt];
      lt++;
      rt++;
      sum+=a[rt];
      max=Math.max(max,sum);
    }
    System.out.println("Maximum subarray sum in a given range:"+range+" is "+max);
  }
}
