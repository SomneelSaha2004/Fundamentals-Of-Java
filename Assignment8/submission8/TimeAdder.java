package submission8;

class TimeAdder {
    Object[] timeAdder(int val1,String label1,int val2,String label2)
    {
      Boolean b1=false;Boolean b2=false;Object[] arr={b1,b2};
      if(val1<0||val2<0)
      {
        System.out.println("Invalid Input \n This function only accepts positive integer values");return arr;
      }
      label1=label1.toLowerCase().trim();
      label2=label2.toLowerCase().trim();
      switch(label1)
      {
        case "days":
        val1=val1*3600*24;
        break;
        case "day":
        if(val1!=1)
        {
          System.out.println("Invalid Input \n The word day is associated with singular input");return arr;
        }
        val1=3600*24;
        break;
        case "hours":
        val1=val1*3600;
        break;
        case "hour":
        if(val1!=1)
        {
          System.out.println("Invalid Input \n The word hour is associated with singular input");return arr;
        }
        val1=3600;
        break;
        case "minutes":
        val1=val1*60;
        break;
        case "minute":
        if(val1!=1)
        {
          System.out.println("Invalid Input \n The word minute is associated with singular input");return arr;
        }
        val1=60;
        break;
        case "seconds":
        break;
        case "second":
        if(val1!=1)
        {
          System.out.println("Invalid Input \n The word second is associated with singular input");return arr;
        }
        break;
        default:
        System.out.println("The input labels given are either invalid or cannot be handled by this function");
        return arr;
        
      }
      switch(label2)
      {
        case "days":
        val2=val2*3600*24;
        break;
        case "day":
        if(val2!=1)
        {
          System.out.println("Invalid Input \n The word day is associated with singular input");return arr;
        }
        val2=3600*24;
        break;
        case "hours":
        val2=val2*3600;
        break;
        case "hour":
        if(val2!=1)
        {
          System.out.println("Invalid Input \n The word hour is associated with singular input");return arr;
        }
        val2=3600;
        break;
        case "minutes":
        val2=val2*60;
        break;
        case "minute":
        if(val2!=1)
        {
          System.out.println("Invalid Input \n The word minute is associated with singular input");return arr;
        }
        val2=60;
        break;
        case "seconds":
        break;
        case "second":
        if(val2!=1)
        {
          System.out.println("Invalid Input \n The word second is associated with singular input");return arr;
        }
        break;
        default:
        System.out.println("The input labels given are either invalid or cannot be handled by this function");
        break;
      }
      //System.out.println(val1+" "+val2);
      //The above code was required for debugging
      Double val3;String label3;
      if((val1+val2)/(3600*24)>0)
      {
           val3=(double)(val1+val2)/(3600*24);label3="days";
          if(Math.round(val3)==1)
          {
             label3="day";
          }
          
      }
      else if((val1+val2)/3600>0)
      {
        val3=(double)(val1+val2)/3600; label3="hours";
          if(Math.round(val3)==1)
          {
             label3="hour";
          }
           
      }
      else if((val1+val2)/60>0)
      {
        val3=(double)(val1+val2)/60; label3="minutes";
          if(Math.round(val3)==1)
          {
             label3="minute";
          } 
      }
      else
      {
        val3=(double)(val1+val2); label3="seconds";
          if(Math.round(val3)==1)
          {
             label3="second";
          }
      }
      
      arr[0]=val3;arr[1]=label3; 
      return arr;
    }
    // public static void main(String[] args)
    // {
    //   TimeAdder t=new TimeAdder();
    //   Object[] arr=t.timeAdder(5,"days",1,"day");
    //   try{
    //   double d=(Double)arr[0];
    //   String s=(String)arr[1];
    //   System.out.println(Math.round(d)+" "+s);
    //   }
    //   catch(java.lang.ClassCastException e)
    //   {
    //       System.exit(1);
    //   }
    // }
    /*
    The above code can be used for testing.
    Note: To utilize this function a programmer must cast the Object Dataype to the expected objects as an array of different object aray types are required.
    Also to accomodate the invalid input, to return a false boolean value as required again casting is required or Exception Handling*/
  }
