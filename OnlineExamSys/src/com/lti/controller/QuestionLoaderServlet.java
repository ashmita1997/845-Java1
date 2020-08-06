package com.lti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lt.model.Question;
import com.lt.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	//int qNo=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> listOfQuestions = qbLoader.loadQuestionsOnJava();
		HttpSession session = request.getSession();
		Integer qNo = (Integer) session.getAttribute("qNo");
		if(qNo==null)
			qNo=0;
		if(qNo == listOfQuestions.size())
			response.sendRedirect("viewScore.jsp");
		else {
		Question nextQuestion = listOfQuestions.get(qNo++);
		session.setAttribute("qNo", qNo);
		session.setAttribute("nextQs", nextQuestion);
		response.sendRedirect("viewQuestion.jsp");
		}
	}

}
