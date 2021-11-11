
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What a Life!");
        final String keyEvent[] = {"Birth", "Kindergarden" , "Preteen", "Teen","Driving", "Sweet16",
            "High School Gradution", "Adult-All States", "Thirties", "MidLife Crisis", "Fifties", 
            "Early Retirment" , "Retirement", "Federal Retirement", "Centurian", "Historic Power"};

            fullReport(keyAgetoYear(), keyEvent);
    }
    
    public static int[] keyAgetoYear(){
        Scanner cow = new Scanner(System.in);
        int SuperDog = cow.nextInt();
        int keyAge[] = {0,5,10,13,15,16,18,21,30,40,50,55,65,70,100};
        cow.close();
        int[] chicken = new int[keyAge.length];
        for(int i = 0; i<keyAge.length;i++ ){
            chicken[i]= SuperDog+keyAge[i];
        }

        
       return chicken;
    }
    public static void fullReport (int[] keyAge, String[] KEE){
       
        for (int i = 0; i<KEE.length;i++){
            System.out.println(keyAge[i]+"\t"+KEE[i]);

        }

    }
    public static String historicalContext(int i, int[] keyAge){
        final String Events[] = {"You're really old, you're from the B.C.E age", 
        "Roman empire falls","The Mongols conquer everything", "Renaissance age", "Conquest of the Americas", "The great Revolutions(The Americas, France etc.) ","Conquest of Africa"
        ,"World War I","Independence of majority of African countries", "World War II", "Cold War","Reached the Moon", "Vietnam war", "U.S.S.R reforms to Russia"
        ,"China Becomes communist", "Covid Pandemic"};       
      int Years[] = {476,1206, 1368, 1400, 1600, 1492, 1776,1825, 1885,    };
       if (){

       }
    


    return ;
    }




}
