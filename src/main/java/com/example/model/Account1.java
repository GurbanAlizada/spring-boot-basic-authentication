//package com.example.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//@EqualsAndHashCode
//@Entity
//@Table(name = "account1")
//public class Account1 implements Serializable {
//
//
//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name ="UUID" , strategy = "org.hibernate.id.UUIDGenerator")
//    private String id;
//
//    @Column(name = "balance")
//    private BigDecimal balance = BigDecimal.ZERO;
//
//    @Column(name = "creatition_date")
//    private LocalDateTime creatitionTime;
//
//
//    @ManyToOne( /*fetch = FetchType.LAZY  ,*/ cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "customer_id" , nullable = false)
//    private Customer1 customer1;
//
//
//
//    @OneToMany(mappedBy = "account1", cascade = CascadeType.PERSIST  /*, fetch = FetchType.EAGER*/)
//    @JsonIgnore
//    private List<Transaction1> transactions = new ArrayList<>() ;
//
//
//    public Account1(String id, BigDecimal balance, LocalDateTime creatitionTime, Customer1 customer1) {
//        this.id = id;
//        this.balance = balance;
//        this.creatitionTime = creatitionTime;
//        this.customer1 = customer1;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Account1{" +
//                "id='" + id + '\'' +
//                ", balance=" + balance +
//                ", creatitionTime=" + creatitionTime +
//            //    ", customer1=" + customer1 +
//              //  ", transactions=" + transactions +
//                '}';
//    }
//}
