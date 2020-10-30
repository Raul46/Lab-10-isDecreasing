class Main {
  /**
   * Tests a integer array to see if the numbers are constantly decreasing.
   * 
   * @param numArray the array to test
   * @return true if the array constantly decreases, false otherwise
   * */
  public static boolean isDecreasing(int[] numArray){
    if(numArray.length == 1)
    {
      return true;
    }
    for(int i = 0; i < numArray[i + 1])
    {
      return false;
    }
  }
  return true;
  }
  
  public static void main(String[] args) {
    int[] arr = {-99,1,2,3,4,5,6,7,8,9,10,12345};
    System.out.println(isDecreasing(arr));
  }
}
