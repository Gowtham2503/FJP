public class FrogJumpFRQ
{
  private int goalDistance;
  private int maxHops;
  
  public FrogJumpFRQ(int goalDistance,int maxHops)
  {
    this.goalDistance=goalDistance;
    this.maxHops=maxHops;
  }
  
  public int hopDistance()
  {
	  int answer=(int)(Math.random()*51-10);
	  return answer;
  }
  
  
  public boolean simulate()
  {
	  int position=0;
	  int increment=0;
	  
  	for(int x=1;x<=maxHops;x++)
  	{
  		increment=hopDistance();
  		position+=increment;
  		if(position<0)
  		{
  			return false;
  		}
  		if(position>=goalDistance)
  		{
  			return true;
  		}
  	}
  	return false;
  }
  
  public double runSimulations(int num)
  {
	  int success=0;
	  int fail=0;
	  for(int x=0;x<num;x++)
	  {
		  if(simulate())
		  {
			  success++;
		  }
		  else
		  {
			  fail++;
		  }
	  }
	  return((double)success/num);
  }
}
