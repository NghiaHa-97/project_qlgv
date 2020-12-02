package com.nghiahd.authenticationtest.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "quatrinhngoaingu")
public class QuaTrinhNgoaiNgu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "tenngoaingu")
    private String tenNgoaiNgu;

    @Column(name = "trinhdo")
    private String trinhDo;

    @Column(name = "ngaykhaibosung")
    private Date ngayKhaiBoSung;

    @Column(name = "giangvienid")
    private UUID giangVienId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTenNgoaiNgu() {
        return tenNgoaiNgu;
    }

    public void setTenNgoaiNgu(String tenNgoaiNgu) {
        this.tenNgoaiNgu = tenNgoaiNgu;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public Date getNgayKhaiBoSung() {
        return ngayKhaiBoSung;
    }

    public void setNgayKhaiBoSung(Date ngayKhaiBoSung) {
        this.ngayKhaiBoSung = ngayKhaiBoSung;
    }

    public UUID getGiangVienId() {
        return giangVienId;
    }

    public void setGiangVienId(UUID giangVienId) {
        this.giangVienId = giangVienId;
    }
}
