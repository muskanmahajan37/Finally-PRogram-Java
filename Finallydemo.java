class Finallydemo
{
 static void procA()
 {
  try 
  {
   System.out.println("Inside procA");
   throw new RunTimeException("Demo");
  }
  finally
  {
   System.out.println("
  }
 static void procB()
 {
  try
  { 
   System.out.println("Inside procB");
  } 
  finally
  {
   System.out.println("
  }
  static void procC()
 {
  try
  { 
   System.out.println("Inside procC");
  } 
  finally
  {
   System.out.println("
  } 
 public static void main()
 {
  try
  {
   procA();
  }
  catch
  {
   exception e;
   System.out.println("Exception caught");
}
procB();
procC();
}
}

 