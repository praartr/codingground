public class HelloWorld{

     public static void main(String []args){
         
         
        FileReader fr = new FileReader("B-small-practice.in");
        BufferedFileReader bf = new BufferedFileReader(fr);
        
        int Testcases;
        if((Testcases =  bf.readLine())!= null){
            int numberOfTestcases = Integer.parseInt(Testcases);
            for (int i=0;i<numberOfTestcases;i++){
                
                String s = bf.readLine();
                StringBuilder sb = new StringBuilder(s);
                sb.
                
            }
        }
        else{
            System.out.println("invalid file");
            return;
        }
     }
}
