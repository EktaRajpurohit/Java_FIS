import java.io.File;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



class Project{

    // ___SORT FUNCTION__________
    public static void Sort() {
      
        String strPath = "";
            
            try{
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Enter the file path:");
         
            // Reading File Path
            strPath = br.readLine();
            
            File dir = new File(strPath);
        
            File[] files = dir.listFiles();
        
            Arrays.sort(files, (f1, f2) -> {
                 return new Long(f1.length()).compareTo(new Long(f2.length()));
              });
        
              for (File file : files) {
                 if (!file.isHidden()) {
                    if (!file.isDirectory()) {
                       System.out.println("FILE\t" + " " + file.length() + " bytes\t\t" + file.getName());
                    }
                 }
            }
              
                catch (Exception ex1) {
                }
        }
    // ------SORT FUNCTION ENDS HERE------------------------------------------------------

    //----------------ADD FUNCTIONS STARTS HERE---------------------------------------------------------------

    // Function To Make New File
    public static void Add()
    {
        String strPath = "", strName = "";
 
        // Try-catch Block
        try {
 
            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
 
            // Reading File name
            strName = br.readLine();
            System.out.println("Enter the file path:");
 
            // Reading File Path
            strPath = br.readLine();
 
            // Creating File Object
            File file1
                = new File(strPath + "" + strName + ".txt");
 
            // Method createNewFile() method creates blank
            // file.
            file1.createNewFile();
        }
 
        // Try-Catch Block
        catch (Exception ex1) {
        }
    }
//----------------------------ADD FUNCTION ENDS HERE--------------------------------------------------------------

//--------------------------DELETE FUNTION STARTS HERE---------------------------------------------------------------

public static void delete()
{
        String strPath = "", strName = "";
 
        // Try-catch Block
        try {
 
            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
 
            // Reading File name
            strName = br.readLine();
            System.out.println("Enter the file path:");
 
            // Reading File Path
            strPath = br.readLine();
 
            // Creating File Object
            File file1 = new File(strPath + "" + strName + ".txt");
 
            if(file1.exists()){
                file1.delete();
                System.out.println("-----File Successfully deleted----");
            }
            else
                System.out.println("---File does not exists----");   
        }
 
        // Try-Catch Block
        catch (Exception ex1) {
        }
    }

    //---------------------DELETE FUNCTION ENDS------------------------------------------------------

    //---------------------SEARCH A FILE------------------------------------------------------------------------------------------

    public static void Search() {

        String strPath = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file path:");
            // Reading File Path
            strPath = br.readLine();
         
        
        
            File dir = new File(strPath);
        
            File[] files = dir.listFiles();
        
            Arrays.sort(files, (f1, f2) -> {
               return new Long(f1.length()).compareTo(new Long(f2.length()));
            });
        
            for (File file : files) {
               if (!file.isHidden()) {
                  if (!file.isDirectory()) {
                     System.out.println("FILE\t" + " " + file.length() + " bytes\t\t" + file.getName());
                  }
               }
            }
          }
          catch (Exception ex1) {
            }
        
        }
//-----------------------------------------SEARCH FILE IN DIRECTORY ENDS-------------------------------- ------------------       



/*__________________________________________________MAIN FUNCTION ______________________________________________________ */


        public static void main(String args[]){

        char ch = '\0';
        lp: while(ch != 'C'){
            System.out.println("----> To sort the files in ascending order, enter 'A' ");
            System.out.println("----> To make any changes to the file, enter 'B' ");
            System.out.println("----> To close the application, enter 'C' ");

            System.out.println("");
            System.out.print("Enter your choice: ");
            Scanner sc1 = new Scanner(System.in);
            ch = sc.next().charAt(0);

            switch(ch){

                case 'A': //Sort the files in asc order
                Sort();
                break;

                case 'B':  //Edit the files

                int opt = 0;
                while(opt != 4){

                    System.out.println("----> To add a file, enter 1 ");
                    System.out.println("----> To delete a file, enter 2 ");
                    System.out.println("----> To search a file, enter '3' ");
                    System.out.println("----> To return to main menu, enter '4' ");

                    System.out.println("");
                    System.out.print("Enter your choice: ");
                    Scanner sc2 = new Scanner(System.in);
                    opt = sc.nextInt();

                    switch(opt){

                        case 1: //Add a file
                        Add();
                        break;

                        case 2: //Delete a file
                        delete();
                        break;

                        case 3:  //Search a file
                        search();
                        break;

                        case 4: // Return to main menu
                        break;

                        default:
                        System.out.println("__________INVALID INPUT !!!! ________");
                        break;

                    }

                case 'C': //Close the application
                break;

                default:
                System.out.println("__________INVALID INPUT !!!! ________");
                break;
                }
            }


        }


    }


}