package com.example.mb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.example.mb.model.Teacher;

/**
 * TEACHERテーブルのマッパーです。
 */
@Mapper
public interface TeacherMapper {

	/**
	 * 全レコードの件数を取得します。
	 */
	Long count();

	/**
	 * 全レコードを取得します。
	 * @return Teacher型のList
	 */
//	@Select("SELECT * FROM teacher")
	List<Teacher> selectAll(RowBounds rowBounds);

	/**
	 * IDで取得します。
	 * @param id 取得対象のTEACHER.ID
	 * @return Teacherインスタンス
	 */
//	@Select({
//			"SELECT * FROM teacher",
//			"WHERE id = #{id}"
//	})
	Teacher selectByPrimaryKey(Long id);

	/**
	 * 1レコード登録します。
	 * @param record 登録対象のTeacherインスタンス
	 * @return 登録件数
	 */
//	@Insert(" INSERT INTO teacher (user_name, email)" +
//			" VALUES (#{userName}, #{email})")
	int insert(Teacher record);

	/**
	 * ID指定で更新します。
	 * @param record 更新対象のTeacherインスタンス
	 * @return 更新件数
	 */
//	@Update({
//			"UPDATE teacher",
//			"SET user_name = #{userName}, email = #{email}",
//			"WHERE id = #{id}"
//	})
	int updateByPrimaryKey(Teacher record);

	/**
	 * ID指定で削除します。
	 * @param id 削除対象のTEACHER.ID
	 * @return 削除件数
	 */
//	@Delete(" DELETE FROM teacher" +
//			" WHERE id = #{id}")
	int deleteByPrimaryKey(Long id);

}
