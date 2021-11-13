package com.company.Nine;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {
    private ArrayList<Cafedra> cafedras;
    private ArrayList<Student> students;
    private ArrayList<StudientGroup> studientGroups;
    private ArrayList<Teacher> teachers;

    public Controller(ArrayList<Cafedra> cafedras, ArrayList<Student> students, ArrayList<StudientGroup> studientGroups, ArrayList<Teacher> teachers) {
        this.cafedras = cafedras;
        this.students = students;
        this.studientGroups = studientGroups;
        this.teachers = teachers;
    }

    private void Add(Cafedra cafedra){
        cafedras.add(cafedra);
    }
    private void Add(Student student){
        students.add(student);
    }
    private void Add(StudientGroup group){
        studientGroups.add(group);
    }
    public void Add(Teacher teacher){
        teachers.add(teacher);
    }
    public void show(){
        for (Cafedra cafedra : cafedras){
            System.out.println(cafedra);
            for (Teacher teacher : teachers.stream().filter(u -> u.getCafedra().equals(cafedra)).collect(Collectors.toList())){
                System.out.println(teacher);
            }
            for (Student studient : students.stream().filter(u -> u.getCafedra().equals(cafedra)).collect(Collectors.toList())){
                System.out.println(studient);
            }
            for (StudientGroup group : studientGroups.stream().filter(u -> u.getCafedra().equals(cafedra)).collect(Collectors.toList())){
                System.out.println(group);
            }
        }
    }
}
