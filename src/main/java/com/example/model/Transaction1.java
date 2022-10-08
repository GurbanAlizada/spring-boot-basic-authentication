//package com.example.model;
//
//
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@EqualsAndHashCode
//@Entity
//@Table(name = "transaction")
//public class Transaction1 implements Serializable {
//
//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name ="UUID" , strategy = "org.hibernate.id.UUIDGenerator")
//    private String id;
//
//
//    @Column(name = "amount")
//    private BigDecimal amount;
//
//    @Column(name = "transaction_type")
//    @Enumerated(EnumType.STRING)
//    private TransactionType transactionType = TransactionType.INITIAL;
//
//
//    @Column(name = "transaction_date")
//    private LocalDateTime transactionDate;
//
//    @ManyToOne /*(fetch = FetchType.LAZY )*/
//    @JoinColumn(name = "account_id" , nullable = false)
//    private Account1 account1;
//
//    public Transaction1(String id, BigDecimal amount, LocalDateTime transactionDate, Account1 account1) {
//        this.id = id;
//        this.amount = amount;
//        this.transactionDate = transactionDate;
//        this.account1 = account1;
//    }
//
//    public Transaction1(BigDecimal amount, Account1 account1) {
//        this.amount = amount;
//        this.account1 = account1;
//    }
//
//
//}
