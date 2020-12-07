
public class Question {
	
	private String text;
	private String answer;
	
	//Getters and setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//No argument constructor
	public Question() {
	}
	
	//Constructor with 2 parameters
	public Question(String text, String answer) {
		this.text = text;
		this.answer = answer;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Question [text=" + text + "]";
	}
	
}
