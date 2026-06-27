package WEEK_1.Design_Pattern.Exercise_1_Singleton;

class Main{

    public static void main(String[] args) {
        
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();

        if(l1 == l2){
            System.out.println("There exists only one Logger");
        }else{
            System.out.println("Multiple Logger exists");
        }
    
    }
}