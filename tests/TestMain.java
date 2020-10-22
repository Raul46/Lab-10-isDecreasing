import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestMain {

  @Test
  public void equalTest() {
    assertFalse("Failed on an array where consecutive values are equal.", Main.isDecreasing(new int[] {9,8,7,6,6,5,4,3,3,2,1,0}));
  }

  @Test
  public void increasesTest() {
    assertFalse("Failed on an array where there is an increase.", Main.isDecreasing(new int[] {9,8,7,6,5,6,4,3,4,2,1}));
  }

  @Test
  public void constantlyDecreasingTest() {
    assertTrue("Failed on a constantly decreasing array.", Main.isDecreasing(new int[] {9,8,7,6,5,4,3,2,1,0,-1,-2,-3}));
  }
}