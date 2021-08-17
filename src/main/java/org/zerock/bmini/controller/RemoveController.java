package org.zerock.bmini.controller;

import org.zerock.bmini.service.BoardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Remove", value = "/board/remove")
public class RemoveController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long bno = Long.parseLong(request.getParameter("bno"));
        BoardService.INSTANCE.remove(bno);
        response.sendRedirect("/board/list");

    }
}
