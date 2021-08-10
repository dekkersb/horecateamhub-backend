package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;
import com.example.horecateamhub.repository.ReceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceptServiceImp implements ReceptService {

    private ReceptRepository receptRepository;

    @Autowired
    public ReceptServiceImp (ReceptRepository receptRepository) {
        this.receptRepository = receptRepository;
    }

    @Override
    public Recept save(Recept recept)
    {
        return  receptRepository.save(recept);
    }

    @Override
    public List<Recept> findByOrderByNameAsc() {return receptRepository.findByOrderByNameAsc();}

    @Override
    public List<Recept> findAllByType(String type) { return receptRepository.findAllByType(type);}

    @Override
    public List<Recept> findAllByGlutenIsFalseOrderByNameAsc() {
        return receptRepository.findAllByGlutenIsFalseOrderByNameAsc();
    }

    @Override
    public List<Recept> findAllByLactoseIsFalseOrderByNameAsc() {
        return receptRepository.findAllByLactoseIsFalseOrderByNameAsc();
    }

    @Override
    public List<Recept> findAllByNotenIsFalseOrderByNameAsc() {
        return receptRepository.findAllByNotenIsFalseOrderByNameAsc();
    }

}
