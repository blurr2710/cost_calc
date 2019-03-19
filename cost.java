package practice;
class Practice
{
//function to add
public static double add(String material,double area,char automated)
{
double total_cost=0.0;
material=material.toLowerCase();
if(material.compareTo("standard")==0)
{
total_cost=1200;
} 
else if(material.compareTo("above standard")==0)
{total_cost=1500;
}
else if(material.compareTo("high standard")==0)
{
total_cost=1800;
if(automated=='y')
{total_cost=2500;}
}
return total_cost*area;
}