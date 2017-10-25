/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.mahasiswawebappc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lab.phb.mahasiswawebappc.repo.MahasiswaRepo;

/**
 *
 * @author Ahmad Zaky
 */
@Controller
public class AppController {
    
    @Autowired
    private MahasiswaRepo mhsRepo;
    
    @RequestMapping("/home")
    public void index() {}
    
    @RequestMapping("/daftar-mahasiswa")
    public void getDaftarMahasiswa(Model model) {
        model.addAttribute("daftarMahasiswa",mhsRepo.findAll());
    }
    
}
