package fr.sebastienr.recupback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
    private String adminRole = "ADMIN";

    public Admin() {
    }

    public Admin(String adminName, String adminEmail, String adminPassword, String adminRole) {
        this.setAdminName(adminName);
        this.setAdminEmail(adminEmail);
        this.setAdminPassword(adminPassword);
        this.setAdminRole(adminRole);
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + getAdminId() +
                ", adminName='" + getAdminName() + '\'' +
                ", adminEmail='" + getAdminEmail() + '\'' +
                ", adminPassword='" + getAdminPassword() + '\'' +
                ", adminRole='" + getAdminRole() + '\'' +
                '}';
    }
}
