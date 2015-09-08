import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {//О(words.length ^ 3)
		// TODO Auto-generated method stub
		String words[] = new String[72200];//О(1)
		int i = 0;//О(1)
		Scanner sc2 = null;//О(1)
		System.out.println("Reading words from file...");//О(1)
		
	    try {
	        sc2 = new Scanner(new File("bg_utf8.txt"));//О(1)
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();//О(1)
	    }
	    
	    while (sc2.hasNextLine()) {//О(number of lines in the text file (this number will equal words.length later in the program))
	            Scanner s2 = new Scanner(sc2.nextLine());//О(1)
	        while (s2.hasNext()) {
	            String s = s2.next();//О(1)
	            words[i] = s;//О(1)
	            i++;//О(1)
	        }
	    }
	    
	    System.out.println("Done.");//О(1)
	    System.out.println("Enter the prefix: ");//О(1)
	    Scanner scanner = new Scanner(System.in);//О(1)
	    String prefix = scanner.nextLine();//О(1)
	    String oldPrefix = "";//О(1)
	    int numOfOccurences = 0;
	    boolean endOfLoop = false;//О(1)
	    
	    while(true)//О(depends on the user. It is up to the user to decide how many times this program will be executed)
	    {
	    	for (int j = -1; j < words.length - 1; j++)//О(words.length)
	    	{	    		
	    		if(endOfLoop)
	    		{
	    			break;//О(1)
	    		}
	    		
				while(words[++j].startsWith(prefix))//О(words.length)
				{
					System.out.println(words[j]);//О(1)
					endOfLoop = true;//О(1)
					numOfOccurences++;
				}
				
				endOfLoop = false;//О(1)					
			}    	
	    	
	    	System.out.println("Do you wish to enter another prefix? (да/не)");//О(1) checking if the program should continue
	    	String confirmAnotherPrefix = scanner.nextLine();//О(1)
	    	
	    	if(confirmAnotherPrefix.equals("не"))//О(1)
	    	{
	    		System.out.println("The program has ended.");//О(1)
	    		break;//О(1)
	    	}
	    	else
	    	{	    		
	    		System.out.println("Enter the new prefix: ");//О(1)
	    		//optimization for decreasing the number of elements we search among:
	    		oldPrefix = prefix;
	    		prefix = scanner.nextLine();//О(1)
	    		
	    		if(prefix.startsWith(oldPrefix))
	    		{
	    			//TODO code if the current prefix starts with the previously called prefix	    			
	    		}
			    
	    		endOfLoop = false;//О(1) if this remains true the while method will not be executedце
	    	}
	    }		    
	}
}
