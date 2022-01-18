package solution7.problem3;

public class FileDownloadServlet extends HttpServlet {
//클래스 만들때 abstract 체크해서 만들어야 @Override 생김
	@Override
	public void service() {
		System.out.println("파일다운로드합니다.");
	}

}
