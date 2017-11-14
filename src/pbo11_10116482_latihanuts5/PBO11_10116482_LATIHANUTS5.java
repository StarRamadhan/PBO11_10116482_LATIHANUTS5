/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo11_10116482_latihanuts5;

/**
 *
 * @author Star Ramadhan
 */
public class PBO11_10116482_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang obJajarGenjang = new JajarGenjang(50, 60, 70, 80, 100, 120);
        Segitiga obSegitiga = new Segitiga(50, 60, 70, 100, 120);
        obJajarGenjang.hitungKeliling();
        obJajarGenjang.hitungLuas();
        obSegitiga.hitungKeliling();
        obSegitiga.hitungLuas();
    }
    
}
