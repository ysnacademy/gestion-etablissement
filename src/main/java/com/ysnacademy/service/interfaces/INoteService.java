package com.ysnacademy.service.interfaces;

import java.util.List;

import com.ysnacademy.model.Note;

public interface INoteService {
	public void addNote(Note Note);

	public void updateNote(Note Note);

	public void deleteNote(Note Note);

	public Note getNoteById(int id);

	public List<Note> getNotes();
}
