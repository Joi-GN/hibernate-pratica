// PERSISTENT CLASS / TO XML-BASED MAPPING
// ITS NECESSARY TO BE IN THE SAME PACKAGE AS THE OBJECT/RELATIONAL MAPPING DATA (Message.hbm.xml)
package domain;

public class Message {
	private long id;
	private String text;
	
	public Message(String text) {
		super();
		this.text = text;
	}

	public Message() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + "]";
	}
	
}
