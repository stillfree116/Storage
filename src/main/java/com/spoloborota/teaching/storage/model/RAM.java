package com.spoloborota.teaching.storage.model;

import java.util.HashMap;
import java.util.Map;

import com.spoloborota.teaching.storage.type.MapStorage;

/**
 * All data saved to RAM memory first
 * @author Spoloborota
 *
 */
public class RAM implements Model {
	public Map<String, MapStorage> map;
	public MapStorage currentStorage = null;
	
	public RAM() {
		map = new HashMap<>();
	}
	
	/* (non-Javadoc)
	 * @see com.spoloborota.teaching.storage.model.Model#display()
	 */
	@Override
	public String display() {
		return map.keySet().toString();
	}
	
	/* (non-Javadoc)
	 * @see com.spoloborota.teaching.storage.model.Model#create(java.lang.String)
	 */
	@Override
	public boolean create(String name) {
		if (map.containsKey(name)) {
			return false;
		} else {
			map.put(name, new MapStorage(name));
			return true;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.spoloborota.teaching.storage.model.Model#delete(java.lang.String)
	 */
	@Override
	public void delete(String name) {
		MapStorage deleted = map.remove(name);
		if (deleted.equals(currentStorage)) {
			currentStorage = null;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.spoloborota.teaching.storage.model.Model#use(java.lang.String)
	 */
	@Override
	public boolean use(String name) {
		MapStorage mapStorage = map.get(name);
		if (mapStorage != null) {
			currentStorage = mapStorage;
			return true;
		} else {
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.spoloborota.teaching.storage.model.Model#add(java.lang.String[])
	 */
	@Override
	public boolean add(String[] data) {
		if (currentStorage != null) {
			return currentStorage.add(data);
		} else {
			return false;
		}
	}
}
