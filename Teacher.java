package com.evorra.backend.model.dao.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.evorra.backend.model.Identifiable;

import lombok.Data;


@Data
@Entity(name = "teacher")
public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String lastName;

    @OneToOne(mappedBy = "teacher")
    private ClassRoom classRoom;

}
