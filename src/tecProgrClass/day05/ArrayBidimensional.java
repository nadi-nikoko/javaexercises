package tecProgrClass.day05;

import java.util.Scanner;

public class ArrayBidimensional {
    // dichiaro array bidimensionale
    static int tabella[][];
    static int dimc, dimr;
    // int[][] tabella;

    public static void main(String[] args) {
        // inizio gestione camere
        Scanner input = new Scanner(System.in);
        // chiedo numero camere
        System.out.print("ins numero righe: ");
        dimr = input.nextInt();
        System.out.print("ins numero colonne: ");
        dimc = input.nextInt();
        // creo array dimensionato numcamere tutti 0 come numero guest
        tabella = new int[dimr][dimc];
        /*
         * inserire in diagonale tutti 1
         * 1 0 0 0 0 tabella[0][0] =1
         * 0 1 0 0 0 tabella[1][1] =1
         * 0 0 1 0 0 tabella[2][2] =1
         * 0 0 0 1 0 tabella[3][3] =1
         * 0 0 0 0 1 tabella[4][4] =1
         */
        printTabella();
        setDiagonale(5);
        printTabella();
        setRigaValore(2, 7);
        setColonnaValore(1, 12);
        printTabella();
    }

    static void setRigaValore(int riga, int valore) {
        // veirifco riga che abbia senso
        if (riga <= dimr && riga > 0) {
            for (int c = 0; c < dimc; c++) { // riga alla umana togliere 1
                tabella[riga - 1][c] = valore;
            }
        }
    }

    static void setColonnaValore(int colonna, int valore) {
        // veirifco riga che abbia senso
        if (colonna <= dimr && colonna > 0) {
            for (int r = 0; r < dimr; r++) {
                tabella[r][colonna - 1] = valore;
            }
        }
    }

    static void printTabella() {
        System.out.println();
        for (int r = 0; r < dimr; r++) { // ciclo le righe
            for (int c = 0; c < dimc; c++) {
                String tx = "    " + tabella[r][c]; // " 12"
                int start = tx.length() - 4; // 6-4 =2 inizio a prendere substr
                System.out.print(tx.substring(start));// stampo a partire da carattere 2
            }
            System.out.println();
        }

    }

    static void setDiagonale(int valore) {
        // stampo solo fino alla fine della dimensione piu' piccola
        /*
         * if (dimr < dimc) {
         * for (int i = 0; i < dimr; i++) {
         * tabella[i][i] = valore;
         * }
         * } else {
         * for (int i = 0; i < dimc; i++) {
         * tabella[i][i] = valore;
         * }
         * 
         * }
         */
        // verifico dimensione maggiore e salvo in dim 8X3 dim=8
        int dim = Math.max(dimr, dimc);
        // scorro come se fosse quadrata
        // uso il resto della divisione tra i che si incrementa
        // e la dimensione della tabella
        // quando sfora prendo sempre il resto della divisione
        // che corrsponde all'indice della riga o colonna
        for (int i = 0; i < dim; i++) { // 8X4
            int r = i % dimr; // i=6 - riga =6 modulo 8 = 6 = c
            int c = i % dimc;// i=6 - colonna = 6 modulo 4 = 2 = r
            tabella[r][c] = valore;
        }

    }

}