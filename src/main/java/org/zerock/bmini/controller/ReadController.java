package org.zerock.bmini.controller;

import org.zerock.bmini.dao.BoardDAO;
import org.zerock.bmini.dto.BoardDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ReadController", value = "/board/read")
public class ReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long bno = Long.parseLong(request.getParameter("bno"));
        BoardDTO boardDTO = BoardDAO.INSTANCE.read(bno);
        request.setAttribute("boardDTO", boardDTO);
        request.getRequestDispatcher("/WEB-INF/board/read.jsp").forward(request, response);
    }
}