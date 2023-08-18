//PERSISTENT CLASS / ANNOTATION-BASED METADATA / JPA ANNOTATIONS
package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="text")
	private String text;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="sender_id")
	private Person sender;
	
	public Message(){};

	public Message(String text) {
		this.text = text;
	}
	
	public Message(String text, Person sender) {
		this.text = text;
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + "]";
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
}