package com.example.niharika.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.ArrayList;
import com.example.niharika.entity.Comments;


@Entity
@Table(name="niharika_posts")
public class Posts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="post_id")
	private int postId;
	
	@Column(name="post_title",nullable=false)
	private String postTitle;
	
	@Column(name="created_date",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@Column(name="created_by",nullable=false)
	private String createdBy;
	
	
	@OneToMany(//targetEntity = Comments.class
			    cascade = CascadeType.ALL,
			    orphanRemoval = true,
			    fetch = FetchType.LAZY
			    )
	@JoinColumn(name = "post_id")
	private List<Comments> comments = new ArrayList<>();


	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public String getPostTitle() {
		return postTitle;
	}


	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public List<Comments> getComments() {
		return comments;
	}


	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Posts [postId=" + postId + ", postTitle=" + postTitle + ", createdDate=" + createdDate + ", createdBy="
				+ createdBy + ", comments=" + "***"+ "]";
	}
	


}
