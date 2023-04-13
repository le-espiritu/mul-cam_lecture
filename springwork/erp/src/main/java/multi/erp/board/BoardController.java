package multi.erp.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	@RequestMapping("/board/insert.do")
	public String insert(BoardVO board) {
		//사용자가 입력한 데이터를 꺼내서 dao단으로 넘겨야 하는 작업은 사용자가 입력한 데이터가 잘 넘어오는지 체크(sysout)
		String url = "";
		int result = service.insert(board);
		//insert가 성공한 경우와 실패한 경우 view를 다르게 넘겨주고 싶다면 insert처리 결과를 이용해서 아래와 같이 작업 
		if(result>=1) {
			url =  "redirect:/board/list.do?category=all";
		}else {
			url = "redirect:/board/insertPage.do";
		}
		return url;
	}
	@RequestMapping("/board/list.do")
	public ModelAndView boardlist(String category) {
		System.out.println("===========>"+category);
		ModelAndView mav = new ModelAndView("board/list");
		List<BoardVO> boardlist = service.findByCategory(category);
		//dao에서 결과가 넘어오는 경우 디버깅 작업은 넘어오는 데이터를 sysout으로 컨트롤러 단까지 모두 출력해보기
		mav.addObject("boardlist", boardlist);
		mav.addObject("category", category);
		return mav;
	}	
	//Ajax로 카테고리별 게시판 데이터를 요청하는 메소드
	//=> 컨트롤러 메소드처럼 ModelAndView를 리턴하지 않고 일반메소드 처럼  ArrayList<BoardVO> 를 리턴하며
	//   jackson json라이브러리가 자동으로  ArrayList<BoardVO>를 jsonww 으로 변환해서 리턴해준다.
	@RequestMapping(value = "/board/ajax_list.do",method = RequestMethod.GET,
			produces =  "application/json;charset=utf-8")
	public @ResponseBody ArrayList<BoardVO> categoryList(String category){
		ArrayList<BoardVO> boardlist = (ArrayList<BoardVO>)service.findByCategory(category);
		System.out.println("ajax통신:"+boardlist.size());
		return boardlist;
	}
}



