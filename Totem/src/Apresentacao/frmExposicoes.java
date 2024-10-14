
package Apresentacao;

import java.awt.Image;
import javax.swing.JPanel;


public class frmExposicoes extends javax.swing.JDialog {

    public frmExposicoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpPrincipal = new javax.swing.JTabbedPane();
        pnl1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scp2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnProximo1 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pnl4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pnl5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        tbpPrincipal.setForeground(new java.awt.Color(51, 255, 255));

        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem1300x300.png"))); // NOI18N
        pnl1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("A  ideia  de  colonizar  Marte   pode  parecer  algo inalcançável   ou  até  mesmo ficção,  mas  Cada vez  pesquisas são\nrealizadas para a  colonização de Marte sendo  cada vez mais levadas a sério, considerando. Marte como um dos planetas \npara estabelecermos nossa primeira colônia interplanetária ,com  todo  o  avanço  tecnocientífico  essas  ideias  antes  fora \nde  realidade, estão se torna cada vez mais possíveis .A ideia de colonizar outro planeta passa, entre outras coisas, por um \nprocesso hipotético que teve sua origem na ficção científica (BROWN,1993), chamado de \nTerraformação (WILLIAMSON,1942). Todavia  a colonização  à  Marte  possui   diversos  obstáculos  e  necessitará  de \ncada vez mais avanços para efetuar uma missão desse porte (ZUBRIN, 2011).\nEm  1961,   o  astrofísico  Carl  Sagan publicou na revista Science um artigo sobre a possibilidade de aplicação de \nengenharia planetária para  reduzir  o  efeito  estufa  da  atmosfera  de  Vênus  até  \nníveis  confortáveis  para  o  ser  humano. Provando  que  a  Biosfera  de  um  planeta  pode  ser  \nmodificada (FOGG, 1998).\n\nAcredita-se que  devemos  colonizar  Marte  para  explorar  seus  recursos  naturais,  pois  a  Terra  é  finita e futuramente, \nos recursos naturais se esgotarão e quando isso acontecer teremos que nos voltar para o espaço para conseguir mais \n(FOGG, 1998) e para preservar nossa espécie.Segundo estudos realizados por cientistas,com as mudanças climáticas \nque vem ocorrendo será necessário \na habitar outro planeta.\n");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setHighlighter(null);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        scp2.setViewportView(jTextArea1);

