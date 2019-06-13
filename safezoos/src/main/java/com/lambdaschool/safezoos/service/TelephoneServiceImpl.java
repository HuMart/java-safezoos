package com.lambdaschool.safezoos.service;

import com.lambdaschool.safezoos.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "telephoneService")
public class TelephoneServiceImpl implements TelephoneService
{
    @Autowired
    TelephoneRepository telephonerepos;
}
