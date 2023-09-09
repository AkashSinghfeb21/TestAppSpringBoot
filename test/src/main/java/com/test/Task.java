package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String desc_;
	private String stats;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDesc_() {
		return desc_;
	}



	public void setDesc_(String desc_) {
		this.desc_ = desc_;
	}



	public String getStats() {
		return stats;
	}



	public void setStats(String stats) {
		this.stats = stats;
	}



	@Override
	public String toString() {
	    return id + " " + title + " " + desc_ + " " + stats;
	}
}
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Task {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String title;
//    private String description;
//    private String status;
//    
//    // Constructors
//    
//    // Default constructor (required by JPA)
//    public Task() {
//    }
//
//    // Constructor with all fields except id
//    public Task(String title, String description, String status) {
//        this.title = title;
//        this.description = description;
//        this.status = status;
//    }
//    
//    // Getter and Setter methods
//    
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//    
//    @Override
//    public String toString() {
//        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
//    }
//}
