package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lt.model.Option;
import com.lt.model.Question;

/**
 * Servlet implementation class AnswerCheckServlet
 */
@WebServlet("/AnswerCheckServlet")
public class AnswerCheckServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Question nextQuestion = (Question) session.getAttribute("nextQs");
		int opNo = Integer.parseInt(request.getParameter("op"));
		Option selectedOption = nextQuestion.getOptions().get(opNo);
		Integer score = (Integer) session.getAttribute("score");
		if(score==null)
			score=0;
		if(selectedOption.isRightAnswer())
			score++;
		session.setAttribute("score", score);
		
		
	response.sendRedirect("QuestionLoaderServlet");
	
	}

}
