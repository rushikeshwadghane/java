class Demo{
    int Additon(int i,int j){
        return i+j;
    }
    int Additon(int i,int j,int k)
    {
        return i+j+k;
    }
    int Additon(int i, int j,int k,int l)
    {
        return i+j+k+l;
    }
}
 class Overloading 
 {
  public  static void main(String arg[])
    {
        Demo obj = new Demo();
        int ret;
        ret = obj.Additon(10, 20);
        System.out.println(ret);
        ret = obj.Additon(10, 20,30);
        System.out.println(ret);
        ret = obj.Additon(10, 20,30,40);
        System.out.println(ret);
        
    }
}
