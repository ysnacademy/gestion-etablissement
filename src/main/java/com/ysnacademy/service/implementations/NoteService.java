package com.ysnacademy.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysnacademy.dao.interfaces.INoteDAO;
import com.ysnacademy.model.Note;
import com.ysnacademy.service.interfaces.INoteService;

@Service
@Transactional(readOnly = false)
public class NoteService implements INoteService {

	INoteDAO iNoteDAO;

	public INoteDAO getiNoteDAO() {
		return iNoteDAO;
	}

	public void setiNoteDAO(INoteDAO iNoteDAO) {
		this.iNoteDAO = iNoteDAO;
	}

	@Transactional(readOnly = false)
	public void addNote(Note note) {
		getiNoteDAO().addNote(note);

	}

	@Transactional(readOnly = false)
	public void updateNote(Note note) {
		getiNoteDAO().updateNote(note);

	}
	@Transactional(readOnly = false)
	public void deleteNote(Note note) {
		getiNoteDAO().deleteNote(note);

	}
	
	public Note getNoteById(int id) {
		return getiNoteDAO().getNoteById(id);
	}

	public List<Note> getNotes() {
		return getiNoteDAO().getNotes();
	}

}
