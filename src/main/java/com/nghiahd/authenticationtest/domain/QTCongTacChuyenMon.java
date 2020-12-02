package com.nghiahd.authenticationtest.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "qtcongtacchuyenmon")
public class QTCongTacChuyenMon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "thoigian")
    private Date thoiGian;

    @Column(name = "noicongtac")
    private String noiCongTac;

    @Column(name = "congviecdamnhan")
    private String congViecDamNhan;

    @Column(name = "ngaykhaibosung")
    private Date ngayKhaiBoSung;

    @Column(name = "giangvienid")
    private UUID giangVienId;

    @Column(name = "sotietgiangdaytoithieu")
    private Integer soTietGiangDayToiThieu;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public String getCongViecDamNhan() {
        return congViecDamNhan;
    }

    public void setCongViecDamNhan(String congViecDamNhan) {
        this.congViecDamNhan = congViecDamNhan;
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

    public Integer getSoTietGiangDayToiThieu() {
        return soTietGiangDayToiThieu;
    }

    public void setSoTinChiToiThieu(Integer soTietGiangDayToiThieu) {
        this.soTietGiangDayToiThieu = soTietGiangDayToiThieu;
    }
}
