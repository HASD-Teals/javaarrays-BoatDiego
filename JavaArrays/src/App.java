import java.util.Scanner;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What a Life!");
    }
    
    public static int keyAgetoYear(){
    Scanner cow = new Scanner(System.in);
    
        int keyAge[] = {0,5,10,13,15,16,18,21,30,40,50,55,65,70,100};
        
       return keyAge[2];
    }
    public static void fullReport (int keyAge){
        String keyEvent[] = {"Birth", "Kindergarden" , "Preteen", "Teen","Driving", "Sweet16",
        "High School Gradution", "Adult-All States", "Thirties", "MidLife Crisis", "Fifties", 
        "Early Retirment" , "Retirement", "Federal Retirement", "Centurian", "Historic Power"};

        

    }
    public static String historicalContext(int keyAge){
        String Events[] = {"You're either a dinosaur or a mouse like mammal ","You're really old, you're from the prehistoric age", 
        "Creation of the first civilizations","The Great trade routes of the Silk Road"
        ,"The Mongols conquer everything", "Renaissance age", "Conquest of the Americas", "The great Revolutions(The Americas, France etc.) ","Conquest of Africa"
    , "World War I","Independence of majority of African countries", "World War II", "Cold War","Reached the Moon", "Vietnam war", "U.S.S.R reforms to Russia"
    ,"China Becomes communist", "Covid Pandemic"};
    
    return Events[2];
    }




}
