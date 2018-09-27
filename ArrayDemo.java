public class ArrayDemo{
  public static void main(String[] args){
  int[] singleA = new int[7];
  int[][] multiA = new int[8][4];
  printArray(singleA);
  printArray(multiA);
  }
  public static void printArray(int[] ary){
    System.out.print('[');
    for (int pos = 0; pos < ary.length; pos++){
      System.out.print(" " + ary[pos]);
    }
    System.out.print(']');
  }
  public static void printArray(int[][] ary){
    System.out.print('[');
    for(int pos0 =0, pos1 = 0; pos0 <ary.length; pos1++){
      System.out.print(" " + ary[pos0][pos1]);
      if (pos1 >= ary[pos0].length - 1){
        pos1=0;
        pos0++;
      }
    }
    System.out.print(']');
  }

}
