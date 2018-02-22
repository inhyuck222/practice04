package prob02;

public class Book {
	
	private static int IN_STOCK = 1, OUT_STOKC = 0;
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
		stateCode = IN_STOCK;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String state;
		
		if(stateCode == OUT_STOKC) {
			state = "대여중";
		} else {
			state = "재고있음";
		}
		
		return ("책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + state);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
}