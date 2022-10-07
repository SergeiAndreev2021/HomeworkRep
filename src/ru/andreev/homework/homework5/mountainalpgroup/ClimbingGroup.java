package ru.andreev.homework.homework5.mountainalpgroup;

public class ClimbingGroup {
    private boolean complectationIsOn = true;
    private final Alpinist[] alpList = new Alpinist[3];
    private Mountain mountain;
    private int membersCount=0;


    public void addAlpinist(Alpinist alpinist){
           if (membersCount ==3) {
               System.out.println("Alpinist "+alpinist.getName()+" from "+alpinist.getAddress()+" is overall for group");
               complectationIsOn = false;
               return;
           }
           alpList[membersCount] = alpinist;
           membersCount++;
    }
        public void setMountain(Mountain mountain){
        this.mountain = mountain;
        }

       public Mountain getMountain (){
       return mountain;
    }

        public Alpinist[] getAlpList(){
        return alpList;
        }
   }

