package br.edu.etec.lojainformatica;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class TelaDeCadastro extends JPanel{

	JPanel painelDeBotoes = new JPanel();
	JPanel painelParaCampos = new JPanel();
	JPanel painelListagem = new JPanel();
	JButton btnSalvar = new JButton("Salvar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnListar = new JButton("Listar");
	JButton btnAlterar = new JButton("Alterar");
	JTextField txtId = new JTextField("Digite Id Para Alterar");
	
	public TelaDeCadastro(int nLinhas,int nColunas){
		BorderLayout boderLayout = new BorderLayout();
		this.setLayout(boderLayout);
		
		GridLayout layoutParaCampos = new GridLayout(nLinhas,nColunas);
		painelParaCampos.setLayout(layoutParaCampos);
		this.add(painelParaCampos, BorderLayout.CENTER);
	}
	
}
