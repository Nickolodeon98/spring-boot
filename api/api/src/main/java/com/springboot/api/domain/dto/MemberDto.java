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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
