package com.springboot.api.domain.dto;

public class MemberDto {
    private String name;
    private String email;
    private String organisation;

    public MemberDto(String name, String email, String organisation) {
        this.name = name;
        this.email = email;
        this.organisation = organisation;
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

    @Override
    public String toString() {
        return String.format("name='%s', email='%s', organisation='%s'", this.name, this.email, this.organisation);
    }
}
