import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


//!! aqui que roda a interface

public class GerenciadorContatosGUI extends JFrame implements ActionListener {
    private GerenciadorContatos gerenciador;
    private JTextField termoPesquisaTextField;
    private JTextArea resultadoTextArea;
    private JButton adicionarContatoButton;

    public GerenciadorContatosGUI() {
        gerenciador = new GerenciadorContatos();
        //a janela do gerenciador - Fazendeiro

        setTitle("Gerenciamento de Funcionários da Fazenda");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel pesquisaPanel = new JPanel();
        pesquisaPanel.setLayout(new FlowLayout());

        JLabel termoPesquisaLabel = new JLabel("Pesquisar Funcionários:");
        termoPesquisaTextField = new JTextField(20);
        JButton pesquisarButton = new JButton("Pesquisar");
        pesquisarButton.addActionListener(this);

        pesquisaPanel.add(termoPesquisaLabel);
        pesquisaPanel.add(termoPesquisaTextField);
        pesquisaPanel.add(pesquisarButton);

        add(pesquisaPanel, BorderLayout.NORTH);

        resultadoTextArea = new JTextArea();
        resultadoTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoTextArea);
        add(scrollPane, BorderLayout.CENTER);

        adicionarContatoButton = new JButton("Adicionar Funcionário");
        adicionarContatoButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(adicionarContatoButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            GerenciadorContatosGUI gui = new GerenciadorContatosGUI();
            gui.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Pesquisar")) {
            String termoPesquisa = termoPesquisaTextField.getText();
            List<ContatoAdicionais> contatosEncontrados = gerenciador.pesquisarContatos(termoPesquisa);

            if (contatosEncontrados.isEmpty()) {
                resultadoTextArea.setText("Nenhum funcionário encontrado");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Funcionários encontrados:\n");

                for (ContatoAdicionais contato : contatosEncontrados) {
                    sb.append("Nome: ").append(contato.getNome()).append("\n");
                    sb.append("Sobrenome: ").append(contato.getSobrenome()).append("\n");
                    sb.append("Número de Telefone: ").append(contato.getNumeroTelefone()).append("\n");
                    sb.append("Email: ").append(contato.getEmail()).append("\n");
                    sb.append("Cargo: ").append(contato.getCargo()).append("\n");
                    sb.append("Salário: ").append(contato.getSalario()).append("\n");
                    sb.append("Endereço: ").append(contato.getEndereco()).append("\n");
                    sb.append("Data de Nascimento: ").append(contato.getDataNascimento()).append("\n");
                    sb.append("\n");
                }

                resultadoTextArea.setText(sb.toString());
            }
        } else if (e.getActionCommand().equals("Adicionar Funcionário")) {
            AdicionarContatoDialog dialog = new AdicionarContatoDialog(this, gerenciador, resultadoTextArea);
            dialog.setVisible(true);
        }
    }
}

class AdicionarContatoDialog extends JDialog {
    private JTextField nomeTextField;
    private JTextField sobrenomeTextField;
    private JTextField numeroTelefoneTextField;
    private JTextField emailTextField;
    private JTextField cargoTextField;
    private JTextField salarioTextField;
    private JTextField enderecoTextField;
    private JTextField dataNascimentoTextField;
    private GerenciadorContatos gerenciador;
    private JTextArea resultadoTextArea;

    public AdicionarContatoDialog(JFrame parent, GerenciadorContatos gerenciador, JTextArea resultadoTextArea) {
        super(parent, "Adicionar Funcionário", true);
        setSize(300, 300);
        setLocationRelativeTo(parent);

        this.gerenciador = gerenciador;
        this.resultadoTextArea = resultadoTextArea;

        JPanel adicionarContatoPanel = new JPanel();
        adicionarContatoPanel.setLayout(new GridLayout(9, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeTextField = new JTextField();
        JLabel sobrenomeLabel = new JLabel("Sobrenome:");
        sobrenomeTextField = new JTextField();
        JLabel numeroTelefoneLabel = new JLabel("Número de Telefone:");
        numeroTelefoneTextField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();
        JLabel cargoLabel = new JLabel("Cargo:");
        cargoTextField = new JTextField();
        JLabel salarioLabel = new JLabel("Salário:");
        salarioTextField = new JTextField();
        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoTextField = new JTextField();
        JLabel dataNascimentoLabel = new JLabel("Data de nascimento:");
        dataNascimentoTextField = new JTextField();
        //labels e inputs do usuário

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String sobrenome = sobrenomeTextField.getText();
                String numeroTelefone = numeroTelefoneTextField.getText();
                String email = emailTextField.getText();
                String cargo = cargoTextField.getText();
                String salario = salarioTextField.getText();
                String endereco = enderecoTextField.getText();
                String dataNascimento = dataNascimentoTextField.getText();

                ContatoAdicionais contatoAdicionais = new ContatoAdicionais(nome, sobrenome, numeroTelefone, email, cargo, salario, endereco, dataNascimento);
                gerenciador.adicionarContato(contatoAdicionais);
                resultadoTextArea.setText("Funcionário: " + email + ", com a função: "+ cargo + " adicionado com sucesso!");
                //resposta de cadastro para o usuario

                dispose();
            }
        });

        adicionarContatoPanel.add(nomeLabel);
        adicionarContatoPanel.add(nomeTextField);
        adicionarContatoPanel.add(sobrenomeLabel);
        adicionarContatoPanel.add(sobrenomeTextField);
        adicionarContatoPanel.add(numeroTelefoneLabel);
        adicionarContatoPanel.add(numeroTelefoneTextField);
        adicionarContatoPanel.add(emailLabel);
        adicionarContatoPanel.add(emailTextField);
        adicionarContatoPanel.add(cargoLabel);
        adicionarContatoPanel.add(cargoTextField);
        adicionarContatoPanel.add(salarioLabel);
        adicionarContatoPanel.add(salarioTextField);
        adicionarContatoPanel.add(enderecoLabel);
        adicionarContatoPanel.add(enderecoTextField);
        adicionarContatoPanel.add(dataNascimentoLabel);
        adicionarContatoPanel.add(dataNascimentoTextField);
        adicionarContatoPanel.add(confirmarButton);

        add(adicionarContatoPanel);
        //interface (labels e campos de texto) sendo adicionada ao painel de exposição do contato
    }
}

