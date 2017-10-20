/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.mahasiswawebappc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahmad Zaky
 */
@Controller
public class AppController {
    @RequestMapping("/home")
    public void index() {}
    
}
