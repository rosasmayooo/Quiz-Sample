
public class QuizSample{
	
    public static void main(String[] args){
    	
        Quiz sample = new Quiz("Sample 1903 Quiz");
        
        sample.addQuestion(new Question("Who is known as the father of Java?", "James Gosling"));
        sample.addQuestion(new Question("Write a statement that assigns the length of a string s to int i", "i = s.length();"));
        sample.addQuestion(new Question("True or false: assigning an int to double is an example of a widening conversion", "true"));
        
        System.out.println(sample);
        
    }
    
}
