package com.app.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "offers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Offers extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "seller_Id")
    private Users seller;

    @OneToOne
    @JoinColumn(name = "model_Id")
    private Models model;

    @Column(name = "created")
    private Date created;

    @Column(name = "description")
    private String description;

    @Column(name = "engine")
    private Integer engine;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "modified")
    private Date modified;

    @Column(name = "price", precision = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "transmission")
    private Integer transmission;

    @Column(name = "year")
    private Integer year;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Offers() {}

    public Models getModel() {return model;}

    public void setModel(Models model) {this.model = model;}

    public Users getSeller() {
        return seller;
    }

    public void setSeller(Users seller) {
        this.seller = seller;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTransmission() {
        return transmission;
    }

    public void setTransmission(Integer transmission) {
        this.transmission = transmission;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
