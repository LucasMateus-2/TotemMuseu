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
public class ValidacaoNovo
{

    public String mensagem;
    public List<UsuariosNovo> Usuarios;
    private String resposta;

    public void ValidarUsuarios(UsuariosNovo usuario)
    {
        this.mensagem = "";

        /*Valida o nome*/
        if (usuario.getNome().length() < 3)
        {
            this.mensagem += "Nome deve ter Mais que 3 caracteres \n";
        }
        /*Valida respostas*/
        ValidarRespostas(usuario.getRespostas());

    }

    private void ValidarRespostas(List<String> ListaRespostasUsuarios)
    {
        this.mensagem = "";
        try
        {
            for (String resposta : ListaRespostasUsuarios)
            {
                if (resposta.length() < 1)
                {
                    this.mensagem += "A reposta da " + resposta + "não pode ser vazia \n";
                }
            }
        } catch (Exception e)
        {
            mensagem = e.getMessage();
        }

    }

}
