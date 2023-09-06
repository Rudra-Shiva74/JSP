package mvc.bean;

public class Massage {
	private String content;
	private String css;

	public Massage(String content, String css) {
		this.content = content;
		this.css = css;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}
}
