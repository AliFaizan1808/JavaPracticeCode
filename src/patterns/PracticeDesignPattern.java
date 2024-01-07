package patterns;

public class PracticeDesignPattern {
	
	
	

}







interface AIApplication{
	
	void answerQuestion();
	
}

class OpenAI implements AIApplication{

	@Override
	public void answerQuestion() {
       System.out.println("answer question using OPenAI");		
	}
	
}


class Bard implements AIApplication{

	@Override
	public void answerQuestion() {
       System.out.println("answer question using Bard");		
	}
	
}