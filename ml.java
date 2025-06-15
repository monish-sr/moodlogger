import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input ip = new input();



        boolean is_running_m = true;
        System.out.println("==================== WELCOME TO MOODLOGGER ====================");
        System.out.println();
        while(is_running_m){
            
            System.out.println("=======================");
            System.out.println();
            System.out.println("MENU");
            System.out.println();
            System.out.println("=======================");
            System.out.print("1. Add an Entry\n2. View all Entries\n3. Save to File\n4. Exit\n-> ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            System.out.println();
            System.out.println("=======================");
            System.out.println();

            

            if(choice == 1){
                boolean is_running = true;
                
                while(is_running){
                    ip.run();
                    while(true){
                        System.out.print("Do you want to Continue (Y/N)?\n->");
                        String yn = sc.next();
                        sc.nextLine(); 
                        System.out.println();
                        System.out.println("=======================");
                        System.out.println();
                        
                        if(yn.equalsIgnoreCase("n")){
                            System.out.println("Thank You!!");
                            is_running=false;
                            break;
                        }
                        else if(!yn.equalsIgnoreCase("n") && !yn.equalsIgnoreCase("y") ){
                            System.out.println("Invalid Option!");
                        }
                        else if(yn.equalsIgnoreCase("y")){
                            break;
                        }
                    }
                    
                }
            }
            else if(choice == 2){
                ip.viewEntries();
            }
            else if(choice == 3){
                ip.savetofile();
            }
            else if(choice == 4){
                System.out.println("Thank You for using MoodLogger!");
                is_running_m = false;
            }
            else{
                System.out.println("Invalid Option!");
            }
        }
    }
    
}

class input{
    Scanner sc = new Scanner(System.in);
    
    ArrayList<String> entries = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

    
    String mood;
    String note;
    int count = 0;
    public void run() {
        LocalDateTime date = LocalDateTime.now();
        String newDateTime = date.format(formatter);
        System.out.println("Today's Date: "+newDateTime);
        System.out.print("Enter your Mood (Happy, Sad, Anger, etc.,): ");
        mood = sc.nextLine();

        System.out.print("Enter your note:\n-> ");
        note = sc.nextLine();
        
        count++;
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        String fullentry = "Entry: "+ count+"\nDateTime: "+newDateTime+"\nMood: "+mood+"\nNote: "+note+"\n";

        entries.add(fullentry);

    }
    public void viewEntries(){
        for(String entry:entries){
            System.out.println();
            System.out.println(entry);
            System.out.println("======================");
        }
        System.out.println("Total Entries: "+getCount());
    }

    public int getCount(){
        return count;
    }

    public void savetofile(){
        try {
            FileWriter writer = new FileWriter ("D:\\moodlogger.txt");

            writer.write("MOODLOGGER\n\n");

            for(String entry:entries){
                writer.write(entry);
                writer.write("\n");
                writer.write("==================\n");
                writer.write("\n");
            }
            writer.close();
            System.out.println();
            System.out.println("✅ Entries saved to moodlogger.txt");

        } catch (Exception e) {
            System.out.println("❌ Error saving to file: " + e.getMessage());
        }
    }
}