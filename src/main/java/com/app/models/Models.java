package com.app.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "models")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Models extends BaseEntity {
    @Column(name = "category")
    private Integer category;

    @Column(name = "created")
    private Date created;

    @Column(name = "end_year")
    private Integer end_year;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "modified")
    private Date modified;

    @Column(name = "name")
    private String name;

    @Column(name = "start_year")
    private Integer start_year;
    @OneToOne(mappedBy = "model")
    private Offers offer;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brands brand;

    public Models() {}

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }
    public Offers getOffer() {
        return offer;
    }

    public void setOffer(Offers offers) {
        this.offer = offer;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getEnd_year() {
        return end_year;
    }

    public void setEnd_year(Integer end_year) {
        this.end_year = end_year;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStart_year() {
        return start_year;
    }

    public void setStart_year(Integer start_year) {
        this.start_year = start_year;
    }


    protected Models(Integer category, Date created, Integer end_year, String image_url, Date modified,
                     String name, Integer start_year) {
        this.category = category;
        this.created = created;
        this.end_year = end_year;
        this.image_url = image_url;
        this.modified = modified;
        this.name = name;
        this.start_year = start_year;
    }
}
