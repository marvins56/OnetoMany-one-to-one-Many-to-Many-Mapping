package com.example.OnetoManyMapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "posts")
public class Post extends AuditModel{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotNull
	    @Size(max = 100)
	    @Column(unique = true)
	    private String title;

	    @NotNull
	    @Size(max = 250)
	    private String description;

	    @NotNull
	    @Lob
	    private String content;
	    
		public Post() {
			super();
		}

		public Post(@NotNull @Size(max = 100) String title, @NotNull @Size(max = 250) String description,
				@NotNull String content) {
		
			this.title = title;
			this.description = description;
			this.content = content;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	
	    
	    
}
