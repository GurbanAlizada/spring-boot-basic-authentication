//package com.example.model;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Builder
//@EqualsAndHashCode
//@Table(name = "customer1")
//public class Customer1 implements Serializable {
//
//    @Id
//    @GeneratedValue(generator = "UUID" )
//    @GenericGenerator(name ="UUID" , strategy = "org.hibernate.id.UUIDGenerator")
//    private String id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "surname")
//    private String surname;
//
//    @OneToMany(mappedBy = "customer" /*, fetch = FetchType.EAGER*/)
//    @JsonIgnore
//    private List<Account1> account1s = new ArrayList<>();
//
//
//    public Customer1(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Customer1{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//             //   ", account1s=" + account1s +
//                '}';
//    }
//}
