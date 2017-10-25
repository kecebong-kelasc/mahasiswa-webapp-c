/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.mahasiswawebappc.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ahmad Zaky
 */


@Entity
public class Mahasiswa {
    
    @Id @Getter @Setter
    private String nim;

    @Column @Getter @Setter
    private String nama;
    
    @Column @Getter @Setter
    private String jurusan;

    
    
}
