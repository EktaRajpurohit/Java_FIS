package mypackage1;


import java.io.File;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



class Project1{

 // ______________________________________SORT FUNCTION_____________________________________________________
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
                    	System.out.println("List of Files in ascending order: ");
                    	System.out.println("");
                       System.out.println("FILE\t" + " " + file.length() + " bytes\t\t" + file.getName());
                       System.out.println("");
                    }
                 }
              }
            }   
              
                catch (Exception ex1) {
                	
                	System.out.println("!!!!!!!!!!!! INVALID INPUT !!!!!!!!");
                	System.out.println("");
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
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name: ");
 
            // Reading File name
            strName = br.readLine();
            System.out.print("Enter the file path: ");
 
            // Reading File Path
            strPath = br.readLine();
 
            // Creating File Object
            File file1 = new File(strPath + "" + strName);
 
            // Method createNewFile() method creates blank
            // file.
            file1.createNewFile();
            System.out.println("");
            System.out.println("File Created Successfully !!");
            System.out.println("");
        }
 
        // Try-Catch Block
        catch (Exception ex1) {
        	System.out.println("");
        	System.out.println("!!!!!!! UNABLE TO CREATE FILE !!!!");
        	System.out.println("");
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
            System.out.print("Enter the file name:  ");
 
            // Reading File name
            strName = br.readLine();
            System.out.print("Enter the file path: ");
 
            // Reading File Path
            strPath = br.readLine();
 
            // Creating File Object
            File file1 = new File(strPath + "" + strName);
 
            if(file1.exists()){
                file1.delete();
                System.out.println("");
                System.out.println("-----File Successfully deleted----");
            }
            else
            { 
            	System.out.println("");
            	System.out.println("---File does not exists----");   }
        }
 
        // Try-Catch Block
        catch (Exception ex1) {
        	System.out.println("");
        	System.out.println("!!!!! Unable to delete file !!!!");
        	System.out.println("");
        	
        }
    }

    //---------------------DELETE FUNCTION ENDS------------------------------------------------------

    //---------------------SEARCH A FILE------------------------------------------------------------------------------------------

    public static void Search() {

        String strPath = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file path:  ");
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
                     System.out.println("");
                     System.out.println("File Found !!!");
                  }
               }
            }
          }
          catch (Exception ex1) {
        	  
        	  System.out.println("");
        	  System.out.println("SORRY !!! FILE COULD NOT BE LOCATED !!!!");
        	  System.out.println("");
            }
        
        }
//-----------------------------------------SEARCH FILE IN DIRECTORY ENDS-------------------------------- ------------------       



/*__________________________________________________MAIN FUNCTION ______________________________________________________ */


        public static void main(String args[]){
        	
        	System.out.println("");
        	System.out.println("__________________________________WELCOME________________________________");
        	System.out.println("");
        	System.out.println("_____________________________________TO__________________________________");
        	System.out.println("");
        	System.out.println("_________________________________LOCKERME.COM____________________________");
        	System.out.println("");
        	System.out.println("DEVELOPER : EKTA RAJPUROHIT");
        	System.out.println("");
        	System.out.println("--------------------------------------------------------------------------");
        	
        	

        char ch = '\0';
        lp: while(ch != 'E'){
        	System.out.println("");
        	
            System.out.println("----> To sort the files in ascending order, enter 'S' ");
            System.out.println("----> To modify the file, enter 'M' ");
            System.out.println("----> To exit the application, enter 'E' ");

            System.out.println("");
            System.out.print("Enter your choice: ");
            Scanner sc1 = new Scanner(System.in);
            ch = sc1.next().charAt(0);
            
            try {
            switch(ch){

                case 'S': //Sort the files in asc order
                Sort();
                break;

                case 'M':  //Edit the files

                int opt = 0;
                while(opt != 4){

                    System.out.println("----> To add a file, enter 1 ");
                    System.out.println("----> To delete a file, enter 2 ");
                    System.out.println("----> To search a file, enter '3' ");
                    System.out.println("----> To return to main menu, enter '4' ");

                    System.out.println("");
                    System.out.print("Enter your choice: ");
                    Scanner sc2 = new Scanner(System.in);
                    opt = sc2.nextInt();

                    switch(opt){

                        case 1: //Add a file
                        Add();
                        break;

                        case 2: //Delete a file
                        delete();
                        break;

                        case 3:  //Search a file
                        Search();
                        break;

                        case 4: // Return to main menu
                        break;

                        default:
                        System.out.println("__________INVALID INPUT !!!! ________");
                        break;

                    }
                }     

                case 'E': //Close the application
                break;

                default:
                System.out.println("__________INVALID INPUT !!!! ________");
                break;
                }}
             catch(Exception ex1) {
            	 System.out.println("");
            	 System.out.println("!!!!PLEASE ENTER VALID VALUES !!!!!");
            	 System.out.println("");
             }
            }


        }
        
   }





