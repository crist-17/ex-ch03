package com.pci.myform.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pci.myform.dto.ArticleRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MyForm {

	//http://localhost:8080/article-get?title=제목ㅂㅂㅂ&content=get방식
	//form화면 테스트가능, 포스트맨 테스트 불가능
	@GetMapping("/article-get")
	public String articleGet(@RequestParam String title, @RequestParam String content) {
		String result ="제목: "+ title + "\n" + "<br>내용: " + content;
		return result;
	}
	
	//http://localhost:8080/article-postman
	//form화면 테스트 불가능, 포스트맨 테스트 가능
	@PostMapping("/article-postman")
	public String articlePostman(@RequestBody ArticleRequest request) {
		String result ="제목: "+ request.title() + "\n" + "<br>내용: " + request.content();
		
		return result;
	}
	
	//form화면 테스트가능, 포스트맨 테스트 불가능
	@PostMapping("/article-post")
	public String articlePost(@ModelAttribute ArticleRequest request) {
		String result ="제목: "+ request.title() + "\n" + "<br>내용: " + request.content();
		
		return result;
	}
	
	
	//form화면 테스트가능, 포스트맨 테스트 가능
	@PostMapping("/article-auto")
	public String articleAuto(ArticleRequest request) {
		String result ="제목: "+ request.title() + "\n" + "<br>내용: " + request.content();
		
		return result;
	}
	
	
	
}
