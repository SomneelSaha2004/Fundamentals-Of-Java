/*
Author:Somneel Saha
A program about my favourite song Godzilla
*/
import java.util.*;
class Song{
  public static void main(String[] args)
  
    {

Map<String,String> map=new HashMap<String,String>();
String[] keys={"Title","Album","Artists","Year of Release","genre","Duration In Seconds","Cool"};
String[] values={"Godzilla","Music To Be Murdered By","Eminem and Juice WRLD","2020","Rap/Hip-Hop","210","yes"};

for(int i=0;i<keys.length;i++)
{
  map.put(keys[i],values[i]);
}
  
for(String key:map.keySet())
{
  System.out.println(key+": "+map.get(key));
}
    }
  
}