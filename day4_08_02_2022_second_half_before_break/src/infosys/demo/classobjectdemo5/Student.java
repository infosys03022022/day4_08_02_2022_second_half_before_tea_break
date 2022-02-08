package infosys.demo.classobjectdemo5;
   
     public class Student {
      private int roll;
      private String name;
      private int marks;
     // We have a specific way of writing this setter methods
     // the return type of setter method will be always void
     // setter method starts with the word set followed by the attribute name making the 
     // first character in uppercase
      // parameter type will be same as the type of the attribute for which we are 
      // setting the value
      public void setRoll(int r){
          roll=r;
      }
      // get method starts with get followed by the attribute name as first character in 
      // uppercase
      // return datatype will be same as the type of the attribute for which we are 
      // accessing/reading the value
      public int getRoll(){
        return roll;
      }
      public void setName(String nm){
       name=nm;
      }
      public String getName(){
       return name;
      }
      public void setMarks(int m) {
       marks=m;
      }
      public int getMarks() {
        return marks;
      }
     } 
      

    