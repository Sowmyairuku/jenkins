Public class TestFactorial{
public statuc void main(String[] args){
  try{
    if(Factorial.compute(5)!=120){
      throw new AssertionError("Test failed for 5");
    } 
    if(Factorial.compute(3)!=6){
      throw new AssertionError("Test failed for 6");
    } 
    if(Factorial.compute(4)!=24){
      throw new AssertionError("Test failed for 4");
    } 
    if(Factorial.compute(6)!=720){
      throw new AssertionError("Test failed for 6");
    }  
    System.out.println("All test cases passed");
  }
  catch(Exception e){
    System.out.println(e.getMessage());
  }
}
}
