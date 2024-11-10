import java.util.*;
public class time_table {
    public static int i,ch;
    public static boolean val=true;

    public static String RESET ="\u001B[00m";
    public static String RED ="\u001B[31m";
    public static String GREEN ="\u001B[32m";
    public static String YELLOW ="\u001B[33m";

    public static final boolean ENABLE_COLORS=false;

    public static String getColorCode(String color){
        if(!ENABLE_COLORS){
            return "";
        }
        switch(color.toLowerCase()){
            case "red":
                return RED;
            case "green":
                return GREEN;
            case "yellow":
                return YELLOW;
            default:
                return RESET;
        }
    }
    public static String creset = getColorCode("reset");
    public static String cred = getColorCode("red");
    public static String cgreen = getColorCode("green");
    public static String cyellow = getColorCode("yellow");

    public static Scanner sc = new Scanner(System.in);
        public static String[] date = {
            "18-11-2024",
            "18-11-2024",
            "19-11-2024",
            "19-11-2024",
            "20-11-2024",
            "20-11-2024"};

            public static String[] subject = { 
            "Maths - 3",
            "Data Structure",
            "CO&uM",
            "OOPs using Java",
            "Basic Electronic",
            "PPL"
        };
        public static void main (String [] args){
        while(val){
            System.out.println(cred+" ***** TIME TABLE *****"+creset);
            System.out.print(" 1 : Date Wise Timetable\n 2 : Full Timetable \n 3 : Exit \n   : ");
            ch =sc.nextInt();
            switch (ch) {
                case 1:
                    dateWiseTimeTable(val);
                    break;

                case 2:
                    fullTimeTable(val);
                    break;

                    case 3:
                        val =false;
                    break;
            
                default:
                System.out.println("Invalid choice!");
                    break;
            }
        System.out.println(cred+"--------------------------\n"+creset);
            
        }
    }

    public static boolean dateWiseTimeTable(boolean val){
        System.out.println(cred+"--------------------------"+creset);
        System.out.println(cyellow+" ***** DATE WISE TIMETABLE *****"+creset);
        System.out.print(" 1 : 18-11-2024 \n 2 : 19-11-2024 \n 3 : 20-11-2024 \n 4 : Exit \n  : ");
            ch =sc.nextInt();
            switch (ch) {
                case 1:
                    for(i=0;i<subject.length || i<date.length;i++){
                        if(date[i].equals("18-11-2024")){
                            System.out.println(cgreen+" "+(i+1)+" "+date[i]+" : "+subject[i]+" ."+creset);
                        }
                    }    
                break;

                case 2:
                    for(i=0;i<subject.length || i<date.length;i++){
                        if(date[i].equals("19-11-2024")){
                            System.out.println(cgreen+" "+(i+1)+" "+date[i]+" : "+subject[i]+" ."+creset);
                        }
                    } 
                break;

                case 3:
                    for(i=0;i<subject.length || i<date.length;i++){
                            if(date[i].equals("20-11-2024")){
                                System.out.println(cgreen+" "+(i+1)+" "+date[i]+" : "+subject[i]+" ."+creset);
                            }
                    }
                break;

                case 4:
                    val=false;
                break;
            
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            return val;
            
    }

    public static boolean fullTimeTable(boolean val){
        System.out.println(cred+"--------------------------"+creset);
        System.out.println(cyellow+" ***** FULL TIMETABLE *****"+creset);
        for(i=0;i<subject.length || i<date.length;i++){
            System.out.println(cgreen+" "+(i+1)+" "+date[i]+" : "+subject[i]+" ."+creset);
        }
        return val;
    }
}