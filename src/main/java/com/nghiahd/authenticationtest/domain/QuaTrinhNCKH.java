package com.nghiahd.authenticationtest.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "quatrinhnckh")
public class QuaTrinhNCKH {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "tendetai")
    private String tenDeTai;

    @Column(name = "nambatdau")
    private Date namBatDau;

    @Column(name = "namhoanthanh")
    private Date namHoanThanh;

    @Column(name = "capdodetai")
    private String capDoDeTai;

    @Column(name = "trachnhiemthamgia")
    private String trachNhiemThamGia;

    @Column(name = "ngaykhaibosung")
    private Date NgayKhaiBoSung;

    @Column(name = "giangvienid")
    private UUID GiangVienId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public void setTenDeTai(String tenDeTai) {
        this.tenDeTai = tenDeTai;
    }

    public Date getNamBatDau() {
        return namBatDau;
    }

    public void setNamBatDau(Date namBatDau) {
        this.namBatDau = namBatDau;
    }

    public Date getNamHoanThanh() {
        return namHoanThanh;
    }

    public void setNamHoanThanh(Date namHoanThanh) {
        this.namHoanThanh = namHoanThanh;
    }

    public String getCapDoDeTai() {
        return capDoDeTai;
    }

    public void setCapDoDeTai(String capDoDeTai) {
        this.capDoDeTai = capDoDeTai;
    }

    public String getTrachNhiemThamGia() {
        return trachNhiemThamGia;
    }

    public void setTrachNhiemThamGia(String trachNhiemThamGia) {
        this.trachNhiemThamGia = trachNhiemThamGia;
    }

    public Date getNgayKhaiBoSung() {
        return NgayKhaiBoSung;
    }

    public void setNgayKhaiBoSung(Date ngayKhaiBoSung) {
        NgayKhaiBoSung = ngayKhaiBoSung;
    }

    public UUID getGiangVienId() {
        return GiangVienId;
    }

    public void setGiangVienId(UUID giangVienId) {
        GiangVienId = giangVienId;
    }
}
