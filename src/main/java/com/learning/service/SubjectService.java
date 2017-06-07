package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.ISubjectDAO;
import com.learning.entity.Subject;

@Service
public class SubjectService implements ISubjectService {

	@Autowired
	private ISubjectDAO subjectDao;

	@Override
	public List<Subject> getAllSubjects() {
		return subjectDao.getAllSubjects();
	}

	@Override
	public Subject getSubjectById(Long subjectId) {
		return subjectDao.getSubjectById(subjectId);
	}

	@Override
	public void addSubject(Subject subject) {
		subjectDao.addSubject(subject);
	}

	@Override
	public void updateSubject(Subject subject) {
		subjectDao.updateSubject(subject);
	}

	@Override
	public void deleteSubject(Long subjectId) {
		subjectDao.deleteSubject(subjectId);
	}

}
