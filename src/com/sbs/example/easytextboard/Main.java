package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lastArticleId =
		
		while (true) {
			
			int id = 1;
			String title = scanner.nextLine();
			System.out.println("제목 :");
			String boby = scanner.nextLine(); 
			System.out.println("내용 :");
			
		System.out.println("명령어)");
		String command = scanner.nextLine();
		
		
		System.out.println("== 생성된 게시물 정보 ==");
		System.out.println("번호 : %d\n"  + id);
		System.out.println("제목 : %s\n" + title);
		System.out.println("내용 : %s\n" + boby);
		
		if (command.equals("article list")) {
			System.out.println("== 게시물 리스트 ==");
			System.out.println("번호 : " + id);
			System.out.println("제목 : " + title);
			System.out.println("내용 : " + boby);
			
		}else if (command.equals("article add")) {
			System.out.println("== 게시물 작성==");
			System.out.println("번호 : " + id);
			System.out.println("제목 : " + title);
			System.out.println("내용 : " + boby);
			
		}else if (command.equals("system exit ")) {
			System.out.println("== 프로그램 종료 ==");
			
			System.out.println("번호 : " + id);
			System.out.println("제목 : " + title);
			System.out.println("내용 : " + boby);
			
			break;
		}else {
			System.out.println("== 존재하지 않는 명령어 ==");
			
			System.out.println("번호 : " + id);
			System.out.println("제목 : " + title);
			System.out.println("내용 : " + boby);
			
			
			scanner.close();
		}
		}
	
	}
	}


	
			
			