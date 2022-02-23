package data;

public class Report {
	private User		author;
	private EReason		reason;
	private Reportable	reportObject;

	public Report(User author, Reportable obj, EReason reason) {
		this.author = author;
		this.reportObject = obj;
		this.reason = reason;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public EReason getReason() {
		return reason;
	}

	public void setReason(EReason reason) {
		this.reason = reason;
	}

	public Reportable getReportObject() {
		return reportObject;
	}

	public void setReportObject(Reportable reportObject) {
		this.reportObject = reportObject;
	}
}
