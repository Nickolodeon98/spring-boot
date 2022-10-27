package com.springboot.api.domain.dto;

public class MemberDto {
    private String name;
    private String email;
    private String organisation;
    private int age;

    public MemberDto(String name, String email, String organisation, int age) {
        this.name = name;
        this.email = email;
        this.organisation = organisation;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("name='%s', email='%s', organisation='%s', age='%d'", this.name, this.email, this.organisation, this.age);
    }
}
