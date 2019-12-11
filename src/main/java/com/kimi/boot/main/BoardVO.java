package com.kimi.boot.main;

public class BoardVO {
	private int seq;
	private int log_seq;

	private String title;
	private String writer;
	private String content;
	private String regDate;
	private int cnt;
	private String create_time;
	
	

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getLog_seq() {
		return log_seq;
	}
	public void setLog_seq(int log_seq) {
		this.log_seq = log_seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", log_seq=" + log_seq + ", title=" + title + ", writer=" + writer + ", content="
				+ content + ", regDate=" + regDate + ", cnt=" + cnt + ", create_time=" + create_time + "]";
	}

}
