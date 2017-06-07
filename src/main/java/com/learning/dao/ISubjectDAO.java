package com.learning.dao;

import java.util.List;

import com.learning.entity.Subject;

public interface ISubjectDAO {

	List<Subject> getAllSubjects();

	Subject getSubjectById(Long subjectId);

	void addSubject(Subject subject);

	void updateSubject(Subject subject);

	void deleteSubject(Long subjectId);

}
