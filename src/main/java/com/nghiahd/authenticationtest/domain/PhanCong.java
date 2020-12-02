package com.nghiahd.authenticationtest.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "phancong")
public class PhanCong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "giangvienid")
    private UUID giangVienId;

    @Column(name = "monhocid")
    private UUID monHocId;

    @Column(name = "namhoc")
    private Integer namHoc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getGiangVienId() {
        return giangVienId;
    }

    public void setGiangVienId(UUID giangVienId) {
        this.giangVienId = giangVienId;
    }

    public UUID getMonHocId() {
        return monHocId;
    }

    public void setMonHocId(UUID monHocId) {
        this.monHocId = monHocId;
    }

    public Integer getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(Integer namHoc) {
        this.namHoc = namHoc;
    }
}
