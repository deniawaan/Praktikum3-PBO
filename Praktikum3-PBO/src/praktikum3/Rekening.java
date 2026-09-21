/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// DeniSeptiawan_L0325020
package praktikum3;

/**
 *
 * @author HP
 */
public class Rekening {

    String nomorRekening;
    String namaNasabah;
    double saldo;

    public Rekening(String nomorRekening, String namaNasabah, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    public void tarikTunai(double jumlah) throws SaldoTidakMencukupiException {

        if (jumlah > saldo) {
            throw new SaldoTidakMencukupiException(
                "Saldo tidak mencukupi untuk melakukan penarikan."
            );
        }

        saldo = saldo - jumlah;

        System.out.println("===== STRUK PENARIKAN =====");
        System.out.println("Nama Nasabah : " + namaNasabah);
        System.out.println("No. Rekening : " + maskingNomorRekening());
        System.out.println("Jumlah Tarik : Rp" + jumlah);
        System.out.println("Sisa Saldo   : Rp" + saldo);
        System.out.println("===========================");
    }

    public String maskingNomorRekening() {

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < nomorRekening.length(); i++) {
            if (i < 5) {
                hasil.append(nomorRekening.charAt(i));
            } else {
                hasil.append("*");
            }
        }

        return hasil.toString();
    }
}