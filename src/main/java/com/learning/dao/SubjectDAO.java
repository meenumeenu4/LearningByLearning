/**
 * 
 */
package com.learning.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.learning.entity.Subject;

/**
 * @author bhatiam
 *
 */

@Repository
public class SubjectDAO implements ISubjectDAO {

	@PersistenceContext
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> getAllSubjects() {
		String hql = "From Subject";
		return entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Subject getSubjectById(Long subjectId) {
		return entityManager.find(Subject.class, subjectId);
	}

	@Override
	public void addSubject(Subject subject) {
		entityManager.persist(subject);
	}

	@Override
	public void updateSubject(Subject subject) {
		Subject sub = getSubjectById(subject.getSubjectId());
		sub.setDescription(subject.getDescription());
		sub.setName(subject.getName());
		entityManager.flush();
	}

	@Override
	public void deleteSubject(Long subjectId) {
		entityManager.remove(getSubjectById(subjectId));
	}

}
