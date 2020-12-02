package com.nghiahd.authenticationtest.service.impl;

import com.nghiahd.authenticationtest.domain.GiangVien;
import com.nghiahd.authenticationtest.repository.GiangVienRepository;
import com.nghiahd.authenticationtest.service.GiangVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GiangVienServiceImpl implements GiangVienService {
    @Autowired
     GiangVienRepository giangVienRepository;

    @Override
    public List<GiangVien> getAllGiangVien() {
        return giangVienRepository.findAll();
    }
}
