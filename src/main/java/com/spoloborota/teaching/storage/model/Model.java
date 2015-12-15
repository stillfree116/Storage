package com.spoloborota.teaching.storage.model;

public interface Model {

	/**
	 * Show all storages
	 * @return string with all storage names
	 */
	String display();

	/**
	 * Create new storage
	 * @param name - name of the creating storage
	 * @return "true" if all is Ok and "false" if storage with specified name already exists
	 */
	boolean create(String name);

	/**
	 * Delete existing storage by name
	 * @param name
	 */
	void delete(String name);

	/**
	 * Select existing storage by name to operate with it
	 * @param name
	 * @return - "true" if storage with such name exist and "false" otherwise
	 */
	boolean use(String name);

	/**
	 * Add data to storage
	 * @param data
	 * @return - "true" if all is Ok and "false" if there is no selected storage 
	 */
	boolean add(String[] data);

}