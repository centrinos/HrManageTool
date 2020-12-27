package com.csssi.manage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;


@Getter
@Setter
@ToString
@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = -7287251643129750184L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "level")
    private Short level;

    @Column(name = "salary")
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
