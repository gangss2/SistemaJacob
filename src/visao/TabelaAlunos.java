
package visao;

import ControleAluno.txt;
import java.util.Locale;


public class TabelaAlunos extends javax.swing.JInternalFrame {

    
    public TabelaAlunos() {
        initComponents();
        setDefaultLocale(Locale.UK);
        ControleAluno.Aluno.TabelaA(tabela1, txt.listaAluno);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Lista de nota dos alunos");
        getContentPane().setLayout(null);

        tabela1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Aluno", "Nome do Prof", "Turma", "Turno", "Sala", "Curso", "Disciplina", "Primeira nota", "Segunda nota", "Terceira nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela1);
        if (tabela1.getColumnModel().getColumnCount() > 0) {
            tabela1.getColumnModel().getColumn(0).setResizable(false);
            tabela1.getColumnModel().getColumn(1).setResizable(false);
            tabela1.getColumnModel().getColumn(2).setResizable(false);
            tabela1.getColumnModel().getColumn(3).setResizable(false);
            tabela1.getColumnModel().getColumn(4).setResizable(false);
            tabela1.getColumnModel().getColumn(5).setResizable(false);
            tabela1.getColumnModel().getColumn(6).setResizable(false);
            tabela1.getColumnModel().getColumn(7).setResizable(false);
            tabela1.getColumnModel().getColumn(8).setResizable(false);
            tabela1.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 990, 580);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("                  LISTA DE NOTAS DOS ALUNOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 20, 430, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3D_HD (195).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 990, 670);

        setBounds(100, 50, 988, 668);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables
}
