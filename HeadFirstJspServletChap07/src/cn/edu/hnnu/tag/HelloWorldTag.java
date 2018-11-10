package cn.edu.hnnu.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloWorldTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out = this.pageContext.getOut();
		try {
			out.println("自定义标签你好！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TagSupport.SKIP_BODY; //直接结束标签
	}
	

}
