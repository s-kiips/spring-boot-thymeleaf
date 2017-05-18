package com.sudin.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
@Entity
@Table(name = "users")
public class BlogUser extends Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String username;

    @Column(length = 60)
    private String passwordHash;

    @Column(length = 100)
    private String fullName;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts = new HashSet<Post>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public BlogUser() {
    }

    public BlogUser(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
    }

    public BlogUser(Long id, String username, String fullName) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "BlogUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fullName='" + fullName + '\'' +
                ", posts=" + posts +
                '}';
    }
}
