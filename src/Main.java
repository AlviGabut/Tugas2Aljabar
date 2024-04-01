import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        int[][] Matriks = {
                {0, 2, -1},
                {7, 4, 3},
                {6, 5, 2}
        };

        int[][] MatriksAsli = {
                {0, 2, -1},
                {7, 4, 3},
                {6, 5, 2}
        };

        System.out.print("\nSelamat datang di Penghitung Aljabar Linear dan Matriks Tugas ke 2!\n");
        System.out.print("Masukkan NIM akhirmu (1 digit): ");
        Matriks[0][0] = input.nextInt();
        MatriksAsli[0][0] = Matriks[0][0];

        System.out.println("\nMatriks A: ");
        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                System.out.print(Matriks[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nJawaban no 1:");
        System.out.println("\nMinor elemen matriks:");
        //M11
        int m11first = 1;
        int m11second = 1;
        //M12
        int m12first = 1;
        int m12second = 1;
        int hitunganm12 = 1;
        //M13
        int m13first = 1;
        int m13second = 1;
        int hitunganm13 = 1;
        //M21
        int m21first = 1;
        int m21second = 1;
        int hitunganm21 = 1;
        //M22
        int m22first = 1;
        int m22second = 1;
        int hitunganm22 = 1;
        //M23
        int m23first = 1;
        int m23second = 1;
        int hitunganm23 = 1;

        //M31
        int m31first = 1;
        int m31second = 1;
        int hitunganm31 = 1;
        //M32
        int m32first = 1;
        int m32second = 1;
        int hitunganm32 = 1;
        //M33
        int m33first = 1;
        int m33second = 1;
        int hitunganm33 = 1;

        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                //M11
                if(i != 0 && j != 0) {
                    if(i != j) {;
                        m11second *= Matriks[i][j];
                    }else {;
                        m11first *= Matriks[i][j];
                    }

                }
                //M12
                if(i != 0 && j != 1) {
                    if(hitunganm12 == 1 || hitunganm12 == 4) {
                        m12first *= Matriks[i][j];
                        hitunganm12++;
                    }else if(hitunganm12 == 2 || hitunganm12 == 3) {
                        m12second *= Matriks[i][j];
                        hitunganm12++;
                    }
                }

                //M13
                if(i != 0 && j != 2) {
                    if(hitunganm13 == 1 || hitunganm13 == 4) {
                        m13first *= Matriks[i][j];
                        hitunganm13++;
                    }else if(hitunganm13 == 2 || hitunganm13 == 3) {
                        m13second *= Matriks[i][j];
                        hitunganm13++;
                    }
                }

                //M21
                if(i != 1 && j != 0) {
                    if(hitunganm21 == 1 || hitunganm21 == 4) {
                        m21first *= Matriks[i][j];
                        hitunganm21++;
                    }else if(hitunganm21 == 2 || hitunganm21 == 3) {
                        m21second *= Matriks[i][j];
                        hitunganm21++;
                    }
                }

                //M22
                if(i != 1 && j != 1) {
                    if(hitunganm22 == 1 || hitunganm22 == 4) {
                        m22first *= Matriks[i][j];
                        hitunganm22++;
                    }else if(hitunganm22 == 2 || hitunganm22 == 3) {
                        m22second *= Matriks[i][j];
                        hitunganm22++;
                    }
                }

                //M23
                if(i != 1 && j != 2) {
                    if(hitunganm23 == 1 || hitunganm23 == 4) {
                        m23first *= Matriks[i][j];
                        hitunganm23++;
                    }else if(hitunganm23 == 2 || hitunganm23 == 3) {
                        m23second *= Matriks[i][j];
                        hitunganm23++;
                    }
                }

                //M31
                if(i != 2 && j != 0) {
                    if(hitunganm31 == 1 || hitunganm31 == 4) {
                        m31first *= Matriks[i][j];
                        hitunganm31++;
                    }else if(hitunganm31 == 2 || hitunganm31 == 3) {
                        m31second *= Matriks[i][j];
                        hitunganm31++;
                    }
                }

                //M32
                if(i != 2 && j != 1) {
                    if(hitunganm32 == 1 || hitunganm32 == 4) {
                        m32first *= Matriks[i][j];
                        hitunganm32++;
                    }else if(hitunganm32 == 2 || hitunganm32 == 3) {
                        m32second *= Matriks[i][j];
                        hitunganm32++;
                    }
                }

                //M33
                if(i != 2 && j != 2) {
                    if(hitunganm33 == 1 || hitunganm33 == 4) {
                        m33first *= Matriks[i][j];
                        hitunganm33++;
                    }else if(hitunganm33 == 2 || hitunganm33 == 3) {
                        m33second *= Matriks[i][j];
                        hitunganm33++;
                    }
                }
            }
        }

        String M11 = "M11 = " + m11first + " - " + m11second + " = " + (m11first - m11second);
        Matriks[0][0] = m11first-m11second;
        String M12 = "M12 = " + m12first + " - " + m12second + " = " + (m12first - m12second);
        Matriks[0][1] = m12first-m12second;
        String M13 = "M13 = " + m13first + " - " + m13second + " = " + (m13first - m13second);
        Matriks[0][2] = m13first-m13second;

        String M21 = "M21 = " + m21first + " - " + m21second + " = " + (m21first - m21second);
        Matriks[1][0] = m21first-m21second;
        String M22 = "M22 = " + m22first + " - " + m22second + " = " + (m22first - m22second);
        Matriks[1][1] = m22first-m22second;
        String M23 = "M23 = " + m23first + " - " + m23second + " = " + (m23first - m23second);
        Matriks[1][2] = m23first-m23second;

        String M31 = "M31 = " + m31first + " - " + m31second + " = " + (m31first - m31second);
        Matriks[2][0] = m31first-m31second;
        String M32 = "M32 = " + m32first + " - " + m32second + " = " + (m32first - m32second);
        Matriks[2][1] = m32first-m32second;
        String M33 = "M33 = " + m33first + " - " + m33second + " = " + (m33first - m33second);
        Matriks[2][2] = m33first-m33second;

        System.out.printf("%-25s | %-25s | %-25s\n", M11, M12, M13);
        System.out.printf("%-25s | %-25s | %-25s\n", M21, M22, M23);
        System.out.printf("%-25s | %-25s | %-25s", M31, M32, M33);


        System.out.println("\n\n\na. Menghitung determinan dengan kofaktor:\n");
        System.out.printf("%-6s = a11.C11 + a12.C12 + a13.C13\n", "det(A)");
        int Det11 = MatriksAsli[0][0] * (m11first-m11second);
        int Det12 = ((-1) * MatriksAsli[0][1]) * (m12first-m12second);
        int Det13 = MatriksAsli[0][2] * (m13first-m13second);
        int determinanA = Det11 + Det12 + Det13;
        System.out.printf("%-6s = (%d x %d) + (%d x %d) + (%d x %d)\n", "", MatriksAsli[0][0], (m11first-m11second), ((-1) * MatriksAsli[0][1]), (m12first-m12second), MatriksAsli[0][2], (m13first-m13second));
        System.out.printf("%-6s = %d + %d + %d\n", "", Det11, Det12, Det13);
        System.out.printf("%-6s = %d\n", "det(A)", determinanA);

        System.out.println("\n\nb. Mencari Matriks Kofaktor dari Matriks A: \n");
        System.out.printf("%-6s = %-4s %-4s %-4s\n%-6s   %-4s %-4s %-4s\n%-6s   %-4s %-4s %-4s\n", "kof(A)", "+M11", "-M12", "+M13", "", "-M21", "+M22", "-M23", "", "+M31", "-M32", "+M33");

        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                if(i == 0 && j == 1 || i == 1 && j == 0 || i == 1 && j == 2 || i == 2 && j == 1) {
                    Matriks[i][j] *= -1;
                }
            }
        }

        System.out.printf("%-6s = ", "");
        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                System.out.printf("%-6d ", Matriks[i][j]);
            }
            System.out.printf("\n%-6s   ", "");
        }

        System.out.println("\n\nc. Mencari balikan (invers) dari Matriks diatas:\n");
        System.out.printf("%-6s = ", "adj(A)");
        int[][] MatriksBalikan = new int[3][3];
        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                MatriksBalikan[j][i] = Matriks[i][j];
            }
        }

        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                System.out.printf("%-4d ", MatriksBalikan[i][j]);
            }
            System.out.printf("\n%-6s   ", "");
        }

        System.out.printf("\n%-6s = 1/det(A) x adj(A)", "A^-1");
        System.out.printf("\n%-6s = 1/%-5d x  ", "", determinanA);
        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                System.out.printf("%-4d ", MatriksBalikan[i][j]);
            }
            System.out.printf("\n%-6s              ", "");
        }
        System.out.printf("\n%-6s = ", "A^-1");
        for (int i = 0; i < Matriks.length; i++) {
            for (int j = 0; j < Matriks.length; j++) {
                System.out.printf("%-3d/%-4d    ", MatriksBalikan[i][j], determinanA);
            }
            System.out.printf("\n%-7s  ", "");
        }

        System.out.printf("\n\n\n%-6s - ^ adalah pangkat\n%-6s - / adalah pecahan\n%-6s - Tambahkan kurung sendiri untuk matriks 3x3 nya\n%-6s - Untuk yg c, misal hasilnya -7/-45 bisa ditulis 7/45. Jadi jika (-)/(-), bisa diubah ke (+)/(+)\n", "Note:", "", "", "");
    }
}