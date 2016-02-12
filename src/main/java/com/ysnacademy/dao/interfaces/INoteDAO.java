package com.ysnacademy.dao.interfaces;

import java.util.List;

import com.ysnacademy.model.Note;

public interface INoteDAO {
	public void addNote(Note Note);

	public void updateNote(Note Note);

	public void deleteNote(Note Note);

	public Note getNoteById(int id);

	public List<Note> getNotes();
}
