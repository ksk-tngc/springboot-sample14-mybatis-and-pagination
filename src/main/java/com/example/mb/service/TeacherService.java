package com.example.mb.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mb.mapper.TeacherMapper;
import com.example.mb.model.Teacher;

import lombok.RequiredArgsConstructor;

/**
 * TEACHERテーブルに関わるサービスクラスです。
 */
@Service
@Transactional
@RequiredArgsConstructor
public class TeacherService {

	/** マッパーをインジェクション */
	private final TeacherMapper mapper;

	/**
	 * TEACHERテーブルのレコードを全件取得します。
	 * <p>ページネーションを実装します。
	 * @return Teacher型のList
	 */
	public Page<Teacher> selectAll(Pageable pageable) {
		// MyBatis側のページ情報であるRowBoundsを生成し、該当レコードを取得
		RowBounds rowBounds = new RowBounds(
				(int) pageable.getOffset(), pageable.getPageSize());
		List<Teacher> teachers = mapper.selectAll(rowBounds);

		// テーブル件数を取得（ページネーションで使用）
		Long total = mapper.count();

		// Spring Data Commons の Page インターフェースの実装クラスを生成
		return new PageImpl<Teacher>(teachers, pageable, total);
	}

	/**
	 * TEACHERテーブルからID指定でレコードを取得します。
	 * @param id 取得対象のTEACHER.ID
	 * @return Teacherインスタンス
	 */
	public Teacher selectByPrimaryKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	/**
	 * TEACHERテーブルにレコードを登録 or 更新します。
	 * @param teacher 登録 or 更新対象のTeacherインスタンス
	 */
	public void save(Teacher teacher) {
		if (teacher.getId() == null) {
			mapper.insert(teacher);
		} else {
			mapper.updateByPrimaryKey(teacher);
		}
	}

	/**
	 * TEACHERテーブルからID指定でレコードを削除します。
	 * @param id 削除対象のTEACHER.ID
	 */
	public void deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
	}

}
