package org.example.interfaces;

import org.example.entity.Admin;

import java.util.List;

public interface AdminInterface {
    Admin addAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    boolean deleteAdmin(String adminID);
    List<Admin> getAllAdmins();
    Admin getAdminById(String adminID);
}
