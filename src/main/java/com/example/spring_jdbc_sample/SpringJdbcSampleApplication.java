package com.example.spring_jdbc_sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcSampleApplication.class, args);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String... args) throws Exception {
		List<Book> bookList = jdbcTemplate.query("select * from book", 
												new BeanPropertyRowMapper<Book>(Book.class));
		
		bookList.forEach(b-> System.out.println(b.getTitle()));
	}
}
