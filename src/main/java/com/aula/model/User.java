package com.aula.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 500, nullable = false)
    private String quote;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getQuote() {
		return quote;
	}

	public void setQuote(String string) {
		this.quote = string;
	}

	public User(Integer id, String name, String username, String password, String quote) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.quote = quote;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", quote="
				+ quote + "]";
	}

   
}