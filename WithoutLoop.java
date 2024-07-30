class WithoutLoop
{
    
    public static void recursionLoop(int start, int end){
        if(end < start){
            return;
        }
        System.out.print(start + " ");
        recursionLoop(start + 1, end);
    }
  public void printNos(int N)
    {
        recursionLoop(1, N);
    }
}
