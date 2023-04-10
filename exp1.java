class product
{
    String pcode,pname;
        int price;
    public product()
    {

    }
    
public product(String pid,String name,int cost)
{
this.pcode=pid;
this.pname=name;
this.price=cost;
}
public int getprice()
{
    return price;
}
public void display()
{
System.out.println("productcode="+this.pcode);
System.out.println("productname="+this.pname);
System.out.println("price="+this.price);
}
}
public class exp1
{
    public static void main(String[] args)
    {

        product t1=new product("c1235","maruthi",200000);
    
    t1.display();

        product t2=new product("b123","tvs",20000);
    t2.display();

        product t3=new product("c2","bmw",100000);
    t3.display();
    
    product lp=t3.getprice()<(t1.price<t2.price?t1.price:t2.price)?t3:(t1.price<t2.price?t1:t2);
    System.out.println("lowest price");
    lp.display();
   

 product t4=new product();
    t4.pcode="c5";
    t4.pname="iova";
    t4.price=100000;
    t4.display();

    }
 
}