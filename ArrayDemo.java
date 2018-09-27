public class ArrayDemo{
  public static void main(String[] args){
  int[] singleA = new int[7];
  int[][] multiA = new int[8][4];
  printArray(singleA);
  printArray(multiA);
  System.out.println(countZero(multiA));
  fill2D(multiA);
  printArray(multiA);
  int[][] multiB = new int[5][2];
  printArray(fill2DCopy(multiB));
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
    for(int pos0 =0; pos0 <ary.length; pos0++){
      System.out.print('[');
      for(int pos1 = 0 ; pos1 < ary[pos0].length;pos1++){
        System.out.print(ary[pos0][pos1] + " ");
      }
      System.out.print(']');
    }
    System.out.print(']');
  }
  public static int countZero(int[][] nums){
    int count = 0;
    for(int pos0 =0; pos0 < nums.length; pos0++){
      for(int pos1 = 0 ; pos1 < nums[pos0].length;pos1++){
        if (nums[pos0][pos1] == 0){
          count++;
        }
      }
    }
  return count;
  }
  public static void fill2D(int[][] vals){
    for(int pos0 = 0 ; pos0 < vals.length; pos0++){
      for(int pos1 = 0 ; pos1 < vals[pos0].length; pos1++){
        if (pos0 == pos1){vals[pos0][pos1] = 3;}
        else { vals[pos0][pos1] = 1;}
      }
    }
  }
  public static int[][] fill2DCopy(int[][] vals){
    int[][] result = new int[vals.length][];
    for(int pos0 = 0 ; pos0 < vals.length; pos0++){
      result[pos0] = new int[vals[0].length];
      for(int pos1 = 0 ; pos1 < vals[pos0].length; pos1++){
        if (pos0 == pos1){result[pos0][pos1] = 3;}
        else { result[pos0][pos1] = 1;}
      }
    }
    return result;
  }

}
