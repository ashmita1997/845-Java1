package com.lt.model;

import java.util.ArrayList;
import java.util.List;

import com.lt.model.Question.Difficulty;

public class QuestionBankLoader {
	public List<Question> loadQuestionsOnJava() {
		Question q;
		List<Option> ops;
		String subjectName = "Java";
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		q = new Question("What is Java?",Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is a OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1?",Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is a garbage collector in java",true));
		ops.add(new Option("G1 is a english word",false));
		ops.add(new Option("G1 is a name of spy agency",false));
		ops.add(new Option("G1 is the sequel of SRK's RA.One",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which of the following option leads to the portability and security of Java?",Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Bytecode is executed by JVM",true));
		ops.add(new Option("The applet makes the Java code secure and portable",false));
		ops.add(new Option("Use of exception handling",false));
		ops.add(new Option("Dynamic binding between objects",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which of the following is not a Java features??",Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Dynamic",false));
		ops.add(new Option("Architecture Neutral",false));
		ops.add(new Option("Use of pointers",true));
		ops.add(new Option("Object-oriented",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("_____ is used to find and fix bugs in the Java programs.",Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("JVM",false));
		ops.add(new Option("JRE",false));
		ops.add(new Option("JDK",false));
		ops.add(new Option("JDB",true));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		return qb.getQuestionsFor(subjectName);
	}

}
