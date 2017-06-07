package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.learning.entity.Subject;
import com.learning.service.ISubjectService;

@Controller
@RequestMapping("/learning")
public class SubjectController {

	@Autowired
	private ISubjectService subjectService;


	@PostMapping("subject")
	public ResponseEntity<Void> addSubject(@RequestBody Subject subject, UriComponentsBuilder builder) {
		HttpHeaders headers = new HttpHeaders();
		try {
			subjectService.addSubject(subject);
			headers.setLocation(builder.path("/subject/{id}").buildAndExpand(subject.getSubjectId()).toUri());
			return new ResponseEntity<>(headers, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

	@GetMapping("subjects")
	public ResponseEntity<List<Subject>> getAllSubject() {
		List<Subject> subjects = subjectService.getAllSubjects();
		return new ResponseEntity<>(subjects, HttpStatus.OK);
	}

	@GetMapping("subject/{id}")
	public ResponseEntity<Subject> getSubject(Long subjectId) {
		ResponseEntity<Subject> response = null;
		Subject subject = subjectService.getSubjectById(subjectId);
		if (null != subject) {
			response = new ResponseEntity<Subject>(subject, HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
