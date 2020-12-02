package com.nghiahd.authenticationtest.repository.impl;

import com.nghiahd.authenticationtest.repository.GiangVienRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class GiangVienRepositoryImpl implements GiangVienRepositoryCustom {
    @Autowired
    EntityManager entityManager;

}
