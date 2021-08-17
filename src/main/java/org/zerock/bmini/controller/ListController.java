package org.zerock.bmini.controller;

import org.zerock.bmini.dto.BoardDTO;
import org.zerock.bmini.service.BoardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "List", value = "/board/list")
public class ListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<BoardDTO> list = BoardService.INSTANCE.getBoardList();

        request.setAttribute("list", list);

        request.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(request,response);

    }
}