        pnl1.add(scp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 1022, 363));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Importância da colonização de marte");
        pnl1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 555, 39));

        btnProximo1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        btnProximo1.setText(">");
        btnProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximo1ActionPerformed(evt);
            }
        });
        pnl1.add(btnProximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 500, 130, 74));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exposicao2.jpg"))); // NOI18N
        Back.setToolTipText("");
        pnl1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -270, -1, 1590));

        tbpPrincipal.addTab("A colonização de Marte", pnl1);

        pnl2.setBackground(new java.awt.Color(255, 55, 51));
        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem2300x300.png"))); // NOI18N
        pnl2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 360, 230));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Vale destacar o Sojourner, nome dado em homenagem a americana Sojourner Truth (1797-1883), uma abolicionista e ativista\ndos direitos das mulheres. O pequeno rover que com apenas 11,5 kg pousou em Marte em 4 de julho de 1997, visando um\ncusto baixo para esta missão devido o pós-guerra fria com a Russia onde os investimentos em missões já não era mais tão\nfácil se justificar o projeto Mars Pathfinder levou apenas 3 anos para sua criação e um custo total de 265 milhões de dólares\ne foi lançado em 4 de Dezembro de 1996 e era dotado de um sistema de cruzeiro e veículo de entrada com sistema de\npouso. O veículo de entrada chamada também de Aeroshell era composto por 3 partes distintas: Backshell, Lander e escudo\nde calor, com seu sistema de pétalas possibilitaria a abertura indiferente de sua posição durante o pouso.\nO Sojourner foi o primeiro rover a andar na superfície de outro planeta sem precisar de qualquer tipo de conexão com o \nlander.\nO rover Solourner não se comunicava com a Terra, ele necessitava do lander para converter toda informação coletada e \nassim enviar todos dados a base na Terra.\nO lander era equipado com seus pontos eletrônicos no centro e que efetuado o pouso e aberto as pétalas liberando o rover\nSojourner o equipamento estavam aptos a iniciar seus trabalhos.\n");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setOpaque(false);
        jTextArea2.setRequestFocusEnabled(false);
        jTextArea2.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea2);

        pnl2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 1043, 290));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sojourner");
        pnl2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 125, 66));

        jButton2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnl2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 420, 170, 74));

        jButton6.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnl2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 170, 74));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exposicao1.jpg"))); // NOI18N
        pnl2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tbpPrincipal.addTab("Sojourner", pnl2);

        pnl3.setBackground(new java.awt.Color(255, 55, 51));
        pnl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Os veículos robóticos Spirit e Opportunity são gêmeos indenticos sendo o Spirit lançado em 10 de Junho de 2003 tendo sua chegada em \nMarte em 4 de janeiro de 2004 enquanto o Opportunity foi lançado em 7 de julho de 2003 tendo sua chegada em 25 de janeiro de 2004. \nAmbos os veículos robóticos foram enviados para Marte pela NASA em uma missão de 90 dias para o propósito de buscas geológicas em \nrelação a possível evidência de água liquida em solo marciano, uma vez que há pista de que Marte fora inundado de água no passado e \npode sim ter criado muitos ambientes que propiciariam a existência de vida.O veículo robótico Spirit pousou cerca de 2,5 longe de rota \ntendo que caminha sobre solo marciano para que pudesse voltar ao seu ponto planejado de missão, neste trajeto escalou grandes rochas\no que acabou tendo grandes descobertas de sua geologia e foi a primeira evidência de existência de água em solo marciano, durante o \ntrajeto o rover pode inspecionar 6 diferentes tipos de rocha onde os cientista puderam verificar que o solo era muito quente e continua \nmuitos vulcões com explosões violentas e pode se verificar que no passado água em forma de nascentes de água quente \ndeixaram marcas nas rochas, o maior exemplo foi o mineral goethita que se forma na presença de água.\nAssim como seu irmão gêmeo, o Opportunity também encontrou evidência de água, porém esta com níveis de ácidos muito forte o que \nse tornaria um ambiente inviável para ser habitat para forma de vida microbiana. O Opportunity fez grandes descobertas como os \nfragmentos de hematita em uma grande área elevando a crença de presença de água.\nTanto o Spirit como o Opportunity fizeram grandes descobertas, porém as esferas encontradas pelo veículo robótico Opportunity foram \nas mais relevantes e misteriosas, essas esferas ficaram conhecidas como “blueberries” o que ressalva que Marte foi úmido já que as tais\n esferas medindo cerca de 3 mm foram formadas por água dentro de rochas e possui alta concentração de ferro.\n");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setFocusable(false);
        jTextArea3.setOpaque(false);
        jTextArea3.setRequestFocusEnabled(false);
        jTextArea3.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(jTextArea3);

        pnl3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 1010, 313));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem3300x300.png"))); // NOI18N
        pnl3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 221));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem4.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        pnl3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 360, 230));

        jLabel7.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Spirit e Opportunity");
        pnl3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 214, -1));

        jButton3.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnl3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 590, 149, 75));

        jButton7.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton7.setText("<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnl3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 170, 74));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exposicao1.jpg"))); // NOI18N
        pnl3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tbpPrincipal.addTab("Spirit e Opportunity", pnl3);

        pnl4.setBackground(new java.awt.Color(255, 55, 51));
        pnl4.setPreferredSize(new java.awt.Dimension(1920, 1080));
        pnl4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Seguindo a premissa de seus antecessores a missão do veículo robótico Curiosity é rastrear água, uma vez que água é o principal \ningrediente para haver vida e sua missão foi exatamente essa a de responder se o planeta vermelho (Marte) teve condições ambientais \nadequadas para manter formas de vida chamada microbiais.\nO Curiosity foi designado a caçar por ambientes adequados para se ter vida bem como moléculas de carbono pois se houve vida em \nMarte no passado ela teria sido em forma de micróbios.\nPara que a missão fosse um sucesso ele foi projetado com uma gama de instrumentos tais estes científicos (câmeras), instrumentos de \ncontato (braço) com espectômetro, sistema de análise de laboratório além de instrumentos de verificação do ambiente. Era considerado \num veículo de médio/grande porte medindo cerca 2 metros de comprimento por 2,8 metros de largura e com altura de 2,1 metros com \npeso aproximadamente de 900 kilogramas.\nSendo o Curiosity o veículo robótico mais capacitado já enviado a Marte para responder as questões relacionados ao assunto se o \nplaneta vermelho possui realmente as características necessárias para se ter vida.\nO Curiosity foi lançado com sucesso em 26 de novembro de 2011 em Cabo Canaveral, Califórnia em um foguete Atlas V-541 e sua \nviagem durou cerca de 8 meses até chegar a Marte exatamente em Gale Crater pousando em segurança.\n");
        jScrollPane4.setViewportView(jTextArea4);

        pnl4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 1017, 292));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem5300x300.png"))); // NOI18N
        pnl4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Curiosity");
        pnl4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 44));

        jButton4.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnl4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 420, 123, 74));

        jButton8.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton8.setText("<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnl4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 120, 74));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exposicao1.jpg"))); // NOI18N
        pnl4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tbpPrincipal.addTab("Curiosity", pnl4);

        pnl5.setBackground(new java.awt.Color(255, 55, 51));
        pnl5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Lançado em agosto de 2020 da estação de Cabo Canaveral (EUA) tendo sua chegada em 18 de fevereiro de 2021. O \nintuito do Perseverance no planeta vermelho é coletar dados tais como a geologia do planeta, a atmosfera e os \npotenciais e condições ambientais. Para que todos os dados sejam coletados de forma a garantir fontes confiáveis, o \nPerseverance foi projetado com equipamentos de última geração como câmeras, sensores e equipamentos de análises.\nDando um passo seguinte após outras missões bem-sucedidas, o Perseverance chega para procurar por sinais de vida \nantiga e a evolução climática, superfíciene interior do planeta vermelho (Marte). O Perseverance tem como missão \ncoletar amostras e informações para um futuro uma possível missão de exploração humana. Conforme descrito nos \nartigos da NASA (NASA/JPL) a escolha do local de pouso do Perseverance na cratera Jezero foi por os cientistas \nacreditam que ali foi uma área inundada que abrigou um grande rio, sendo assim, há inúmeras evidências que as águas\ncarregaram minerais argilosos do redor da cratera quando houve o rompimento das paredes e ali se formou um grande\nlago. Se houve realmente vida microbiana nessa região onde possivelmente um lago se formou poderá ser evidenciado \nrestos mortais e isso será possível através dos estudos dos sedimentos ali encontrados. Portanto, o Perseverance tem\ncomo missão também além do estudo se houve vidas passadas como foi a transformação da região e sua evolução. \nEste estudo mais detalhado que será possível com a presença do Perseverance em solo marciano já é uma forma de \npreparação para futura missão com tripulação humana. Sigamos acompanhando os dados da missão quanto a novas\ndescobertas e se realmente um dia Marte será uma colônia que acolherá seres humanos.\n");
        jTextArea5.setAutoscrolls(false);
        jTextArea5.setFocusable(false);
        jTextArea5.setOpaque(false);
        jTextArea5.setRequestFocusEnabled(false);
        jTextArea5.setVerifyInputWhenFocusTarget(false);
        jScrollPane5.setViewportView(jTextArea5);

        pnl5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 998, 331));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem6300x300.png"))); // NOI18N
        pnl5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 350, 240));

        jLabel11.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Perseverance");
        pnl5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, 47));

        jButton5.setText("Voltar para o Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnl5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 470, 236, 63));

        jButton9.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jButton9.setText("<");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnl5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 140, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exposicao1.jpg"))); // NOI18N
        pnl5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tbpPrincipal.addTab("Perseverance", pnl5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tbpPrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tbpPrincipal.setSelectedIndex(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        frmComecar frmC = new frmComecar(null, true);
        frmC.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tbpPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        tbpPrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximo1ActionPerformed
        tbpPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_btnProximo1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tbpPrincipal.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tbpPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tbpPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(frmExposicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmExposicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmExposicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmExposicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmExposicoes dialog = new frmExposicoes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton btnProximo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl5;
    private javax.swing.JScrollPane scp2;
    private javax.swing.JTabbedPane tbpPrincipal;
    // End of variables declaration//GEN-END:variables
}
