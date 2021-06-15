package com.example.MySBSCRUD.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

// Энтити роли для отображения в бд
@Entity
@Table(name = "Roles")
@Data
@NoArgsConstructor // опять фишки))
public class Role {

    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (unique = true, nullable = false)
    @NotEmpty()
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public List<User> getUsers(){ return users;}

    public void setUsers(List<User> users){ this.users=users;}

}
