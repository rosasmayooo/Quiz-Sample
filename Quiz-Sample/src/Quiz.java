import java.util.ArrayList;
import java.util.List;

public class Quiz {

	private String name;
	private List<Question> questions;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	//No argument constructor
	public Quiz() {
	}
	
	//Constructor with 2 parameters
	public Quiz(String name) {
		this.name = name;
		this.questions = new ArrayList();
	}
	
	public void addQuestion(Question question) {
		questions.add(question);
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Quiz [name=" + name + ", questions=" + questions + "]";
	}
	
}
