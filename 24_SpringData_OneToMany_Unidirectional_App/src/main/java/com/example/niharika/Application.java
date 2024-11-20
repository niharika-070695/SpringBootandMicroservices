package com.example.niharika;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.niharika.entity.Posts;
import com.example.niharika.dao.PostDao;
import com.example.niharika.entity.Comments;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PostDao postDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// First post information
//		Posts post = new Posts();
//		post.setPostTitle("Spring Boot post");
//		post.setCreatedDate(new Date());
//		post.setCreatedBy("Tharun");
//
//		// Binding first comment on first post
//		Comments firstcomment = new Comments();
//		firstcomment.setCommentInfo("Very informative session");
//		firstcomment.setCreatedDate(new Timestamp(new Date().getTime()));
//		firstcomment.setCreatedBy("Shivaji");
//
//		// Binding second comment on first post
//		Comments secondcomment = new Comments();
//		secondcomment.setCommentInfo("Good session");
//		secondcomment.setCreatedDate(new Timestamp(new Date().getTime()));
//		secondcomment.setCreatedBy("Kunal");
//
//		// parent to child saving records
//		post.setComments(List.of(firstcomment, secondcomment));
//
//		// saving the parent object
//		Posts p = postDao.save(post);
//		System.out.println("Saving the first shown posts entity record in database:::" + p);
//
//		// Second post information
//		Posts post1 = new Posts();
//		post1.setPostTitle("AWS Cloud Solution Architect");
//		post1.setCreatedDate(new Date());
//		post1.setCreatedBy("Vijay");
//
//		// Binding first comment on second post
//		Comments firstcomment1 = new Comments();
//		firstcomment1.setCommentInfo("Good session on s3 buckets");
//		firstcomment1.setCreatedDate(new Timestamp(new Date().getTime()));
//		firstcomment1.setCreatedBy("Kavya");
//
//		// Binding second comment on second post
//		Comments secondcomment1 = new Comments();
//		secondcomment1.setCommentInfo("Good session on EC2 instances");
//		secondcomment1.setCreatedDate(new Timestamp(new Date().getTime()));
//		secondcomment1.setCreatedBy("Sravya");
//
//		// Binding second comment on second post
//		Comments thirdcomment1 = new Comments();
//		thirdcomment1.setCommentInfo("Good session on Load balancer instances");
//		thirdcomment1.setCreatedDate(new Timestamp(new Date().getTime()));
//		thirdcomment1.setCreatedBy("Soumya");
//		// parent to child saving records
//		post1.setComments(List.of(firstcomment1, secondcomment1,thirdcomment1));
//
//		// saving the parent object
//		Posts p1 = postDao.save(post1);
//		System.out.println("Saving the second shown posts entity record in database:::" + p1);
		
		//loading the parent object
//		Posts px = postDao.findById(1).get();
//		System.out.println("Loading post information:::"+ px);
//		System.out.println("Loading post and comment infor:::"+px.getComments());
		
		//deleting parent object associated child obejcts should be deletd
		postDao.deleteById(1);

	}

}
