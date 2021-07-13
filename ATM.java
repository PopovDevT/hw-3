class ATM{
public int countBanknotes(int sum){
int out = sum/500;
sum-=500*out;
out+= sum/200;
  sum-=200*(sum/200);
  
  out+= sum/100;
  sum-=100*(sum/100);
  
  out+= sum/50;
  sum-=50*(sum/50);
  
  out+= sum/20;
  sum-=20*(sum/20);
  
  out+= sum/10;
  sum-=10*(sum/10);
  
  out+= sum/5;
  sum-=5*(sum/5);
  
  out+= sum/2;
  sum-=2*(sum/2);
  
  out+= sum/1;
  sum-=1*(sum/1);
  return out;
}

}
