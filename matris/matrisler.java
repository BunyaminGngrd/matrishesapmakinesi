import javax.swing.JOptionPane;

public class matrisler {

    public static void main(String[] args) {

        float[][] matris = new float[3][3];
        float[][] matris2 = new float[3][3];
        float[][] sonucMatrisi = new float[3][3];
        float ozel, sayi, sonuc;
        int secim;
        int a = 0;

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                matris[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "3x3 'lük matrisin " + (i + 1) + "x" + (j + 1) + " değerini giriniz."));

            }

        }
        secim = Integer.parseInt(JOptionPane.showInputDialog(null,
                " [1]-Matris Üzerinde Toplama İşlemi \n [2]-Matris Üzerinde Çıkarma İşlemi \n [3]-Matris Üzerinde Çarpma İşlemi \n [4]-Matrisi Herhangi Bir Sabit İle Çarpma \n [5]-Matrisin Determinantını Hesaplama \n [6]-Matrisin Tersini Alma \n [7]-Matrisin İnovatif Olup Olmadığını Sorgulama "));

       switch (secim) {

        case 1:
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    matris2[i][j] = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Toplamak istediginiz 2. (3x3) 'lük matrisin ("
                                    + (i + 1) + "x" + (j + 1) + "). değerini giriniz."));

                }

            }
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    sonucMatrisi[i][j] = matris[i][j] + matris2[i][j];

                }

            }

            ozel = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " [1]-Sonuç matrisinde özel değer araması. \n [2]-Sonuç matrisinin hepsini göster. "));

            if (ozel == 1) {
                int i, j;

                i = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere i degerini giriniz "));
                j = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere j degerini giriniz "));

                JOptionPane.showMessageDialog(null, "Sonuc matrisinizin (" + (i + 1) + "x" + (j + 1) + "). degeri "
                        + sonucMatrisi[i - 1][j - 1]);

            } else if (ozel == 2) {
                for (int i = 0; i <= 2; i++) {

                    for (int j = 0; j <= 2; j++) {

                        JOptionPane.showMessageDialog(null, "(3x3) 'lük sonuç matrisinizin (" + (i + 1) + "x"
                                + (j + 1) + "). degeri " + sonucMatrisi[i][j]);

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Hatalı değer girişi.");
            }

            break;
             case 2:
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    matris2[i][j] = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Çıkarmak istediginiz 2. (3x3) 'lük matrisin ("
                                    + (i + 1) + "*" + (j + 1) + "). değerini giriniz."));

                }

            }
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    sonucMatrisi[i][j] = matris[i][j] - matris2[i][j];

                }

            }

            ozel = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " [1]-Sonuç matrisinde özel değer araması. \n [2]-Sonuç matrisinin hepsini göster. "));

            if (ozel == 1) {
                int i, j;

                i = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere i degerini giriniz "));
                j = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere j degerini giriniz "));

                JOptionPane.showMessageDialog(null, "Sonuc matrisinizin (" + (i + 1) + "x" + (j + 1) + "). degeri "
                        + sonucMatrisi[i - 1][j - 1]);

            } else if (ozel == 2) {
                for (int i = 0; i <= 2; i++) {

                    for (int j = 0; j <= 2; j++) {

                        JOptionPane.showMessageDialog(null, "(3x3) 'lük sonuç matrisinizin (" + (i + 1) + "*"
                                + (j + 1) + "). degeri " + sonucMatrisi[i][j]);

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Hatalı değer girişi.");
            }
            break;
         case 3:
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    matris2[i][j] = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Çarpmak istediginiz 2. (3x3) 'lük matrisin ("
                                    + (i + 1) + "x" + (j + 1) + "). değerini giriniz."));

                }

            }
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    sonucMatrisi[i][j] = matris[i][j] * matris2[i][j];

                }

            }

            ozel = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " [1]-Sonuç matrisinde özel değer araması. \n [2]-Sonuç matrisinin hepsini göster. "));

            if (ozel == 1) {
                int i, j;

                i = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere i degerini giriniz "));
                j = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Görmek istediginiz degerin [i]x[j] olmak üzere j degerini giriniz "));

                JOptionPane.showMessageDialog(null, "Sonuc matrisinizin (" + (i + 1) + "x" + (j + 1) + "). degeri "
                        + sonucMatrisi[i - 1][j - 1]);

            } else if (ozel == 2) {
                for (int i = 0; i <= 2; i++) {

                    for (int j = 0; j <= 2; j++) {

                        JOptionPane.showMessageDialog(null, "(3x3) 'lük sonuç matrisinizin (" + (i + 1) + "x"
                                + (j + 1) + "). degeri " + sonucMatrisi[i][j]);

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Hatalı değer girişi.");
            }
            break;
case 4:
            sayi = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Matrisi çarpmak isteginiz sabit sayıyı giriniz "));

            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    sonucMatrisi[i][j] = matris[i][j] * sayi;
                }

            }
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {

                    JOptionPane.showMessageDialog(null, "(3x3) 'lük sonuç matrisinizin (" + (i + 1) + "x"
                            + (j + 1) + "). degeri " + sonucMatrisi[i][j]);

                }

            }

        break;
         case 5:
        sonuc = ((matris[0][0] * matris[1][1] * matris[2][2]) + (matris[0][1] * matris[1][2] * matris[2][0]) + (matris[0][2] * matris[1][0] * matris[2][1]))
    - ((matris[0][2] * matris[1][1] * matris[2][0]) + (matris[0][0] * matris[1][2] * matris[2][1])
          + (matris[0][1] * matris[1][0] * matris[2][2]));
            JOptionPane.showMessageDialog(null, "(3x3)'lük matrisinizin determinantı " + sonuc);
        break;

