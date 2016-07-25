import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
         
        try{
         FileReader file = new FileReader("sample.txt");//A-small-practice.in");
         BufferedReader br =  new BufferedReader(file);
         String numberOfTestcases;
         String numberOfPeople;
         if( (numberOfTestcases =  br.readLine()) != null)
         {
             System.out.println("File not null.The number of testcases is " + Integer.parseInt(numberOfTestcases));
         }
         else {
         System.out.println("Invalid file");
         return ;
         }
         int TestCaseIndex = 1;
         while(TestCaseIndex <= Integer.parseInt(numberOfTestcases) )
         {
         if((numberOfPeople = br.readLine()) != null){
             int PeopleCount = Integer.parseInt(numberOfPeople);
             String[] People = new String[PeopleCount];
             int[] numberOfDifferentCharacters= new int[PeopleCount];
             int max=0;
             int CountryLeaderIndex = 0;
            for(int i=0; i<PeopleCount; i++)
            {
                String str = br.readLine();
                People[i] = str;
                 Map<Character, Integer> m = new HashMap<Character,Integer>();
                for(int j=0; j < str.length() ; j++)
                {
                    if(!m.containsKey(str.charAt(j)))
                    {
                        m.put(str.charAt(j),1); 
                        numberOfDifferentCharacters[i]++;
                        
                    }
                    
                        
                }
                if(numberOfDifferentCharacters[i] > max){
                    max = numberOfDifferentCharacters[i];
                    CountryLeaderIndex = i;
                    }
            }
             System.out.println("Case #" + TestCaseIndex + People[CountryLeaderIndex]);
         }
         else {
             System.out.println("Invalid File syntax");
                return ;
             
         }
        
         TestCaseIndex ++;
         }
        }
        catch(Exception e){
        System.out.println(e);
        return ;
        }
       return ;
        
     }
}
