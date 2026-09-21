/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author HP
 */
// DeniSeptiawan_L0325020
public class MainBank {

    public static void main(String[] args) {

        Rekening rekening = new Rekening(
            "1234567890",
            "Deni Septiawan",
            1000000
        );

        try {
            rekening.tarikTunai(400000);
            rekening.tarikTunai(700000);

        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());

        } finally {
            System.out.println("Transaksi selesai diproses.");
            System.out.println(
                "Nomor Rekening: " + rekening.maskingNomorRekening()
            );
        }
    }
}