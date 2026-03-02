package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(nullable = false)
    private LocalDate createdDate;

    protected Portfolio() {}

    public Portfolio(Client client, LocalDate createdDate) {
        this.client = client;
        this.createdDate = createdDate;
    }

    public Long getPortfolioId() {return this.portfolioId;}

    public LocalDate getCreatedDate() {return this.createdDate;}

    public void setCreatedDate(LocalDate createdDate) {this.createdDate = createdDate;}

    public Client getClient() {return this.client;}

    public void setClient(Client client) {this.client = client;}
}
