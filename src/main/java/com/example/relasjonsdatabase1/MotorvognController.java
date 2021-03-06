package com.example.relasjonsdatabase1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotorvognController {

    @Autowired
    private MotorvognRepository rep;

    @GetMapping("/hentBiler")
    public List<com.example.relasjonsdatabase1.Bil> hentBiler() { return rep.hentAlleBiler(); }

    @PostMapping("/lagre")
    public void lagre(com.example.relasjonsdatabase1.Motorvogn bil) {
        rep.lagreMotorvogn(bil);
    }

    @GetMapping("/hentAlle")
    public List<com.example.relasjonsdatabase1.Motorvogn> hentAlle() { return rep.hentAlleMotorvogner(); }

    @GetMapping("/henteEnMotorvogn")
    public Motorvogn henteEnMotorvogn(int id) { return rep.henteEnMotorvogn(id); }

    @PostMapping("/endre")
    public void endre(Motorvogn motorvogn) { rep.endreMotorvogn(motorvogn); }

    @GetMapping("/slettEnMotorvogn")
    public void slettEnMotorvogn(long personnr) {
        rep.slettEnMotorvogn(personnr);
    }

    @GetMapping("/slettAlle")
    public void slettAlle() { rep.slettAlleMotorvogner(); }
}
