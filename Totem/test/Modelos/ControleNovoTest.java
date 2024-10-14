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

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lrossi
 */
public class ControleNovoTest
{

    public ControleNovoTest()
    {
    }

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    public void setUp()
    {
    }

    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of CadastrarResposta method, of class ControleNovo.
     */
    @Test
    public void testCadastrarResposta()
    {
        System.out.println("CadastrarResposta");
        UsuariosNovo Usuario = null;
        ControleNovo instance = new ControleNovo();
        instance.CadastrarResposta(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarPontos method, of class ControleNovo.
     */
    @Test
    public void testVerificarPontos()
    {
        System.out.println("VerificarPontos");
        UsuariosNovo usuario = new UsuariosNovo();

        var respostas = new ArrayList<String>();
        usuario.setNome("Carlos");
        respostas.add("LUCAS");
        respostas.add("SIM");
        respostas.add("SIM");
        respostas.add("a");
        respostas.add("c");
        respostas.add("c");

        usuario.setRespostas(respostas);

        ControleNovo instance = new ControleNovo();
        instance.VerificarPontos(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
