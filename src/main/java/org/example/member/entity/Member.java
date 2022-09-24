package org.example.member.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MBR")
public class Member {
    @Id
    private Long id;
    private String name;

    public Member() {}
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return this.id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
}
