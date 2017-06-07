/**
 * 
 */
package com.learning.service;

import java.util.List;

import com.learning.entity.Subject;

/**
 * Interface for service layer .
 * 
 * @author bhatiam
 *
 */
public interface ISubjectService {
	List<Subject> getAllSubjects();

	Subject getSubjectById(Long subjectId);

	void addSubject(Subject subject);

	void updateSubject(Subject subject);

	void deleteSubject(Long subjectId);

}
