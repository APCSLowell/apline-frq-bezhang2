public class APLine
{
  public APLine(int a, int b, int c){
    int a = a;
    int b = b;
    int c = c;
  }
  public double getSlope(){
    return (double)-a / b
  }
  public boolean isOnLine(int x, int y){
    if(a*x + b*y + c == 0){
      return true;
    }
    return false;
  }
}
