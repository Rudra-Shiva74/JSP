package com.tech.blog.entity;

public class SharePost {

	private int cid;

	private int postid;
	private String category;
	private String tittle;
	private String content;
	private String program;
	private String image;
	private String Registerdate;
	private String usermail;
	private String username;
	private String userimg;

	public SharePost(String category, String tittle, String content, String program, String image, int postid,
			String registerdate, String usermail, String username, String userimg) {

		this.category = category;
		this.tittle = tittle;
		this.content = content;
		this.program = program;
		this.image = image;
		this.postid = postid;
		Registerdate = registerdate;
		this.usermail = usermail;
		this.username = username;
		this.userimg = userimg;

	}

	public String getUserimg() {
		return userimg;
	}

	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SharePost(int postid, String category, String tittle, String content, String program, String image,
			String registerdate) {
		this.postid = postid;
		this.category = category;
		this.tittle = tittle;
		this.content = content;
		this.program = program;
		this.image = image;
		Registerdate = registerdate;
	}

	public SharePost() {
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getRegisterdate() {
		return Registerdate;
	}

	public void setRegisterdate(String registerdate) {
		Registerdate = registerdate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

}
