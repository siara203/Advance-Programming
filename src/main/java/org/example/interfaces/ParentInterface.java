package org.example.interfaces;

import org.example.entity.Parent;

import java.util.List;

public interface ParentInterface {
    Parent addParent(Parent parent);
    Parent updateParent(Parent parent);
    boolean deleteParent(String parentID);
    List<Parent> getAllParents();
    Parent getParentById(String parentID);
}
