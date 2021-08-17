package org.zerock.bmini.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.bmini.dao.BoardDAO;
import org.zerock.bmini.dto.BoardDTO;
import org.zerock.bmini.service.BoardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@WebServlet(name = "ModifyController", value = "/board/modify")
public class ModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("modify do get !!!!!!!!");
        Long bno = Long.parseLong(request.getParameter("bno"));
        BoardDTO boardDTO = BoardService.INSTANCE.modify(bno);
        request.setAttribute("boardDTO", boardDTO);
        request.getRequestDispatcher("/WEB-INF/board/modify.jsp").forward(request, response);
        log.info("modify do finish!!!!!!!!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long bno = Long.parseLong(request.getParameter("bno"));

        BoardDTO boardDTO = BoardDTO.builder()
                .title(request.getParameter("title"))
                .content(request.getParameter("content"))
                .bno(bno)
                .build();
        BoardService.INSTANCE.update(boardDTO);
        response.sendRedirect("/board/read?bno="+bno);
    }
}