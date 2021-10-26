package com.example.mb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.mb.model.Teacher;
import com.example.mb.service.TeacherService;

import lombok.RequiredArgsConstructor;

/**
 * Spring Boot起動時にコマンドライン実行されるコンポーネントです。
 * <p>DBの初期データを登録します。
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

	private final TeacherService service;

	/**
	 * Spring Boot起動時にコマンドラインとして実行される処理です。
	 * <p>DBの初期データを登録します。
	 */
	@Override
	public void run(String... args) throws Exception {
		// teacherテーブルの初期データを登録
		for (int i = 0; i < 13; i++) {
			Teacher teacher = new Teacher();
			teacher.setUserName("Test" + i);
			teacher.setEmail("test" + i + "@example.com");
			service.save(teacher);
		}
	}
}
