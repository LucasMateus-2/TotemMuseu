/*
 * The MIT License
 *
 * Copyright 2024 lrossi.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Modelos;

import java.util.List;

/**
 *
 * @author lrossi
 */
public class ControleNovo
{

    private String mensagem;

    public void CadastrarResposta(UsuariosNovo usuario)
    {
        this.mensagem = "";
        ValidacaoNovo validacao = new ValidacaoNovo();
        validacao.ValidarUsuarios(usuario);
        this.mensagem = validacao.mensagem;
        if (this.mensagem.equals(""))
        {
            EstaticosNovo.DatabaseUsuarios.add(usuario);
        }

    }

    public void VerificarPontos(UsuariosNovo usuario)
    {
        if (this.mensagem.equals(""))
        {
            var pontos = 0;
            var contador = 0;

            for (String resposta : usuario.getRespostas())
            {
                contador++;
                if (resposta.equals("SIM") && contador == 1)
                {
                    pontos++;
                }
                if (resposta.equals("SIM") && contador == 2)
                {
                    pontos++;
                }
                if (resposta.equals("a") && contador == 3)
                {
                    pontos++;
                }
                if (resposta.equals("a") && contador == 4)
                {
                    pontos++;
                }
                if (resposta.equals("c") && contador == 5)
                {
                    pontos++;
                }
            }
            var ultimoUsuarioAdicionado = EstaticosNovo.DatabaseUsuarios.size() - 1;
            EstaticosNovo.DatabaseUsuarios.get(ultimoUsuarioAdicionado).setPontos(pontos);

        }
        /* Estaticos.REPOSTAS.add("SIM");
        Estaticos.REPOSTAS.add("SIM");
        Estaticos.REPOSTAS.add("a");
        Estaticos.REPOSTAS.add("a");
        Estaticos.REPOSTAS.add("c"); */
    }
}
