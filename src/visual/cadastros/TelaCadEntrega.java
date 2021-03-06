/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.cadastros;

import data.cliente.Cliente;
import data.cliente.ClienteDao;
import data.entrega.Entrega;
import data.entrega.EntregaDao;
import data.pedido.Pedido;
import data.pedido.PedidoDao;
import data.pedidoTemProduto.PedidoTemProduto;
import data.pedidoTemProduto.PedidoTemProdutoDao;
import data.pedidoTemProduto.PedidoTemProdutoTableModel;
import data.produto.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelson
 */
public class TelaCadEntrega extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadEntrega
     */
    private int codigoPedido;
    private double valorTotal=0;
    private String[] colunas = {"Codigo", "Produto", "Quantidade", "Valor"};
    private PedidoTemProdutoTableModel tableModel = new PedidoTemProdutoTableModel(colunas);

    public TelaCadEntrega() {
        initComponents();

        tablePedido.setModel(tableModel);
        btnConfirmar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedido = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoEntrega = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        planodefundolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Entrega - TradeTech 1.0");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Cod Pedido:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 70, 30);

        txtConsulta.setBackground(new java.awt.Color(18, 18, 20));
        txtConsulta.setForeground(new java.awt.Color(204, 204, 204));
        txtConsulta.setBorder(null);
        jPanel1.add(txtConsulta);
        txtConsulta.setBounds(90, 10, 100, 30);

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(18, 18, 20));
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setBorder(null);
        jPanel1.add(txtNome);
        txtNome.setBounds(20, 80, 170, 30);

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(18, 18, 20));
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setBorder(null);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(20, 140, 50, 30);

        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 40, 20);

        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("N:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 120, 20, 20);

        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 60, 60, 20);

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(18, 18, 20));
        txtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefone.setBorder(null);
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(240, 80, 120, 30);

        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setText("Bairro:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 120, 40, 20);

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(18, 18, 20));
        txtBairro.setForeground(new java.awt.Color(204, 204, 204));
        txtBairro.setBorder(null);
        jPanel1.add(txtBairro);
        txtBairro.setBounds(240, 140, 120, 30);

        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Cidade:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 120, 50, 20);

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(18, 18, 20));
        txtCidade.setForeground(new java.awt.Color(204, 204, 204));
        txtCidade.setBorder(null);
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCidade);
        txtCidade.setBounds(410, 140, 160, 30);

        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Endereço:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 60, 60, 20);

        txtEndereco.setEditable(false);
        txtEndereco.setBackground(new java.awt.Color(18, 18, 20));
        txtEndereco.setForeground(new java.awt.Color(204, 204, 204));
        txtEndereco.setBorder(null);
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(410, 80, 160, 30);

        jButton1.setBackground(new java.awt.Color(3, 62, 11));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(java.awt.SystemColor.control);
        jButton1.setText("Procurar");
        jButton1.setToolTipText("procurar pedido");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 10, 90, 30);

        tablePedido.setBackground(java.awt.Color.lightGray);
        tablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Produto", "Produto", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePedido.setGridColor(new java.awt.Color(0, 0, 0));
        tablePedido.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tablePedido);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 550, 140);

        btnConfirmar.setBackground(new java.awt.Color(3, 62, 11));
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfirmar.setForeground(java.awt.SystemColor.control);
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setToolTipText("Confirmar Entrega");
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(190, 390, 90, 40);

        jButton3.setBackground(new java.awt.Color(3, 62, 11));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(java.awt.SystemColor.control);
        jButton3.setText("Sair");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 390, 90, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(java.awt.Color.lightGray);
        jLabel9.setText("Cod Entrega");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 350, 80, 40);

        txtCodigoEntrega.setEditable(false);
        txtCodigoEntrega.setBackground(new java.awt.Color(18, 18, 20));
        txtCodigoEntrega.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoEntrega.setBorder(null);
        txtCodigoEntrega.setEnabled(false);
        txtCodigoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEntregaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoEntrega);
        txtCodigoEntrega.setBounds(480, 390, 90, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(java.awt.Color.lightGray);
        jLabel10.setText("Total a Pagar");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 350, 90, 40);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(18, 18, 20));
        txtTotal.setForeground(new java.awt.Color(204, 204, 204));
        txtTotal.setBorder(null);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(20, 390, 90, 40);

        jLabel11.setForeground(java.awt.Color.lightGray);
        jLabel11.setText("CEP:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 120, 30, 20);

        txtCep.setEditable(false);
        txtCep.setBackground(new java.awt.Color(18, 18, 20));
        txtCep.setForeground(new java.awt.Color(204, 204, 204));
        txtCep.setBorder(null);
        jPanel1.add(txtCep);
        txtCep.setBounds(100, 140, 90, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundocliente1.png"))); // NOI18N
        jLabel31.setText("jLabel30");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(0, 0, 590, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 70, 590, 440);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FotoJet (15).png"))); // NOI18N
        jLabel1.setText("Cadastro de Entrega:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 0, 330, 100);

        planodefundolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodefundoapp.png"))); // NOI18N
        planodefundolabel.setText("Fundo");
        getContentPane().add(planodefundolabel);
        planodefundolabel.setBounds(0, 0, 620, 540);

        setSize(new java.awt.Dimension(626, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validaConsulta()) {
            PedidoDao pedidoDao = new PedidoDao();
            String consulta = txtConsulta.getText();
            Pedido pedido = pedidoDao.consulta(consulta);
            if (pedido != null) {
                codigoPedido = pedido.getCodigo();
                PedidoTemProdutoDao pedidoTemProdutoDao = new PedidoTemProdutoDao();
                List<PedidoTemProduto> pedidoTemProdutos = pedidoTemProdutoDao.consultaPedido(pedido.getCodigo());

                ProdutoDao produtoDao = new ProdutoDao();

                for (int i = 0; i < pedidoTemProdutos.size(); i++) {
                    String produto = produtoDao.consulta(String.valueOf(pedidoTemProdutos.get(i).getCodigoProduto())).getNome();
                    pedidoTemProdutos.get(i).setProduto(produto);
                }

                tableModel.limpaTabela();
                tableModel.adicionaVariasLinhas(pedidoTemProdutos);

                setTxtValorTotal(tableModel.getValorTotal());

                ClienteDao clienteDao = new ClienteDao();
                Cliente cliente = clienteDao.consultaCodigo(pedido.getCodigoCliente());

                txtNome.setText(cliente.getNome());
                txtTelefone.setText(pedido.getTelefone());
                txtEndereco.setText(pedido.getLogradouro());
                txtNumero.setText(String.valueOf(pedido.getNumero()));
                txtCep.setText(pedido.getTelefone());
                txtBairro.setText(pedido.getTelefone());
                txtCidade.setText(pedido.getTelefone());

                EntregaDao entregaDao = new EntregaDao();
                txtCodigoEntrega.setText(String.valueOf(entregaDao.consultaProximoCodigo()));
                btnConfirmar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Pedido não encontrado");
                txtConsulta.requestFocus();
            }
            pedidoDao.desconectar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        EntregaDao entregaDao = new EntregaDao();
        Entrega entrega = new Entrega();
        PedidoDao pedidoDao = new PedidoDao();
        
        entrega.setCodigoPedido(codigoPedido);
        entrega.setValor(valorTotal);

        if (entregaDao.salvar(entrega) == 1) {
            if (pedidoDao.updade(codigoPedido, "Preparando envio") == 1) {
                JOptionPane.showMessageDialog(null, "Entrega salva");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salva a entrega");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salva a entrega");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCodigoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEntregaActionPerformed

    private boolean validaConsulta() {
        if (txtConsulta.getText().length() > 0) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Erro: Codigo invalido");
        txtConsulta.requestFocus();
        return false;
    }

    private void setTxtValorTotal(double valor) {
        txtTotal.setText(String.valueOf(valor).replace(".", ","));
        valorTotal = valor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel planodefundolabel;
    private javax.swing.JTable tablePedido;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigoEntrega;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
