package com.ATM.akhand.services.dispatcher;

 class DenominationInventory {
    public int twoThousand;
    int fiveHundred;
    int hundred;

    public DenominationInventory(){
        this.fiveHundred=0;
        this.twoThousand=0;
        this.hundred=0;
    }
    public  void updateTwoThousandDenomination(int amt,String action){
        if(action=="Credit"){
            this.twoThousand+=amt;
        }else{
            this.twoThousand-=amt;
        }
    }
    public void updateFiveHundredDenomination(int amt,String action){
        if(action=="Credit"){
            this.twoThousand+=amt;
        }else{
            this.twoThousand-=amt;
        }
    }
    public void updateHundredDenomination(int amt,String action){
        if(action=="Credit"){
            this.twoThousand+=amt;
        }else{
            this.twoThousand-=amt;
        }
    }
}
