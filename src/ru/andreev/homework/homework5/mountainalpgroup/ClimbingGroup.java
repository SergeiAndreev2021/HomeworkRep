package ru.andreev.homework.homework5.mountainalpgroup;

public class ClimbingGroup {
    private boolean complectationIsOn = true;
    private final Alpinist[] alpList = new Alpinist[3];
    private Mountain mountain;


    public void addAlpinist(Alpinist alpinist){

            for (int i = 0; i <alpList.length ; i++) {
                if (alpList[i]==null){
                    this.alpList[i] = alpinist;
                    return;
                }
            }
        System.out.println("Alpinist "+alpinist.getName()+" from "+alpinist.getAddress()+" is overall for group");

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