case 6:
            sonuc = ((matris[0][0] * matris[1][1] * matris[2][2]) + (matris[0][1] * matris[1][2] * matris[2][0])
                    + (matris[0][2] * matris[1][0] * matris[2][1]))
                    - ((matris[0][2] * matris[1][1] * matris[2][0]) + (matris[0][0] * matris[1][2] * matris[2][1]) + (matris[0][1] * matris[1][0] * matris[2][2]));
            float g00 = matris[0][0];
            float g01 = matris[0][1];
            float g02 = matris[0][2];
            float g10 = matris[1][0];
            float g11 = matris[1][1];
            float g12 = matris[1][2];
            float g20 = matris[2][0];
            float g21 = matris[2][1];
            float g22 = matris[2][2];
            if (sonuc == 0) {
                JOptionPane.showMessageDialog(null, "Determinantınız '0' olduğu için matrisinizin tersi yoktur.");
            } else {

                matris[0][0] = ((g11 * g22) - (g12 * g21)) / (sonuc);
                matris[0][1] = (((g10 * g22) - (g12 * g20)) * (-1)) / (sonuc);
                matris[0][2] = ((g10 * g21) - (g11 * g20)) / (sonuc);
                matris[1][0] = (((g01 * g22) - (g21 * g02)) * (-1)) / (sonuc);
                matris[1][1] = ((g00 * g22) - (g02 * g20)) / (sonuc);
                matris[1][2] = (((g00 * g21) - (g01 * g20)) * (-1)) / (sonuc);
                matris[2][0] = ((g01 * g12) - (g11 * g02)) / (sonuc);
                matris[2][1] = (((g00 * g12) - (g02 * g10)) * (-1)) / (sonuc);
                matris[2][2] = ((g11 * g00) - (g01 * g10)) / (sonuc);

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        JOptionPane.showMessageDialog(null,
                                "Matrisinizin " + ((i + 1) + "x" + (j + 1)) + ". Degeri " + matris[i][j]);
                    }

                }

            }

            break;
            case 7:

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    sonucMatrisi[i][j] = 0;

                    for (int k = 0; k < 3; k++) {
                        sonucMatrisi[i][j] += matris[i][k] * matris[k][j];

                       
                    }

                }

            }

            if (sonucMatrisi[0][0]==1&&sonucMatrisi[0][1]==0&&sonucMatrisi[0][2]==0&&sonucMatrisi[1][0]==0&&sonucMatrisi[1][1]==1&&sonucMatrisi[1][2]==0&&sonucMatrisi[2][0]==0&&sonucMatrisi[2][1]==0&&sonucMatrisi[2][2]==1) {

                JOptionPane.showMessageDialog(null, "Matrisiniz involutifdir.");
            } else {
                JOptionPane.showMessageDialog(null, "Matrisiniz involutif degildir.");

            }

        break;
    }
}
}