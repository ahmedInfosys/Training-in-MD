
public class Randomness {

	private String Answer;
	private String Question;
	
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public void setAnswer(int choice) {
		
		if ( choice == 1 )
			Answer = "It is certain";
		else if ( choice == 2 )
			Answer = "It is decidedly so";
		else if ( choice == 3 )
			Answer = "Without a doubt";
		else if ( choice == 4 )
			Answer = "Yes - definitely";
		else if ( choice == 5 )
			Answer = "You may rely on it";
		else if ( choice == 6 )
			Answer = "As I see it, yes";
		else if ( choice == 7 )
			Answer = "Most likely";
		else if ( choice == 8 )
			Answer = "Outlook good";
		else if ( choice == 9 )
			Answer = "Signs point to yes";
		else if ( choice == 10 )
			Answer = "Yes";
		else if ( choice == 11 )
			Answer = "Reply hazy, try again";
		else if ( choice == 12 )
			Answer = "Ask again later";
		else if ( choice == 13 )
			Answer = "Better not tell you now";
		else if ( choice == 14 )
			Answer = "Cannot predict now";
		else if ( choice == 15 )
			Answer = "Concentrate and ask again";
		
		//Additional five responses
		else if( choice == 16 ){Answer = "Don't count on it";}
		else if( choice == 17 ){Answer = "My reply is no";}
		else if( choice == 18 ){Answer = "My sources say no";}
		else if( choice == 19 ){Answer = "Outlook not so good";}
		else if( choice == 20 ){Answer = "Very doubtful";}
		else{Answer = "8-BALL ERROR!";}
	}
	public String getAnswer(){
		return Answer;
	}
	
}
