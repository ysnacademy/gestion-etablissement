package com.ysnacademy.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ysnacademy.dao.interfaces.INoteDAO;
import com.ysnacademy.model.Note;

public class NoteDAO implements INoteDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addNote(Note note) {
		getSessionFactory().getCurrentSession().save(note);

	}

	public void updateNote(Note note) {
		getSessionFactory().getCurrentSession().update(note);


	}

	public void deleteNote(Note note) {
		getSessionFactory().getCurrentSession().delete(note);


	}

	public Note getNoteById(int id) {
		List list = getSessionFactory().getCurrentSession()
		           .createQuery("from User where id=?")
		                 .setParameter(0, id).list();
		  return (Note)list.get(0);
	}

	public List<Note> getNotes() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		  return list;
	}
}
