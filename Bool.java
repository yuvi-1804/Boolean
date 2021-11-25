class Bool{
    boolean international;//default boolean=false
    int tutionfees=10000;
    int internationalfees =5000;

    void compute(){
        if(international){
            tutionfees =tutionfees+internationalfees;
        }    
        else{
            System.out.println("tutionfees=10000");
        }
        
    }
    public static void main(String args[]){
        Bool b =new Bool();
        b.compute();
    }
}