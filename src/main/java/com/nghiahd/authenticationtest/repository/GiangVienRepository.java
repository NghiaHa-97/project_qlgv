package com.nghiahd.authenticationtest.repository;

import com.nghiahd.authenticationtest.domain.GiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, UUID>, GiangVienRepositoryCustom {
}
