package com.newgen.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newgen.main.dao.UserDao;
import com.newgen.main.entity.User;



@SpringBootApplication
public class SpringBootJdbcCrudApplication  implements CommandLineRunner{
    @Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcCrudApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		----------------Insertion--------------
//		User user1 = new User("shivam","shivam.upadhyay@newgensoft.com","male","Maharajganj");
//		User user2 = new User("Raj","raj.n.kumar@newgensoft.com","male","Barauni");
//		boolean status =userDao.insertUser(user2);
//		if(status) {
//			System.out.println("User inserted Successfully");
//			
//		}else {
//			System.out.println("User not inserted ");
//		}
		
		
//		
//		----------------Updation 1--------------
//		User user = new User("raj","raj.n.kumar@newgensoft.com","male","delhi");
//		boolean status2 =userDao.updateUser(user);
//		if(status2) {
//			System.out.println("User updated Successfully");
//			
//		}else {
//			System.out.println("User not updated ");
//		}
		
//		----------------Updation 2--------------
//		User user = userDao.getUserByEmail("shivam.upadhyay@newgensoft.com");
//		user.setCity("Delhi");
//		boolean status2 =userDao.updateUser(user); 
//		if(status2) {
//			System.out.println("User updated Successfully");
//			
//		}else {
//			System.out.println("User not updated ");
//		}
//		
		 
		
//		----------------Deletion--------------
//		String email = "raj.n.kumar@newgensoft.com";
//		boolean status3 =userDao.deleteUser(email);
//		if(status3) {
//			System.out.println("User Deleted  Successfully");
//			
//		}else {
//			System.out.println("User not Deleted ");
//		}
//	}
//	----------------Select--------------
	User user = userDao.getUserByEmail("shivam.upadhyay@newgensoft.com");
	System.out.println("Name :"+user.getName());
	System.out.println("Email :"+user.getEmail());
	System.out.println("Gender :"+user.getGender());
	System.out.println("City :"+user.getCity());
		
		
//	----------------Select All User--------------
//	List<User> list = userDao.getAllUser();
//	for(User user:list) {
//		System.out.println("Name :"+user.getName());
//		System.out.println("Email :"+user.getEmail());
//		System.out.println("Gender :"+user.getGender());
//		System.out.println("City :"+user.getCity());
//		
//	}
	
	
	}

}
